package com.dilip.activitylifecycle

import android.content.Intent
import android.os.Bundle
import android.util.Log
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.Button

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)


        var next = findViewById<Button>(R.id.next_page);
        next.setOnClickListener(){
            val startSecondPage = Intent(this,SecondActivity::class.java)
            startActivity(startSecondPage);
        }

     Log.e("First Page: "," onCreate")
    }

    override fun onRestart() {
        super.onRestart()
        Log.e("First Page: "," onRestart")
    }

    override fun onStart() {
        super.onStart()
        Log.e("First Page: "," onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.e("First Page: "," onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.e("First Page: "," onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.e("First Page: "," onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("First Page: "," onDestroy")
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
