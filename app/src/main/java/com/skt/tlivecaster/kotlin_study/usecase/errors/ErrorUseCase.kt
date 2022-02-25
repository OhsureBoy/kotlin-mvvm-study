package com.skt.tlivecaster.kotlin_study.usecase.errors

import com.skt.tlivecaster.kotlin_study.data.error.Error

interface ErrorUseCase {
    fun getError(errorCode: Int): Error
}
