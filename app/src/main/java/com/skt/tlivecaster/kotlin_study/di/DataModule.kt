package com.skt.tlivecaster.kotlin_study.di

import com.skt.tlivecaster.kotlin_study.data.DataRepository
import com.skt.tlivecaster.kotlin_study.data.DataRepositorySource
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class DataModule {
    @Binds
    @Singleton
    abstract fun provideDataRepository(dataRepository: DataRepository): DataRepositorySource
}