package de.thkoeln.fcappv3.activities

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import de.thkoeln.fcappv3.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_1.setOnClickListener {
            startActivity(Intent(this@MainActivity, OverviewActivity::class.java))
        }
    }
}
