package com.verindrarizya.qluetechnical

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {

    private val _result: MutableLiveData<String> = MutableLiveData()
    val result: LiveData<String>
        get() = _result

    private val _isNotValid: MutableLiveData<Boolean> = MutableLiveData()
    val isNotValid: LiveData<Boolean>
        get() = _isNotValid

}