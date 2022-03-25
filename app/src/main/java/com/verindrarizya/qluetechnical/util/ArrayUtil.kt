package com.verindrarizya.qluetechnical.util

object ArrayUtil {
    fun isListOfInt(arr: List<Any>): Boolean {
        val newArr = arr.filterIsInstance<Int>()

        return newArr.size == arr.size
    }

    fun sort(arr: Array<Int>): Array<Int> {
        val length = arr.size - 1

        for (i in 0..length) {
            for (j in 0..length - 1 - i) {
                if (arr[j] > arr[j + 1]) {
                    val temp = arr[j + 1]
                    arr[j + 1] = arr[j]
                    arr[j] = temp
                }
            }
        }

        return arr
    }
}