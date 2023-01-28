package com.hafijulislam.doggler

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.hafijulislam.doggler.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var listIntent: Intent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Inflate the layout XML file and return a binding object instance
        binding = ActivityMainBinding.inflate(layoutInflater)

        // Set the content view of the Activity to be the root view of the layout
        setContentView(binding.root)

        // Launch the VerticalListActivity on verticalBtn click
        binding.verticalButton.setOnClickListener { launchVertical() }

        // Launch the HorizontalListActivity on horizontalBtn click
        binding.horizontalButton.setOnClickListener { launchHorizontal() }

        // Launch the GridListActivity on gridBtn click
        binding.gridButton.setOnClickListener { launchGrid() }
    }

    private fun launchVertical() {
        listIntent = Intent(this, VerticalListActivity::class.java)
        startActivity(listIntent)
    }

    private fun launchHorizontal() {
        listIntent = Intent(this, HorizontalListActivity::class.java)
        startActivity(listIntent)
    }

    private fun launchGrid() {
        listIntent = Intent(this, GridListActivity::class.java)
        startActivity(listIntent)
    }
}