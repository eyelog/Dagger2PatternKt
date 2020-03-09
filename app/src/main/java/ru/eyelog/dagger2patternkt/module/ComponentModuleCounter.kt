package ru.eyelog.dagger2patternkt.module

import dagger.Component
import ru.eyelog.dagger2patternkt.blacksmith.MainCounter

@Component(modules = [ModuleCounter::class])
interface ComponentModuleCounter {

    fun provideMainCounter(): MainCounter

    fun inject(activity: ActivityModule)
}