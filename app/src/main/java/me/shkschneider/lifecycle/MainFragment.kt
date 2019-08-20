package me.shkschneider.lifecycle

import android.content.Context
import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import kotlinx.android.synthetic.main.fragment_main.*

class MainFragment : Fragment() {

    val viewModel: MainViewModel by lazy { ViewModelProviders.of(this).get(MainViewModel::class.java) }

    init {
        Log.v(TAG, "init")
    }

    override fun onAttach(context: Context?) {
        Log.v(TAG, "onAttach")
        super.onAttach(context)
        viewModel.tag = TAG
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.v(TAG, "onCreate: ${savedInstanceState != null}")
        super.onCreate(savedInstanceState)
        // TODO restored if savedInstanceState!=null
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

        if (savedInstanceState == null) {
            /**
             * This custom view is accentColor by default (upon creation)
             * and gets RED when created for the first time (no restoration).
             * The exercice will be to keep its current color accross
             * configuration change and process death.
             */
            custom.setBackgroundColor(Color.RED)
        }
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        Log.v(TAG, "onActivityCreated: ${savedInstanceState != null}")
        super.onActivityCreated(savedInstanceState)
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        Log.v(TAG, "onViewStateRestored: ${savedInstanceState != null}")
        super.onViewStateRestored(savedInstanceState)
        // TODO restore
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
        // TODO save
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

    companion object {

        private const val TAG = "LifeCycle:MainFragment"

    }

}