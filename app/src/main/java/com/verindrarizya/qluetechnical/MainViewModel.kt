package com.verindrarizya.qluetechnical

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.verindrarizya.qluetechnical.util.ArrayUtil

class MainViewModel: ViewModel() {

    private val _result: MutableLiveData<String> = MutableLiveData()
    val result: LiveData<String>
        get() = _result

    private val _isNotValid: MutableLiveData<Boolean> = MutableLiveData()
    val isNotValid: LiveData<Boolean>
        get() = _isNotValid

    fun sort(str: String) {
        val arr = ArrayUtil.stringToArray(str)

        if (arr == null) {
            _isNotValid.value = true
            return
        } else {
            _isNotValid.value = false
        }

        val sortedValue = ArrayUtil.sort(arr)
        _result.value = ArrayUtil.arrayToString(sortedValue)
    }

    fun multiply(str: String) {
        val arr = ArrayUtil.stringToArray(str)

        if (arr == null) {
            _isNotValid.value = true
            return
        } else {
            _isNotValid.value = false
        }

        val multipliedValue = ArrayUtil.multiply(arr)
        _result.value = ArrayUtil.arrayToString(multipliedValue)
    }

    fun addAndSubtract(str: String) {
        val arr = ArrayUtil.stringToArray(str)

        if (arr == null) {
            _isNotValid.value = true
            return
        } else {
            _isNotValid.value = false
        }

        val addAndSubtractedValue = ArrayUtil.addAndSubtract(arr)
        _result.value = ArrayUtil.arrayToString(addAndSubtractedValue)
    }

}