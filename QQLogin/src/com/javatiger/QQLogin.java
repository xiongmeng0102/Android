package com.javatiger;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

public class QQLogin extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // »•µÙ±ÍÃ‚¿∏
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.qqlogin);
    }
}