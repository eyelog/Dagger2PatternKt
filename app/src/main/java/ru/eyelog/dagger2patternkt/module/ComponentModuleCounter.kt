package ru.eyelog.dagger2patternkt.module

import dagger.Component

@Component(modules = [ModuleModule::class])
interface ComponentModuleCounter {

    fun inject(activity: ActivityModule)
}