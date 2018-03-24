package com.wisdomrider.faldom;

import android.util.Log;
import android.widget.Toast;

import com.android.volley.NetworkResponse;

/**
 * Created by wisdomrider (Avishek Adhikari) on 3/22/2018 *********** ...
 */
public class FaldomError extends Exception {
    public final NetworkResponse networkResponse;
    private long networkTimeMs;

    public FaldomError() {
        networkResponse = null;
    }

    public FaldomError(NetworkResponse response) {
        networkResponse = response;
    }

    public FaldomError(String exceptionMessage) {
        super(exceptionMessage);
        networkResponse = null;
    }

    public FaldomError(String exceptionMessage, Throwable reason) {
        super(exceptionMessage);
        networkResponse = null;
    }

    public FaldomError(Throwable cause) {
        super(cause);
        networkResponse = null;
    }

     void setNetworkTimeMs(long networkTimeMs) {
        this.networkTimeMs = networkTimeMs;
    }

    public long getNetworkTimeMs() {
        return networkTimeMs;
    }
}
