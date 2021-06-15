package com.gtaskmanager.viewmodelworking

import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {
    var counter: Int = 0

    fun increment(){
        counter++
    }

    fun decrement(){
        counter--
    }
}