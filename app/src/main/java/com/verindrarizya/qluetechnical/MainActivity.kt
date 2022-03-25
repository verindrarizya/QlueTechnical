package com.verindrarizya.qluetechnical

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import com.verindrarizya.qluetechnical.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        initObservers()
        initListener()
    }

    private fun initObservers() {
        viewModel.result.observe(this) {
            binding.tvResult.text = it
        }

        viewModel.isNotValid.observe(this) {
            binding.tilInputArray.isErrorEnabled = it
            if (it) {
                binding.tilInputArray.error = getString(R.string.input_not_valid_statement)
            } else {
                binding.tilInputArray.error = null
            }
        }
    }

    private fun initListener() {
        binding.btnSort.setOnClickListener {
            if (validateTextField()) {
                viewModel.sort(binding.edtInputArray.text.toString())
            }
        }

        binding.btnMultiply.setOnClickListener {
            if (validateTextField()) {
                viewModel.multiply(binding.edtInputArray.text.toString())
            }
        }

        binding.btnAddAndSubtract.setOnClickListener {
            if (validateTextField()) {
                viewModel.addAndSubtract(binding.edtInputArray.text.toString())
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