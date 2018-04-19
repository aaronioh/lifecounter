package edu.washington.aaronioh.lifecounter

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textP1Life = findViewById<TextView>(R.id.textP1Life) as TextView
        val textP2Life = findViewById<TextView>(R.id.textP2Life) as TextView
        val textP3Life = findViewById<TextView>(R.id.textP3Life) as TextView
        val textP4Life = findViewById<TextView>(R.id.textP4Life) as TextView

        // lots of buttons "+", "-", "+5", "-5"
        val buttonP1Add = findViewById<Button>(R.id.buttonP1Add) as Button
        val buttonP1Sub = findViewById<Button>(R.id.buttonP1Sub) as Button
        val buttonP1Add5 = findViewById<Button>(R.id.buttonP1Add5) as Button
        val buttonP1Sub5 = findViewById<Button>(R.id.buttonP1Sub5) as Button

        val buttonP2Add = findViewById<Button>(R.id.buttonP2Add) as Button
        val buttonP2Sub = findViewById<Button>(R.id.buttonP2Sub) as Button
        val buttonP2Add5 = findViewById<Button>(R.id.buttonP2Add5) as Button
        val buttonP2Sub5 = findViewById<Button>(R.id.buttonP2Sub5) as Button

        val buttonP3Add = findViewById<Button>(R.id.buttonP3Add) as Button
        val buttonP3Sub = findViewById<Button>(R.id.buttonP3Sub) as Button
        val buttonP3Add5 = findViewById<Button>(R.id.buttonP3Add5) as Button
        val buttonP3Sub5 = findViewById<Button>(R.id.buttonP3Sub5) as Button

        val buttonP4Add = findViewById<Button>(R.id.buttonP4Add) as Button
        val buttonP4Sub = findViewById<Button>(R.id.buttonP4Sub) as Button
        val buttonP4Add5 = findViewById<Button>(R.id.buttonP4Add5) as Button
        val buttonP4Sub5 = findViewById<Button>(R.id.buttonP4Sub5) as Button

        val onClickListener = View.OnClickListener { view ->
            when (view.id) {
                buttonP1Add.id -> adjustLife(textP1Life, 1, 1)
                buttonP1Sub.id -> adjustLife(textP1Life, 1, -1)
                buttonP1Add5.id -> adjustLife(textP1Life,  1, 5)
                buttonP1Sub5.id -> adjustLife(textP1Life, 1, -5)

                buttonP2Add.id -> adjustLife(textP2Life, 2, 1)
                buttonP2Sub.id -> adjustLife(textP2Life, 2, -1)
                buttonP2Add5.id -> adjustLife(textP2Life, 2, 5)
                buttonP2Sub5.id -> adjustLife(textP2Life, 2, -5)

                buttonP3Add.id -> adjustLife(textP3Life, 3, 1)
                buttonP3Sub.id -> adjustLife(textP3Life, 3, -1)
                buttonP3Add5.id -> adjustLife(textP3Life, 3, 5)
                buttonP3Sub5.id -> adjustLife(textP3Life, 3, -5)

                buttonP4Add.id -> adjustLife(textP4Life, 4, 1)
                buttonP4Sub.id -> adjustLife(textP4Life, 4, -1)
                buttonP4Add5.id -> adjustLife(textP4Life, 4, 5)
                buttonP4Sub5.id -> adjustLife(textP4Life, 4, -5)
            }
        }

        // setOnClickListener for each button
        buttonP1Add.setOnClickListener(onClickListener)
        buttonP1Sub.setOnClickListener(onClickListener)
        buttonP1Add5.setOnClickListener(onClickListener)
        buttonP1Sub5.setOnClickListener(onClickListener)

        buttonP2Add.setOnClickListener(onClickListener)
        buttonP2Sub.setOnClickListener(onClickListener)
        buttonP2Add5.setOnClickListener(onClickListener)
        buttonP2Sub5.setOnClickListener(onClickListener)

        buttonP3Add.setOnClickListener(onClickListener)
        buttonP3Sub.setOnClickListener(onClickListener)
        buttonP3Add5.setOnClickListener(onClickListener)
        buttonP3Sub5.setOnClickListener(onClickListener)

        buttonP4Add.setOnClickListener(onClickListener)
        buttonP4Sub.setOnClickListener(onClickListener)
        buttonP4Add5.setOnClickListener(onClickListener)
        buttonP4Sub5.setOnClickListener(onClickListener)
    }

    fun adjustLife(view: TextView, player: Int, life: Int) {
        var health = view.text.toString().toInt() + life
        if (health <= 0) {
            health = 0
            Toast.makeText(applicationContext, "Player " + player + " LOSES!", Toast.LENGTH_LONG).show()
        }
        view.text = health.toString()
    }
}
