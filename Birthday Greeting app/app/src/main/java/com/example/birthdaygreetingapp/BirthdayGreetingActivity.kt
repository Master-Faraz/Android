package com.example.birthdaygreetingapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_birthday_greeting.*

class BirthdayGreetingActivity : AppCompatActivity() {

    companion object{
        const val  intent_Key = "int_key"
    }
    //          For creating constant static key so that it canbe accessed from main function

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greeting)


        val name = intent.getStringExtra(intent_Key)
        //     Recieving intent from main file

      textView_id_xml.text = "Happy Birthday \n$name"
    }
}