package fr.smartapps.smartlibrary;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.TextView;

public class FontText extends TextView {

    /*
    Class attributes
     */
    protected Context context;

    /*
    Constructor
     */
    public FontText(Context context) {
        super(context);
        this.context = context;
    }

    public FontText(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
    }

    public FontText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.context = context;
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public FontText(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        this.context = context;
    }
}
