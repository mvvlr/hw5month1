package com.example.hw5month1

import com.example.hw5month1.model.CountrerModel
import com.example.hw5month1.presenter.Presenter

class injector {
    companion object{
        fun getPresenter(): Presenter{
            return Presenter()
        }
        fun getModel(): CountrerModel{
            return CountrerModel()
        }
    }

}