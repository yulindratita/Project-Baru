package com.titacolls.app.ui.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.titacolls.app.R
import com.titacolls.app.databinding.ActivityAuthBinding
import com.titacolls.app.databinding.ActivityMainBinding
import com.titacolls.app.ui.auth.AuthActivity
import com.titacolls.app.ui.auth.TitaCollsAuth

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =  DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.buttonLogout.setOnClickListener {
            TitaCollsAuth.logout(this) {
                startActivity(Intent(this, AuthActivity::class.java))
                finish()
            }
        }
    }
}