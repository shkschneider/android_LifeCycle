package me.shkschneider.lifecycle

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

private val TAG = "LifeCycle:MainActivity"

class MainActivity : AppCompatActivity() {

    init {
        Log.v(TAG, "init")
    }

    override fun attachBaseContext(newBase: Context?) {
        super.attachBaseContext(newBase)
        Log.v(TAG, "attachBaseContext")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.v(TAG, "onCreate")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onRestart() {
        Log.v(TAG, "onRestart")
        super.onRestart()
    }

    override fun onStart() {
        Log.v(TAG, "onStart")
        super.onStart()
    }

    override fun onResumeFragments() {
        Log.v(TAG, "onResumeFragments")
        super.onResumeFragments()
    }

    override fun onResume() {
        Log.v(TAG, "onResume")
        super.onResume()
    }

    // RUNNING

    override fun onPause() {
        Log.v(TAG, "onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.v(TAG, "onStop")
        super.onStop()
    }

    override fun onDestroy() {
        Log.v(TAG, "onDestroy")
        super.onDestroy()
    }

}
