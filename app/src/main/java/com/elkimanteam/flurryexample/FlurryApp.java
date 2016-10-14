package com.elkimanteam.flurryexample;

import android.app.Application;
import android.util.Log;

import com.flurry.android.FlurryAgent;
import com.flurry.android.FlurryAgentListener;

/**
 * Created by jonathanhavstad on 10/14/16.
 */

public class FlurryApp extends Application {
    private static final String TAG = "FlurryApp";

    private FlurryAgentListener flurryListener = new FlurryAgentListener() {
        @Override
        public void onSessionStarted() {
            Log.d(TAG, "Session Started");
        }
    };

    @Override
    public void onCreate() {
        super.onCreate();
        new FlurryAgent.Builder()
                .withLogEnabled(true)
                .withListener(flurryListener)
                .build(this, "2TS9B9JG5Z9F96ZFBF3R");
    }
}
