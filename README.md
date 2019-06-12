# Foco

This code is a simple test to the MotionLayout and how we could apply it.

# Tech/framework used

Here I used the MotionLayout from Google, Kotlin and the project *androidx.*. 

# Installation

1. Installed the last ConstraintLayout available:
```groovy
implementation 'androidx.constraintlayout:constraintlayout:2.0.0-beta1'
```
2. I created the MotionLayout inside the ConstraintLayout (you can create the MotionLayout as the complete activity, since MotionLayout is a ConstraintLayout child):
```xml
<androidx.constraintlayout.widget.ConstraintLayout
        android:layout_height="match_parent"
        android:layout_width="match_parent"
        xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:app="http://schemas.android.com/apk/res-auto">
        ...
        <androidx.constraintlayout.motion.widget.MotionLayout
            xmlns:tools="http://schemas.android.com/tools"
            android:id="@+id/motionLayout"
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            app:layoutDescription="@xml/scene_01"
            tools:showPaths="true">
```
3. Then we have to create the scene (MotionScene):
```xml
<MotionScene xmlns:android="http://schemas.android.com/apk/res/android"
             xmlns:motion="http://schemas.android.com/apk/res-auto">
...
```
