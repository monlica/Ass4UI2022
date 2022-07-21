package com.example.ass4ui2022

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import android.widget.RadioGroup
import com.example.ass4ui2022.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    fun showDate(v: View){
        val newDateFragment = DatePickerFragment()
        newDateFragment.show(supportFragmentManager, "Date Picker")

    }

    fun showResult(view : View){
        var  radioGroup: RadioGroup =  findViewById(R.id.radioGroup)
        var  selectedId : Int = radioGroup.checkedRadioButtonId
        var  radioButton : RadioButton = findViewById(selectedId)

        binding.txtResult.text = "Neme: ${binding.editName.text }\nPassword: ${binding.editPassword.text}\n" +
                "Gender: ${radioButton.text}\nE-mail: " +
                "${binding.editEmail.text}\n" + "Birthday: ${binding.txtBd.text} "
    }

    fun resetData(v: View){
        binding.editName.text?.clear()
        binding.editPassword.text?.clear()
        binding.editEmail.text?.clear()
        binding.txtBd.text = "mm / dd / yy"
        binding.editEmail.clearFocus()
        binding.radioGroup.clearCheck()
        binding.txtResult.text = "Show Information"

    }
}