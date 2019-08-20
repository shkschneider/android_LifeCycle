package me.shkschneider.lifecycle

import android.util.Log
import androidx.lifecycle.ViewModel

private val TAG = "LifeCycle:MainViewModel"

class MainViewModel : ViewModel() {

    var tag: String? = null
        set(value) {
            Log.v(TAG, "tag ${value}")
            field = value
        }

    init {
        Log.v(TAG, "init @${this}")
    }

}
