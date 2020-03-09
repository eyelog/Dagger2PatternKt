package ru.eyelog.dagger2patternkt.module

import dagger.Module
import dagger.Provides
import ru.eyelog.dagger2patternkt.blacksmith.FirstCounter
import ru.eyelog.dagger2patternkt.blacksmith.MainCounter
import ru.eyelog.dagger2patternkt.blacksmith.SecondCounter

@Module
class ModuleCounter {
    @Provides
    fun provideSecondCounter(): SecondCounter {
        return SecondCounter()
    }
    @Provides
    fun provideFirstCounter(secondCounter: SecondCounter): FirstCounter {
        return FirstCounter(secondCounter)
    }
    @Provides
    fun provideMainCounter(firstCounter: FirstCounter): MainCounter {
        return MainCounter(firstCounter)
    }
}