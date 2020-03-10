package ru.eyelog.dagger2patternkt.singleton

import dagger.Component
import javax.inject.Singleton

@Component(modules = [ModuleSingleton::class])
@Singleton
interface ComponentSingletonCounter {

    fun inject(activity: ActivitySingleton)
}