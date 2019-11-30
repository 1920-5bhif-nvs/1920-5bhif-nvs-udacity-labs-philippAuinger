# :computer: Entwicklung von Android Apps mit diesem [Kurs](https://classroom.udacity.com/courses/ud9012)
#### Philipp Auinger, 5BHIF

## :clipboard: Inhaltsverzeichnis
 - [Lesson 1](https://github.com/1920-5bhif-nvs/1920-5bhif-nvs-udacity-labs-philippAuinger#lesson-1)
 - [Lesson 2](https://github.com/1920-5bhif-nvs/1920-5bhif-nvs-udacity-labs-philippAuinger#lesson-2)
 - [Lesson 3](https://github.com/1920-5bhif-nvs/1920-5bhif-nvs-udacity-labs-philippAuinger#lesson-3)
 - [Lesson 4](https://github.com/1920-5bhif-nvs/1920-5bhif-nvs-udacity-labs-philippAuinger#lesson-4)
 - [Lesson 5](https://github.com/1920-5bhif-nvs/1920-5bhif-nvs-udacity-labs-philippAuinger#lesson-5)
 - [Lesson 6](https://github.com/1920-5bhif-nvs/1920-5bhif-nvs-udacity-labs-philippAuinger#lesson-6)
 
## Dokumentation
Ein Bild sagt mehr als tausend Worte.
### Lesson 1
Inflation
![alt text](https://github.com/1920-5bhif-nvs/1920-5bhif-nvs-udacity-labs-philippAuinger/blob/master/Images/inflation.png)      

### Lesson 2
Data Binding     
![alt text](https://github.com/1920-5bhif-nvs/1920-5bhif-nvs-udacity-labs-philippAuinger/blob/master/Images/databinding.png)      

Constraints     
![alt text](https://github.com/1920-5bhif-nvs/1920-5bhif-nvs-udacity-labs-philippAuinger/blob/master/Images/constraints.png)      

### Lesson 3
Navigation Component     
![alt text](https://github.com/1920-5bhif-nvs/1920-5bhif-nvs-udacity-labs-philippAuinger/blob/master/Images/NavigationComponent.png)      

![alt text](https://github.com/1920-5bhif-nvs/1920-5bhif-nvs-udacity-labs-philippAuinger/blob/master/Images/first.png)
![alt text](https://github.com/1920-5bhif-nvs/1920-5bhif-nvs-udacity-labs-philippAuinger/blob/master/Images/second.png)
![alt text](https://github.com/1920-5bhif-nvs/1920-5bhif-nvs-udacity-labs-philippAuinger/blob/master/Images/third.png)

Explicit vs Implicit Intents         
![alt text](https://github.com/1920-5bhif-nvs/1920-5bhif-nvs-udacity-labs-philippAuinger/blob/master/Images/explicitVsImplicit.png)   
### Lesson 4

Lifecycle of a Application         
![alt text](https://github.com/1920-5bhif-nvs/1920-5bhif-nvs-udacity-labs-philippAuinger/blob/master/Images/lifecycle.png)      

Observer Pattern      
![alt text](https://github.com/1920-5bhif-nvs/1920-5bhif-nvs-udacity-labs-philippAuinger/blob/master/Images/observer.png) 

Observer Pattern specific for our App:       
![alt text](https://github.com/1920-5bhif-nvs/1920-5bhif-nvs-udacity-labs-philippAuinger/blob/master/Images/observerForApp.png)     

OnSaveInstanceState: Method that saves Data when app gets destroyed
![alt text](https://github.com/1920-5bhif-nvs/1920-5bhif-nvs-udacity-labs-philippAuinger/blob/master/Images/onSaveInstanceState.png)     

#### Implementation:         
Daten abspeichern:       
![alt text](https://github.com/1920-5bhif-nvs/1920-5bhif-nvs-udacity-labs-philippAuinger/blob/master/Images/save.PNG)          
Die benützten KEYS:        
![alt text](https://github.com/1920-5bhif-nvs/1920-5bhif-nvs-udacity-labs-philippAuinger/blob/master/Images/keys.PNG)            
Daten wiederherstellen:       
![alt text](https://github.com/1920-5bhif-nvs/1920-5bhif-nvs-udacity-labs-philippAuinger/blob/master/Images/restore.PNG)   
           

Nun bleiben auch nach dem Crash der App oder nach dem drehen des Smartphones in den Landscape-Mode, die Daten gespeichert.

### Lesson 5

Die Architektur die wir für diese App benützen:       
![alt text](https://github.com/1920-5bhif-nvs/1920-5bhif-nvs-udacity-labs-philippAuinger/blob/master/Images/viewModel.png)         
Einge genauere Betrachtung:       
![alt text](https://github.com/1920-5bhif-nvs/1920-5bhif-nvs-udacity-labs-philippAuinger/blob/master/Images/genauererBetrachtung.png)          

LiveData (wie das Observer-Pattern):       
![alt text](https://github.com/1920-5bhif-nvs/1920-5bhif-nvs-udacity-labs-philippAuinger/blob/master/Images/liveData.png)      

Encapsulation:           
![alt text](https://github.com/1920-5bhif-nvs/1920-5bhif-nvs-udacity-labs-philippAuinger/blob/master/Images/encapsulation.png)   

### Lesson 6 
Entity in Android: 
```
package com.example.android.trackmysleepquality.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "daily_sleep_quality_table")
data class SleepNight(
        @PrimaryKey(autoGenerate = true)
        var nightId: Long = 0L,
        @ColumnInfo(name = "start_time_milli")
        var startTimeMilli: Long = System.currentTimeMillis(),
        @ColumnInfo(name = "end_time_milli")
        var endTimeMilli: Long = System.currentTimeMillis(),
        @ColumnInfo(name = "quality_rating")
        var sleepQuality: Int = -1
)
```

DAO: 
![alt text](https://github.com/1920-5bhif-nvs/1920-5bhif-nvs-udacity-labs-philippAuinger/blob/master/Images/DAO.png) 


## Branch clonen
```
 git clone --single-branch --branch <branchname> <remote-repo>
```
