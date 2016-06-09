package com.dsp.dilip.activitylifecycle;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by dilip on 9/6/16.
 */
public class SecondPage_Activity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_page);

        Log.d("In onCreate Method","");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("In onResume Method","");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("In onPause Method","");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("In onStop Method","");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("In onRestart Method","");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("In onDestory Method","");
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Log.d("In onBackpressed Method","");
    }
}
