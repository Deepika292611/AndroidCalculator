package com.example.androidcalculator.calculator

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CalculatorViewModel: ViewModel() {
    private val _navigate = MutableLiveData<Boolean>()
    val navigate: LiveData<Boolean>
        get() = _navigate

    fun gotoHistory(){
        _navigate.value=true
    }
    fun setback(){
        _navigate.value=false
    }
    private val _navigate1 = MutableLiveData<Boolean>()
    val navigate1: LiveData<Boolean>
        get() = _navigate1

    fun gotoKeypad(){
        _navigate1.value=true
    }
    fun setbackKeypad(){
        _navigate1.value=false
    }
}