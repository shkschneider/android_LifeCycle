package me.shkschneider.lifecycle

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.util.AttributeSet
import android.util.Log
import android.view.ViewGroup
import android.widget.Switch
import android.R
import android.R.attr.data
import android.content.res.TypedArray
import android.util.TypedValue

class CustomView : ViewGroup {

    constructor(context: Context) : super(context)
    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs)
    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)

    init {
        Log.v(TAG, "init")
        // LayoutInflater.from(context).inflate()
        with(TypedValue()) {
            context.obtainStyledAttributes(data, intArrayOf(R.attr.colorAccent)).also {
                setBackgroundColor(it.getColor(0, 0))
            }.recycle()
        }
    }

    override fun onAttachedToWindow() {
        Log.v(TAG, "onAttachedToWindow")
        super.onAttachedToWindow()
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
    }

    override fun onDetachedFromWindow() {
        Log.v(TAG, "onDetachedFromWindow")
        super.onDetachedFromWindow()
    }

    override fun onLayout(changed: Boolean, l: Int, t: Int, r: Int, b: Int) = Unit

    companion object {

        private const val TAG = "LifeCycle:CustomView"

    }

}