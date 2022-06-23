package me.dio.githubsearchrepository

import android.app.Application
import br.com.dio.app.repositories.domain.di.DomainModule
import me.dio.githubsearchrepository.presentation.di.PresentationModule
import me.dio.githubsearchrepository.data.di.DataModule

import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
        }

        DataModule.load()
        DomainModule.load()
        PresentationModule.load()
    }
}