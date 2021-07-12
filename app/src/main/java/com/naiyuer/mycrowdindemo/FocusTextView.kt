package com.naiyuer.mycrowdindemo

import android.content.Context
import android.util.AttributeSet
import android.widget.TextView
import androidx.appcompat.widget.AppCompatTextView

/**
 * @author : naiyu
 * date : 2021/7/12
 * e-mail: hnaiyu@gmail.com
 * description:
 **/
class FocusTextView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : AppCompatTextView(context, attrs, defStyleAttr) {

    override fun isFocused(): Boolean = true
}