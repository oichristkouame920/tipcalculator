package com.example.tipcalculator

import org.junit.Assert.assertEquals
import org.junit.Test
import java.text.NumberFormat

class TipCalculatorTests {

    @Test
    fun calculateTip_20PercentNoRoundUp() {
        val amount = 10.00
        val tipPercent = 20.00
        val expectedTip = NumberFormat.getCurrencyInstance().format(2)
        val actualTip = calculateTip(amount = amount, tipPercent = tipPercent, roundUp = false)
        assertEquals(expectedTip, actualTip)
    }

    @Test
    fun calculateTip_15PercentWithRoundUp() {
        // 15 % de 10 = 1,50 -> arrondi à 2
        val expectedTip = NumberFormat.getCurrencyInstance().format(2)
        val actualTip = calculateTip(amount = 10.00, tipPercent = 15.00, roundUp = true)
        assertEquals(expectedTip, actualTip)
    }

    @Test
    fun calculateTip_zeroAmount() {
        val expectedTip = NumberFormat.getCurrencyInstance().format(0)
        val actualTip = calculateTip(amount = 0.0, tipPercent = 20.0, roundUp = false)
        assertEquals(expectedTip, actualTip)
    }
}
