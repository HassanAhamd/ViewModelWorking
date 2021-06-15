package com.gtaskmanager.viewmodelworking

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    lateinit var datashow: TextView
    lateinit var increment: Button
    lateinit var decrement: Button
    lateinit var viewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProvider(this,ViewModelFactory(10)).get(MainViewModel::class.java)
        datashow = findViewById(R.id.datashow)
        increment = findViewById(R.id.btnIncrement)
        decrement = findViewById(R.id.btnDecrement)
        setText()

        increment.setOnClickListener {
            plusplus()
        }
        decrement.setOnClickListener {
            minusminus()
        }


    }
    private fun setText() {
        datashow.text = viewModel.counter.toString()
    }
    private fun plusplus() {
        viewModel.increment()
        setText()
    }
    private fun minusminus() {
       viewModel.decrement()
        setText()
    }

}