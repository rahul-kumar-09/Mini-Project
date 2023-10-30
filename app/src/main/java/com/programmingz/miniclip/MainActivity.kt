package com.programmingz.miniclip

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.programmingz.miniclip.databinding.ActivityMainBinding
import com.programmingz.miniclip.util.UiUtil

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bottomNavBar.setOnItemReselectedListener {menuItem->
            when(menuItem.itemId){
                R.id.bottom_menu_home -> {
                    UiUtil.showToast(this, "Home")
                }
                R.id.bottom_menu_add_video -> {
                    startActivity(Intent(this, VideoUploadActivity::class.java))
                }
                R.id.bottom_menu_profile -> {
                    UiUtil.showToast(this, "Profile")
                }
            }
            return@setOnItemReselectedListener
        }
    }
}