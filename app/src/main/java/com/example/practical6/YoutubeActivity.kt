package com.example.practical6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebSettings
import com.example.practical6.databinding.ActivityMainBinding
import com.example.practical6.databinding.ActivityYoutubeBinding

class YoutubeActivity : AppCompatActivity() {
    private lateinit  var binding: ActivityYoutubeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityYoutubeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //setContentView(R.layout.activity_youtube)
        initYoutubePlayer()
        binding.btnSwitch.setOnClickListener{
            Intent(this,MainActivity::class.java).also { startActivity(it) }
        }
    }
    private val youtubeId = "6fUlGTBXDTg"
    private fun initYoutubePlayer()
    {
        val webSettings: WebSettings = binding.youtubeWebView.settings
        webSettings.javaScriptEnabled = true
        webSettings.loadWithOverviewMode = true
        webSettings.useWideViewPort = true
        binding.youtubeWebView.loadUrl("https://www.youtube.com/embed/$youtubeId")

    }
}