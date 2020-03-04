package ru.eyelog.dagger2patternkt.blacksmith

import javax.inject.Inject

class FirstCounter @Inject constructor (private val secondCounter: SecondCounter) {
    val decide = if(secondCounter.secondValue > 5){
        1
    }else{
        -1
    }
}