package com.verindrarizya.qluetechnical.util

import org.junit.Assert.*

import org.junit.Test

class ArrayUtilTest {

    @Test
    fun isListOfInt_ShouldReturnTrue() {
        val arr = listOf<Int>(1, 2, 3, 4, 5,)

        val result = ArrayUtil.isListOfInt(arr)

        assertEquals(result, true)
    }

    @Test
    fun isListOfInt_ShouldReturnFalse() {
        val arr = listOf("a", "b", "c", "d", "e")

        val result = ArrayUtil.isListOfInt(arr)

        assertEquals(result, false)
    }

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

}