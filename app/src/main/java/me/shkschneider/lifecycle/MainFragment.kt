package me.shkschneider.lifecycle

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_main.*

private val TAG = "LifeCycle:MainFragment"

class MainFragment : Fragment() {

    init {
        Log.v(TAG, "init")
    }

    override fun onAttach(context: Context?) {
        Log.v(TAG, "onAttach")
        super.onAttach(context)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.v(TAG, "onCreate: ${savedInstanceState != null}")
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        Log.v(TAG, "onCreateView")
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        Log.v(TAG, "onViewCreated: ${savedInstanceState != null}")
        restart.setOnClickListener { requireActivity().recreate() }
        finish.setOnClickListener { requireActivity().finish() }
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        Log.v(TAG, "onActivityCreated: ${savedInstanceState != null}")
        super.onActivityCreated(savedInstanceState)
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        Log.v(TAG, "onViewStateRestored: ${savedInstanceState != null}")
        super.onViewStateRestored(savedInstanceState)
    }

    override fun onStart() {
        Log.v(TAG, "onStart")
        super.onStart()
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

    override fun onSaveInstanceState(outState: Bundle) {
        Log.v(TAG, "onSaveInstanceState")
        super.onSaveInstanceState(outState)
    }

    override fun onStop() {
        Log.v(TAG, "onStop")
        super.onStop()
    }

    override fun onDestroyView() {
        Log.v(TAG, "onDestroyView")
        super.onDestroyView()
    }

    override fun onDestroy() {
        Log.v(TAG, "onDestroy")
        super.onDestroy()
    }

    override fun onDetach() {
        Log.v(TAG, "onDetach")
        super.onDetach()
    }

}