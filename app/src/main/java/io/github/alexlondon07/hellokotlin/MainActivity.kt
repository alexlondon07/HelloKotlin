package io.github.alexlondon07.hellokotlin

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(), TextWatcher   {
    override fun afterTextChanged(s: Editable?) {

    }

    override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

    }

    override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

        if (!editText_username.text.toString().trim().isEmpty() &&
                !editText_password.text.toString().trim().isEmpty()) {

            btn_continue.setBackgroundColor(resources.getColor(R.color.colorAccent))
            btn_continue.isEnabled = true
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText_username.addTextChangedListener(this)
        editText_password.addTextChangedListener(this)
    }

    fun continueActivity(view: View){
        val intent = Intent(this, Main2Activity::class.java)
        startActivity(intent)
    }
}
