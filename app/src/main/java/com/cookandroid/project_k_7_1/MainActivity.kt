package com.cookandroid.project_k_7_1

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import com.cookandroid.project_k_7_1.databinding.ActivityMainBinding

@Suppress("UNREACHABLE_CODE")
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        setTitle("배경색 바꾸기")

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val mInflater : MenuInflater = menuInflater
        mInflater.inflate(R.menu.menu1, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        item.isChecked = !item.isChecked
        when (item.itemId) {
            R.id.itemRed -> {
                binding.baseLayout.setBackgroundColor(Color.RED)
            }
            R.id.itemGreen -> {
                binding.baseLayout.setBackgroundColor(Color.GREEN)
            }
            R.id.itemBlue -> {
                binding.baseLayout.setBackgroundColor(Color.BLUE)
            }
            R.id.subRotate -> {
                binding.btn1.rotation = 45F
            }
            R.id.subSize -> {
                binding.btn1.scaleX = 2F
            }
        }
        return super.onOptionsItemSelected(item)
    }
}