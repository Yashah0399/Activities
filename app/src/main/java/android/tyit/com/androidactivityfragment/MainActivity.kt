package android.tyit.com.androidactivityfragment

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        activity1.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            Toast.makeText(this, "First Activity", Toast.LENGTH_LONG).show()
            startActivity(intent)
        }

        activity2.setOnClickListener {
            val intent = Intent(this, ThirdActivity::class.java)
            Toast.makeText(this, "Second Activity", Toast.LENGTH_LONG).show()

            startActivity(intent)
        }


    }
}
