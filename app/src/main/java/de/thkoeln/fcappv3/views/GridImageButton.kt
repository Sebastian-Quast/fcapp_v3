package de.thkoeln.fcappv3.views

import android.content.Context
import android.support.constraint.ConstraintLayout
import android.util.AttributeSet
import de.thkoeln.fcappv3.R
import kotlinx.android.synthetic.main.grid_image_button.view.*


class GridImageButton: ConstraintLayout {

    constructor(context: Context) : super(context) { onInit(context, null) }
    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) { onInit(context, attrs) }
    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) { onInit(context, attrs) }

    private fun onInit(context: Context, attrs: AttributeSet?) {
        inflate(getContext(), R.layout.grid_image_button, this)

        with(context.obtainStyledAttributes(attrs, R.styleable.GridImageButton, 0, 0)) {
            grid_button_text.text = getString(R.styleable.GridImageButton_text)
            grid_button_image.setImageDrawable(getDrawable(R.styleable.GridImageButton_src))
            recycle()
        }
    }

}