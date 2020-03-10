package ru.eyelog.dagger2patternkt.component

import dagger.Component
import ru.eyelog.dagger2patternkt.blacksmith.FirstCounter
import ru.eyelog.dagger2patternkt.blacksmith.MainCounter
import ru.eyelog.dagger2patternkt.blacksmith.SecondCounter
import ru.eyelog.dagger2patternkt.blacksmith.ValuesGenerator

@Component
interface CounterComponent {
    fun getSecondCounter(): SecondCounter
    fun getFirstCounter(): FirstCounter
    fun getMainCounter(): MainCounter
    fun getValuesGenerator(): ValuesGenerator
}