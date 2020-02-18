# :computer: Entwicklung von Android Apps mit diesem [Kurs](https://classroom.udacity.com/courses/ud9012)
#### Philipp Auinger, 5BHIF

## :clipboard: Inhaltsverzeichnis
 - [Lesson 1](https://github.com/1920-5bhif-nvs/1920-5bhif-nvs-udacity-labs-philippAuinger#lesson-1)
 - [Lesson 2](https://github.com/1920-5bhif-nvs/1920-5bhif-nvs-udacity-labs-philippAuinger#lesson-2)
 - [Lesson 3](https://github.com/1920-5bhif-nvs/1920-5bhif-nvs-udacity-labs-philippAuinger#lesson-3)
 - [Lesson 4](https://github.com/1920-5bhif-nvs/1920-5bhif-nvs-udacity-labs-philippAuinger#lesson-4)
 - [Lesson 5](https://github.com/1920-5bhif-nvs/1920-5bhif-nvs-udacity-labs-philippAuinger#lesson-5)
 - [Lesson 6](https://github.com/1920-5bhif-nvs/1920-5bhif-nvs-udacity-labs-philippAuinger#lesson-6)
 - [Lesson 7](https://github.com/1920-5bhif-nvs/1920-5bhif-nvs-udacity-labs-philippAuinger#lesson-7)
 - [Lesson 8](https://github.com/1920-5bhif-nvs/1920-5bhif-nvs-udacity-labs-philippAuinger#lesson-8)
 - [Lesson 9](https://github.com/1920-5bhif-nvs/1920-5bhif-nvs-udacity-labs-philippAuinger#lesson-9)
 
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

```
@Dao
interface SleepDatabaseDao{
    @Insert
    fun insert(night: SleepNight)

    @Update
    fun update(night: SleepNight)

    @Query("SELECT * from daily_sleep_quality_table WHERE nightId = :key")
    fun get(key: Long): SleepNight?

    @Query("DELETE FROM daily_sleep_quality_table")
    fun clear()

    @Query("SELECT * FROM daily_sleep_quality_table ORDER BY nightId DESC")
    fun getAllNights(): LiveData<List<SleepNight>>

    @Query("SELECT * FROM daily_sleep_quality_table ORDER BY nightId DESC LIMIT 1")
    fun getTonight(): SleepNight?
}
```

![alt text](https://github.com/1920-5bhif-nvs/1920-5bhif-nvs-udacity-labs-philippAuinger/blob/master/Images/coroutines.png)         

![alt text](https://github.com/1920-5bhif-nvs/1920-5bhif-nvs-udacity-labs-philippAuinger/blob/master/Images/work.png)      

![alt text](https://github.com/1920-5bhif-nvs/1920-5bhif-nvs-udacity-labs-philippAuinger/blob/master/Images/recap.png)    

### Lesson 7
![alt text](https://github.com/1920-5bhif-nvs/1920-5bhif-nvs-udacity-labs-philippAuinger/blob/master/Images/RecyclerView.png)     
 
![alt text](https://github.com/1920-5bhif-nvs/1920-5bhif-nvs-udacity-labs-philippAuinger/blob/master/Images/OtherViews.png)    

#### Adapter Overview
![alt text](https://github.com/1920-5bhif-nvs/1920-5bhif-nvs-udacity-labs-philippAuinger/blob/master/Images/Adapter.png)    

![alt text](https://github.com/1920-5bhif-nvs/1920-5bhif-nvs-udacity-labs-philippAuinger/blob/master/Images/DiffUtil.png)    

#### Now with Databinding
![alt text](https://github.com/1920-5bhif-nvs/1920-5bhif-nvs-udacity-labs-philippAuinger/blob/master/Images/nowWithDatabinding.png)    

#### Start with GridLayout
![alt text](https://github.com/1920-5bhif-nvs/1920-5bhif-nvs-udacity-labs-philippAuinger/blob/master/Images/GridLayout.png)       

![alt text](https://github.com/1920-5bhif-nvs/1920-5bhif-nvs-udacity-labs-philippAuinger/blob/master/Images/routine.png)       

### Lesson 8
![alt text](https://github.com/1920-5bhif-nvs/1920-5bhif-nvs-udacity-labs-philippAuinger/blob/master/Images/rest.png)     
![alt text](https://github.com/1920-5bhif-nvs/1920-5bhif-nvs-udacity-labs-philippAuinger/blob/master/Images/library.png)     

Um aufs Internet zugreifen zu können: 
```
    <uses-permission android:name="android.permission.INTERNET"></uses-permission>     
```
im AndroidManifest.xml adden.     

![alt text](https://github.com/1920-5bhif-nvs/1920-5bhif-nvs-udacity-labs-philippAuinger/blob/master/Images/permissions.png)     

Referenzen vergleichen:
```
===
```
Content vergleichen: 
```
==
```
![alt text](https://github.com/1920-5bhif-nvs/1920-5bhif-nvs-udacity-labs-philippAuinger/blob/master/Images/parcel.png)     

### Lesson 9
Working with offline caching.

![alt text](https://github.com/1920-5bhif-nvs/1920-5bhif-nvs-udacity-labs-philippAuinger/blob/master/Images/files.png)    

![alt text](https://github.com/1920-5bhif-nvs/1920-5bhif-nvs-udacity-labs-philippAuinger/blob/master/Images/storeData.png) 

![alt text](https://github.com/1920-5bhif-nvs/1920-5bhif-nvs-udacity-labs-philippAuinger/blob/master/Images/daoCache.png) 

Room.kt -> Foundation

Wir nutzen ein Repository. Als "Zwischenelement", so ist es egal von wo die Daten kommen.
(Database, Cache, usw.) 

![alt text](https://github.com/1920-5bhif-nvs/1920-5bhif-nvs-udacity-labs-philippAuinger/blob/master/Images/workManager.png) 

Workmanager beschränken die "Arbeit", also zum Beispiel wird nur etwas runtergeladen wenn das Gerät ladet und mit dem WIFI verbunden ist. 
## Branch clonen
```
 git clone --single-branch --branch <branchname> <remote-repo>
```
