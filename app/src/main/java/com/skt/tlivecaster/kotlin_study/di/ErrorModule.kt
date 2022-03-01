package com.skt.tlivecaster.kotlin_study.di

import com.skt.tlivecaster.kotlin_study.data.error.mapper.ErrorMapper
import com.skt.tlivecaster.kotlin_study.data.error.mapper.ErrorMapperSource
import com.skt.tlivecaster.kotlin_study.usecase.errors.ErrorManager
import com.skt.tlivecaster.kotlin_study.usecase.errors.ErrorUseCase
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class ErrorModule {
    @Binds
    @Singleton
    abstract fun provideErrorFactoryImpl(errorManager: ErrorManager): ErrorUseCase

    @Binds
    @Singleton
    abstract fun provideErrorMapper(errorMapper: ErrorMapper): ErrorMapperSource
}