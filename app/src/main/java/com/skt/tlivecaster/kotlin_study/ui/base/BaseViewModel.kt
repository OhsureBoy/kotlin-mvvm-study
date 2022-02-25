package com.skt.tlivecaster.kotlin_study.ui.base

import androidx.lifecycle.ViewModel
import com.skt.tlivecaster.kotlin_study.usecase.errors.ErrorManager
import javax.inject.Inject

abstract class BaseViewModel : ViewModel() {
    /**Inject Singleton ErrorManager
     * Use this errorManager to get the Errors
     */
    @Inject
    lateinit var errorManager: ErrorManager
}