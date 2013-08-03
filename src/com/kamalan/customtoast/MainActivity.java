package com.kamalan.customtoast;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import com.kamalan.customtoast.R;
import com.kamalan.widget.MyToast;

/**
 * Created with IntelliJ IDEA.
 * User: Hesamedin
 * Date: 8/3/13
 * Time: 4:28 PM
 */
public class MainActivity extends Activity{

    private static final String TAG = "MainActivity";

    private Button btnDefaultToast;
    private Button btnCustomToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.main);

        Typeface pacificoFont = Typeface.createFromAsset(getAssets(), "fonts/helvetica-normal.ttf");

        btnDefaultToast = (Button) findViewById(R.id.btnDefaultToast);
        btnDefaultToast.setTypeface(pacificoFont);
        btnDefaultToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "This is default toast message.", Toast.LENGTH_LONG).show();
            }
        });

        btnCustomToast = (Button) findViewById(R.id.btnCustomToast);
        btnCustomToast.setTypeface(pacificoFont);
        btnCustomToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyToast.makeText(getApplicationContext(), "This is custom toast message.", Toast.LENGTH_LONG).show();
            }
        });
    }
}
