package ru.eyelog.dagger2patternkt.blacksmith

import javax.inject.Inject

class MainCounter @Inject constructor(private val firstCounter: FirstCounter) {
    fun getDecide(a: Int, b: Int): String {
        return ((a + b) * firstCounter.getWay()).toString()
    }
}