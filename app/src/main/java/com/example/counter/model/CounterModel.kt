package com.example.counter.model

import android.widget.Toast
import com.example.counter.MainActivity
import com.example.counter.view.CounterView

class CounterModel {
    var count = 0

    fun increment(){
        ++count
    }
    fun decrement(){
        --count
    }
}