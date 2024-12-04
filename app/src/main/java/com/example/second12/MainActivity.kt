package com.example.second12

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController

class MainActivity : AppCompatActivity() {
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        navController = supportFragmentManager.findFragmentById(R.id.nav_host_fragment)
            ?.findNavController()
            ?: throw IllegalStateException("NavController не может быть найден")


        findViewById<Button>(R.id.buttonFragmentOne).setOnClickListener {
            navController.navigate(R.id.fragmentOne)
        }
        findViewById<Button>(R.id.buttonFragmentTwo).setOnClickListener {
            navController.navigate(R.id.fragmentTwo)
        }
        findViewById<Button>(R.id.buttonFragmentThree).setOnClickListener {
            navController.navigate(R.id.fragmentThree)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp() || super.onSupportNavigateUp()
    }
}


