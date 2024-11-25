package com.example.myapplication

import org.junit.After
import org.junit.Assert
import org.junit.Assume
import org.junit.Before
import org.junit.Test

class CalculationTest {
    var calculation: Calculation? = null

    @Before
    fun before() {
        calculation = Calculation()
    }

    @Test
    fun test_1() {
        Assert.assertEquals(3, calculation?.calc(2,3) ?: 0)
    }

    @Test
    fun test_2() {
        Assert.assertEquals(13, calculation?.calc(2,3) ?: 0)
    }

    @Test
    fun test_3() {
        Assume.assumeNotNull(null)
    }

    @Test(expected = NullPointerException::class)
    fun test_4() {
        //Assert.
        calculation?.let { Assert.assertTrue(it.getStr("null")) }
    }

    @After
    fun after() {
        calculation = null
    }
}