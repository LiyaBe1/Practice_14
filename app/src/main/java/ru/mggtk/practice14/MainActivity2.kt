package ru.mggtk.practice14

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val nameText: EditText = findViewById(R.id.editTextText4)
        val ageText: EditText = findViewById(R.id.editTextNumber4)
        val emailText: EditText = findViewById(R.id.editTextTextEmailAddress4)


        val arguments: Bundle? = intent.extras

        if (arguments != null){
            val name: String = arguments.getString("name").toString()
            val email: String? = arguments.getString("email").toString()
            val age: Int = arguments.getInt("age")

            nameText.setText("$name")
            ageText.setText("$age")
            emailText.setText("$email")


        }
    }

    fun btnSendData(view: View){
        val nameText: EditText = findViewById(R.id.editTextText4)
        val ageText: EditText = findViewById(R.id.editTextNumber4)
        val emailText: EditText = findViewById(R.id.editTextTextEmailAddress4)

        val name = nameText.text.toString()
        val age = ageText.text.toString().toInt()
        val email = emailText.text.toString()

        val intent: Intent = Intent(this@MainActivity2, MainActivity::class.java)

        intent.putExtra("name", name)
        intent.putExtra("age", age)
        intent.putExtra("email", email)

        startActivity(intent)
    }
}