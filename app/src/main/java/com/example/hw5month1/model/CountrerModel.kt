package com.example.hw5month1.model
import android.content.Context
import android.widget.Toast
class CountrerModel {


    private var count = 0

    fun increment(){
        count++
    }
    fun dicrement(){
        count--
    }
    fun getCount(): Int{
        return count
    }
}