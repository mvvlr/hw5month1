package com.example.hw5month1.presenter

import com.example.hw5month1.view.CounterView
import com.example.hw5month1.injector

class Presenter {

    lateinit var view: CounterView
    private val model = injector.getModel()

    fun increment(){
        model.increment()
        view.updateCount(model.getCount().toString())
        if (model.getCount()==10){
            view.showToastPlus("Поздравляю у вас 10")

            if (model.getCount()==15){
                view.showGreenPlus()
            }
        }
    }

    fun decrement(){
        model.dicrement()
        view.updateCount(model.getCount().toString())
    }

    fun attachView(view: CounterView) {
        this.view=view
    }


}
