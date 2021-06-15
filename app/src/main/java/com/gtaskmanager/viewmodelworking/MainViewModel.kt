package com.gtaskmanager.viewmodelworking

import androidx.lifecycle.ViewModel

class MainViewModel(val intialValue: Int): ViewModel() {
    var counter: Int = intialValue

    fun increment(){
        counter++
    }

    fun decrement(){
        counter--
    }
}