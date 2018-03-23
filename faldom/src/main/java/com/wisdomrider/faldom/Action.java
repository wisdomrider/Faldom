package com.wisdomrider.faldom;

import com.android.volley.VolleyError;

/**
 * Created by wisdomrider (Avishek Adhikari) on 3/22/2018 *********** ...
 */

public  interface Action
{
    void onSuccess(String response);
    void onError(FaldomError error);
}