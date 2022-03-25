package com.verindrarizya.qluetechnical

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.verindrarizya.qluetechnical.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }

    private fun initListener() {
        binding.btnSort.setOnClickListener {
            if (validateTextField()) {

            }
        }

        binding.btnMultiply.setOnClickListener {
            if (validateTextField()) {

            }
        }

        binding.btnAddAndSubtract.setOnClickListener {
            if (validateTextField()) {

            }
        }
    }

    private fun validateTextField(): Boolean {
        if (binding.edtInputArray.text.toString().isEmpty()) {
            Toast.makeText(this, getString(R.string.cannot_empty_statement), Toast.LENGTH_SHORT).show()
            return false
        } else {
            return true
        }
    }
}