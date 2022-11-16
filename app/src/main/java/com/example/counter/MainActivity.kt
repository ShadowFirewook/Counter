package com.example.counter

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.counter.databinding.ActivityMainBinding
import com.example.counter.presenter.Presenter
import com.example.counter.view.CounterView

class MainActivity : AppCompatActivity(),CounterView {
    private lateinit var binding: ActivityMainBinding
    var presenter = Presenter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initClicker()
        presenter.attachView(this)

    }
    private fun initClicker(){
            with(binding){
                btnPlus.setOnClickListener {
                    presenter.increment()
                }
                btnMinus.setOnClickListener {
                    presenter.decrement()
                }
            }
    }

    override fun updateCount(count: Int) {
        binding.result.text = count.toString()
    }

    override fun showToast() {
      Toast.makeText(this,"Поздравляем!",Toast.LENGTH_LONG).show()
    }

    override fun changeColor() {
        binding.result.setTextColor(Color.GREEN)
    }
}