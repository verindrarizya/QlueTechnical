package com.verindrarizya.qluetechnical.util

object ArrayUtil {
    fun stringToArray(str: String): Array<Int>? {
        return str.split(" ").map {
            try {
                it.toInt()
            } catch (e: Exception) {
                return null
            }
        }.toTypedArray()
    }

    fun arrayToString(arr: Array<Int>): String {
        var str = ""
        val length = arr.size - 1

        for (i in 0..length) {
            if (i != length) {
                str += "${arr[i]}, "
            } else {
                str += arr[i]
            }
        }

        return str
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

    fun multiply(arr: Array<Int>): Array<Int> {
        val length = arr.size - 1
        val newArr = Array(arr.size) {0}

        for (i in 0..length) {
            println("${arr[i]} * ${arr[length - i]}")
            newArr[i] = arr[i] * arr[length - i]
        }

        return newArr
    }

    fun addAndSubtract(arr: Array<Int>): Array<Int> {
        val length = arr.size - 1
        val newArr = Array(length) {0}

        for (i in 0..length - 1) {
            when {
                i == 0 -> newArr[i] = arr[i] + arr[i +1]
                i % 2 == 0 -> newArr[i] = arr[i] + arr[i + 1]
                i % 2 != 0 -> newArr[i] = arr[i] - arr[i + 1]
            }
        }

        return newArr
    }
}