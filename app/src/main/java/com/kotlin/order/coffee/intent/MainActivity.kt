package com.kotlin.order.coffee.intent
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.io.Serializable

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun enviarsecondactivity(view: View){
        var intent = Intent(this, SecondActivity:: class.java)
        //intent.putExtra("nombres", txtnombre.text.toString())




        var mydato = dato(txtnombre.text.toString(), txtapellidos.text.toString())
        intent.putExtra("mydato", mydato as Serializable)
        startActivity(intent)
    }

}
