package com.example.birthdaygreetingapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        Here we write the code which will execute on clicking button
//        userbutton.setOnClickListener {
//            Toast.makeText(this, "Button clicked", Toast.LENGTH_LONG).show()
//        }

    }


    fun CreateCard(view: View) {
        val name = usernameinput.editableText.toString()
        val intent = Intent(this,BirthdayGreetingActivity::class.java)
        intent.putExtra(BirthdayGreetingActivity.intent_Key , name)
        startActivity(intent)



//        intent.putExtra("Key_name" , name)   -->   For Recieving we must use same "Key_name"
        //              For passing the string  -->  Parameters --> id , variable to pass
        //              Key - Value Pair




//        val name = usernameinput.editableText.toString()
//        Toast.makeText(this, "Name is $name", Toast.LENGTH_LONG).show()
//      This will work same as abobe but it is called by android:onClick in XML File
    }


}






//        val text :EditText = findViewById(R.id.usernameinput) // For accessing id

//    fun createcard(view: View) {
//        val name = text.
//    }
