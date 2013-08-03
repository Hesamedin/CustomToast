package com.kamalan.widget;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import com.kamalan.customtoast.R;

/**
 * Created with IntelliJ IDEA.
 * User: Hesamedin
 * Date: 8/3/13
 * Time: 4:57 PM
 */
public class MyToast extends Toast {
    private static final String TAG = "MyToast";


    public MyToast(Context context,CharSequence text, int duration) {
        super(context);

        LayoutInflater inflate = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflate.inflate(R.layout.widget_my_toast, null);
        TextView tvMessage = (TextView) view.findViewById(R.id.tvMessage);
        tvMessage.setText(text);

        this.setView(view);
        this.setDuration(duration);
        this.setGravity(Gravity.TOP | Gravity.CENTER_HORIZONTAL, 0, (int)convertDpToPixel(50, context));
    }

    public static Toast makeText(Context context, CharSequence text, int duration) {
        return new MyToast(context, text, duration);
    }

    @Override
    public void show() {
        super.show();
    }

    private static float convertDpToPixel(float dp, Context context){
        Resources resources = context.getResources();
        DisplayMetrics metrics = resources.getDisplayMetrics();
        float px = dp * (metrics.densityDpi / 160f);
        return px;
    }

    private static float convertPixelsToDp(float px, Context context){
        Resources resources = context.getResources();
        DisplayMetrics metrics = resources.getDisplayMetrics();
        float dp = px / (metrics.densityDpi / 160f);
        return dp;
    }
}
