package com.example.counter.view

import android.widget.Toast

interface CounterView {
    fun updateCount(count:Int)
    fun showToast()
    fun changeColor()
}