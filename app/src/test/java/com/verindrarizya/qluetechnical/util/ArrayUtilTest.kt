package com.verindrarizya.qluetechnical.util

import org.junit.Assert.*

import org.junit.Test

class ArrayUtilTest {

    @Test
    fun sort_ShouldReturnSortedArrayValue() {
        val arr = arrayOf(1, 6, 3, 5, 8, 7, 4, 20)
        val expectedValue = arrayOf(1, 3, 4, 5, 6, 7, 8, 20)

        val result = ArrayUtil.sort(arr)

        assertArrayEquals(result, expectedValue)
    }

    @Test
    fun multiply_ShouldReturnMultipliedArrayValue() {
        val arr = arrayOf(1, 2, 3, 4, 5, 6)
        val expectedValue = arrayOf(6, 10, 12, 12, 10, 6)

        val result = ArrayUtil.multiply(arr)

        assertArrayEquals(result, expectedValue)
    }

    @Test
    fun addAndSubtract_ShouldReturnAddAndSubtractArrayValue() {
        val arr = arrayOf(10, 33, 13, 72, 44, 51, 17)
        val expectedValue = arrayOf(43, 20, 85, 28, 95, 34)

        val result = ArrayUtil.addAndSubtract(arr)

        assertArrayEquals(result, expectedValue)
    }

    @Test
    fun stringToArrayInt_ShouldReturnCorrectValue() {
        val str = "1 2 3 4 5"
        val expectedValue = arrayOf(1, 2, 3, 4, 5)

        val result = ArrayUtil.stringToArray(str)

        assertArrayEquals(result, expectedValue)
    }

    @Test
    fun arrayToString_ShouldReturnCorrectValue() {
        val arr = arrayOf(1, 2, 3, 4, 5)
        val expectedValue = "1, 2, 3, 4, 5"

        val result = ArrayUtil.arrayToString(arr)

        assertEquals(result, expectedValue)
    }

}