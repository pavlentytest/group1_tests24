package com.example.myapplication

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication.databinding.ActivityMainBinding

class Calculation {

    fun calc(a: Int, b: Int) = a*a + b*b

    fun getStr(s: String?) : Boolean {
        println(s!!.length)
        return false
    }

}

class MainActivity : AppCompatActivity() {

    companion object {
        const val LOGIN = "test"
        const val PASSWORD = "123456"
    }

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            if(binding.editTextLogin.text.toString() == LOGIN
                && binding.editTextPassword.text.toString() == PASSWORD) {
                    binding.textView.text = getString(R.string.auth_successful)
            } else {
                binding.textView.text = getString(R.string.auth_failed)
            }
        }
    }
}