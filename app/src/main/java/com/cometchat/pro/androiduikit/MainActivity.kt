package com.cometchat.pro.androiduikit

import android.content.Intent
import android.content.res.ColorStateList
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatImageView
import com.cometchat.pro.androiduikit.constants.AppConfig
import com.cometchat.pro.core.CometChat
import com.cometchat.pro.core.CometChat.CallbackListener
import com.cometchat.pro.exceptions.CometChatException
import com.cometchat.pro.models.User
import com.cometchat.pro.uikit.ui_resources.utils.ErrorMessagesUtils
import com.cometchat.pro.uikit.ui_resources.utils.Utils
import com.google.android.material.button.MaterialButton
import com.google.android.material.card.MaterialCardView
import kotlin.system.exitProcess


class MainActivity : AppCompatActivity() {
    private val TAG = "MainActivity"
    private var loginBtn: MaterialButton? = null
    private var ivLogo: AppCompatImageView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        loginBtn = findViewById(R.id.login)
        ivLogo = findViewById(R.id.ivLogo)
        loginBtn!!.setOnClickListener(View.OnClickListener { startActivity(Intent(this@MainActivity, LoginActivity::class.java)) })
        if (Utils.isDarkMode(this)) {
            ivLogo!!.imageTintList = ColorStateList.valueOf(resources.getColor(R.color.textColorWhite))
        } else {
            ivLogo!!.imageTintList = ColorStateList.valueOf(resources.getColor(R.color.primaryTextColor))
        }
    }





    override fun onBackPressed() {
        super.onBackPressed()
        exitProcess(0)
    }
}