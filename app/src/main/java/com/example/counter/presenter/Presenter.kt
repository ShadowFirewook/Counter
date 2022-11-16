package com.example.counter.presenter

import com.example.counter.model.CounterModel
import com.example.counter.view.CounterView

class Presenter {
    private val model = CounterModel()
    lateinit var view:CounterView
    fun increment(){
        model.increment()
        view.updateCount(model.count)
        if (model.count == 10)
            view.showToast()
        if (model.count == 15)
            view.changeColor()
    }
    fun decrement(){
        model.decrement()
        view.updateCount(model.count)
    }
    fun attachView(view: CounterView){
        this.view = view
    }
}