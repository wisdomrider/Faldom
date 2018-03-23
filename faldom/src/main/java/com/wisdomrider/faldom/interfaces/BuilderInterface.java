package com.wisdomrider.faldom.interfaces;

import android.content.Context;
import android.os.Build;
import android.support.v4.app.NotificationBuilderWithBuilderAccessor;

import com.wisdomrider.faldom.Action;

import java.util.HashMap;

/**
 * Created by wisdomrider (Avishek Adhikari) on 3/22/2018 *********** ...
 */

public interface BuilderInterface {

    BuilderInterface with(Context c); //required
    BuilderInterface setContext(Context c);

    BuilderInterface setParams(HashMap<String,String> params); //optional
    BuilderInterface addParam(String key, String value);

    BuilderInterface setMethod(int method); //optional Default to get
    BuilderInterface setMethodAsPost();
    BuilderInterface setMethodAsGet();


    BuilderInterface setUrl(String url); //required

    BuilderInterface after(Action action); //optional
    BuilderInterface setAction(Action action);

    BuilderInterface addHeader(String key, String value);

    void    request();
    void    post();
    void    get(); //setMethod lai override
}
