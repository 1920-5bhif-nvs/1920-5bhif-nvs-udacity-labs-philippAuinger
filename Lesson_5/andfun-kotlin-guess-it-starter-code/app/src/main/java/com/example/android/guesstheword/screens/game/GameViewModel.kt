package com.example.android.guesstheword.screens.game

import android.os.CountDownTimer
import android.text.format.DateUtils
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel

class GameViewModel : ViewModel() {

    companion object {
        // These represent different important times
        // This is when the game is over
        const val DONE = 0L
        // This is the number of milliseconds in a second
        const val ONE_SECOND = 1000L
        // This is the total time of the game
        const val COUNTDOWN_TIME = 10000L
    }

    private val timer: CountDownTimer

    private val _currentTime = MutableLiveData<Long>()

    val currentTime: LiveData<Long>
        get() = _currentTime

    //Encapsulation
    // now you can't change the value of score or word on the outisde, because only
    //LiveData<Int> is reachable from the outside, (so its not mutable).

    // The current word
    private val _word = MutableLiveData<String>()

    val word: LiveData<String>
        get() = _word

    // The current score
    private val _score = MutableLiveData<Int>()

    val score: LiveData<Int>
        get() = _score


    private val _eventGameFinish = MutableLiveData<Boolean>()
    val eventGameFinish: LiveData<Boolean>
        get() = _eventGameFinish

    val currentTimeString = Transformations.map(currentTime, { time ->
        DateUtils.formatElapsedTime(time)
    })

    // The list of words - the front of the list is the next word to guess
    private lateinit var wordList: MutableList<String>

    init{
        Log.i("GameViewModel", "GameViewModel created!")
        resetList()
        nextWord()

        timer = object : CountDownTimer(COUNTDOWN_TIME, ONE_SECOND) {

            override fun onTick(millisUntilFinished: Long) {
                // TODO implement what should happen each tick of the timer
                _currentTime.value = (millisUntilFinished / ONE_SECOND)
            }

            override fun onFinish() {
                // TODO implement what should happen when the timer finishes
                _currentTime.value = DONE
                _eventGameFinish.value = true

            }
        }

        timer.start()
        _score.value = 0
        //_currentTime.value = 0
    }

    override fun onCleared() {
        super.onCleared()
        Log.i("GameViewModel", "GameViewModel destroyed!")
        timer.cancel()
    }

    /**
     * Moves to the next word in the list
     */


    /**
     * Resets the list of words and randomizes the order
     */
    private fun resetList() {
        wordList = mutableListOf(
                "queen",
                "hospital",
                "basketball",
                "cat",
                "change",
                "snail",
                "soup",
                "calendar",
                "sad",
                "desk",
                "guitar",
                "home",
                "railway",
                "zebra",
                "jelly",
                "car",
                "crow",
                "trade",
                "bag",
                "roll",
                "bubble"
        )
        wordList.shuffle()
    }


    private fun nextWord() {
        //Select and remove a word from the list
        if (wordList.isEmpty()) {
            resetList()
        }
        _word.value = wordList.removeAt(0)

    }


    /** Methods for buttons presses **/

    fun onSkip() {
        _score.value = score.value!! - 1
        nextWord()
    }

    fun onCorrect() {
        _score.value = score.value!! + 1
        nextWord()
    }

    fun onGameFinishComplete() {
        _eventGameFinish.value = false
    }
}
