package com.dilip.activitylifecycle

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        setSupportActionBar(toolbar)

        var prev = findViewById<Button>(R.id.prev_page);
        prev.setOnClickListener(){
            val startFirstPage = Intent(this,MainActivity::class.java)
            startActivity(startFirstPage);
        }

        Log.e("Second Page: "," onCreate")
    }

    override fun onRestart() {
        super.onRestart()
        Log.e("Second Page: "," onRestart")
    }

    override fun onStart() {
        super.onStart()
        Log.e("Second Page: "," onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.e("Second Page: "," onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.e("Second Page: "," onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.e("Second Page: "," onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("Second Page: "," onDestroy")
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}