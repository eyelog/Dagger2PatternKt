package ru.eyelog.dagger2patternkt.singleton

import dagger.Module
import dagger.Provides
import ru.eyelog.dagger2patternkt.blacksmith.FirstCounter
import ru.eyelog.dagger2patternkt.blacksmith.MainCounter
import ru.eyelog.dagger2patternkt.blacksmith.SecondCounter
import ru.eyelog.dagger2patternkt.blacksmith.ValuesGenerator
import javax.inject.Singleton

@Module
class ModuleSingleton {

    @Provides
    @Singleton
    fun provideSecondCounter(): SecondCounter {
        return SecondCounter()
    }
    @Provides
    @Singleton
    fun provideFirstCounter(secondCounter: SecondCounter): FirstCounter {
        return FirstCounter(secondCounter)
    }
    @Provides
    @Singleton
    fun provideMainCounter(firstCounter: FirstCounter): MainCounter {
        return MainCounter(firstCounter)
    }
    @Provides
    @Singleton
    fun provideValuesGenerator(): ValuesGenerator {
        return ValuesGenerator()
    }
}