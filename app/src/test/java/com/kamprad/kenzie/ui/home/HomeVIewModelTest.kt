package com.kamprad.kenzie.ui.home

import com.kamprad.kenzie.ui.main.HomeViewModel
import junit.framework.TestCase.assertEquals
import org.junit.Test

class HomeVIewModelTest {
    private val homeViewModel = HomeViewModel()

    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
        assert(homeViewModel.calculate() == 4)
    }
}
