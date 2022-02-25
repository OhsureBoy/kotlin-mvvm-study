package com.skt.tlivecaster.kotlin_study.ui.component.splash

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.activity.viewModels
import com.skt.tlivecaster.kotlin_study.SPLASH_DELAY
import com.skt.tlivecaster.kotlin_study.databinding.SplashLayoutBinding
import com.skt.tlivecaster.kotlin_study.ui.base.BaseActivity
import com.skt.tlivecaster.kotlin_study.ui.component.login.LoginActivity

import dagger.hilt.android.AndroidEntryPoint

/**
 * Created by AhmedEltaher
 */
@AndroidEntryPoint
class SplashActivity : BaseActivity(){

    private lateinit var binding: SplashLayoutBinding

    override fun initViewBinding() {
        binding = SplashLayoutBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        navigateToMainScreen()
    }

    override fun observeViewModel() {
    }

    private fun navigateToMainScreen() {
        Handler().postDelayed({
            val nextScreenIntent = Intent(this, LoginActivity::class.java)
            startActivity(nextScreenIntent)
            finish()
        }, SPLASH_DELAY.toLong())
    }
}
