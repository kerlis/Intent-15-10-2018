
package com.kotlin.order.coffee.intent

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import java.io.DataOutput

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)


        var mydato = intent.extras.get("mydato") as dato


        //var nombres = intent.getStringExtra("nombre")
        txtnombre.setText("mis nombres son ${mydato.nombre}   ${mydato.apellidos}")


    }
}
