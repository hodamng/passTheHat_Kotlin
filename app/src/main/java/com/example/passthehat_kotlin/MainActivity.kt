package com.example.passthehat_kotlin

import android.content.Intent
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem

import kotlinx.android.synthetic.main.activity_main.*
import android.net.Uri


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
//            Snackbar.make(view, "el 3ab ya ma3lem", Snackbar.LENGTH_LONG)
  //          .setAction("Action", null).show()
            val emailIntent = Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                "mailto", "email@example.com", "rtfgyhjk"))
            emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Email subject")
            emailIntent.putExtra(Intent.EXTRA_TEXT, "Email message text")
            startActivity(Intent.createChooser(emailIntent,"send email"))
        }
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
