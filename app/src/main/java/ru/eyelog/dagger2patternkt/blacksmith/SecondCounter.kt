package ru.eyelog.dagger2patternkt.blacksmith

import javax.inject.Inject

class SecondCounter @Inject constructor() {
    fun getValue() = (0..10).random()
}