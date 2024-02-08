package com.example.dz2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import com.example.dz2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var binding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        setSupportActionBar(binding?.topAppBar)

        supportFragmentManager.beginTransaction().replace(R.id.content, Home()).commit()

        binding?.nav?.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.homeItemBottomNav -> supportFragmentManager.beginTransaction()
                    .replace(R.id.content, Home()).commit()
                R.id.catalogItemBottomNav -> supportFragmentManager.beginTransaction()
                    .replace(R.id.content, Catalog()).commit()
                R.id.deliveryItemBottomNav -> supportFragmentManager.beginTransaction()
                    .replace(R.id.content, Delivery()).commit()
                R.id.contactsItemBottomNav -> supportFragmentManager.beginTransaction()
                    .replace(R.id.content, Contacts()).commit()
            }

            return@setOnItemSelectedListener true
        }

        binding?.topAppBar?.setOnMenuItemClickListener { menuItem: MenuItem ->
            when (menuItem.itemId) {
                R.id.favoritesItemTopNav -> {
                    supportFragmentManager.beginTransaction().replace(R.id.content, favorites())
                        .commit()
                    true
                }
                R.id.settingsItemTopNav -> {
                    supportFragmentManager.beginTransaction().replace(R.id.content, Settings())
                        .commit()
                    true
                }
                else -> false
            }
        }
    }

    fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.homeItemBottomNav -> supportFragmentManager.beginTransaction()
                .replace(R.id.content, Home()).commit()
            R.id.catalogItemBottomNav -> supportFragmentManager.beginTransaction()
                .replace(R.id.content, Catalog()).commit()
            R.id.deliveryItemBottomNav -> supportFragmentManager.beginTransaction()
                .replace(R.id.content, Delivery()).commit()
            R.id.contactsItemBottomNav -> supportFragmentManager.beginTransaction()
                .replace(R.id.content, Contacts()).commit()
        }

        return true
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val menuInflater = menuInflater
        menuInflater.inflate(R.menu.top_menu, menu)

        return true


    }
}