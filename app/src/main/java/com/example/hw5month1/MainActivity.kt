package com.example.hw5month1

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hw5month1.databinding.ActivityMainBinding
import com.example.hw5month1.presenter.Presenter
import com.example.hw5month1.view.CounterView

class MainActivity : AppCompatActivity(), CounterView{
    lateinit var binding : ActivityMainBinding
    var count = 0
    var presenter = Presenter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        presenter = injector.getPresenter()
        presenter.attachView(this)
        setContentView(binding.root)
        initClicker()
    }

    private fun initClicker() {
        with(binding){

        }
        binding.increment.setOnClickListener {
            presenter.increment()
        }
        binding.dicrement.setOnClickListener {
           presenter.decrement()
        }
    }


    override fun updateCount(count: String) {
        binding.counterView.text = count.toString()
    }

    override fun showToastPlus(s: String) {
         showToastPlus("Поздравляю у вас 10")
    }

    override fun showGreenPlus() {
        binding.counterView.setBackgroundColor(Color.GREEN)
    }

}