package com.wisdomrider.faldom;


import android.content.Context;

import com.wisdomrider.faldom.interfaces.BuilderInterface;

import java.util.HashMap;

/**
 * Created by wisdomrider (Avishek Adhikari) on 3/22/2018 *********** ...
 */

public class Builder implements BuilderInterface {

    public static int GET = 0;
    public static int POST = 1;

    private Context context;
    private HashMap<String,String> params=new HashMap<>();
    private HashMap<String,String> headers=new HashMap<>();
    private int method = GET;
    private String url;
    private Action action;

    public Builder()
    {

    }

    public Builder(Context c){
        setContext(c);
    }

    @Override
    public BuilderInterface with(Context c) {
        return this.setContext(c);
    }

    @Override
    public BuilderInterface setContext(Context c) {
        context = c;
        return this;
    }

    @Override
    public BuilderInterface setParams(HashMap<String, String> params) {
        this.params = params;
        return this;
    }

    @Override
    public BuilderInterface addParam(String key, String value) {
        this.params.put(key,value);
        return this;
    }

    @Override
    public BuilderInterface setMethod(int method) {
        this.method=method;
        return this;
    }

    @Override
    public BuilderInterface setMethodAsPost() {
      return setMethod(POST);
    }

    @Override
    public BuilderInterface setMethodAsGet() {
        return setMethod(GET);
    }

    @Override
    public BuilderInterface setUrl(String url) {
        this.url=url;
        return this;
    }

    @Override
    public BuilderInterface after(Action action) {
       return this.setAction(action);
    }

    @Override
    public BuilderInterface setAction(Action action) {
        this.action=action;
        return this;
    }

    @Override
    public BuilderInterface addHeader(String key, String value) {
        headers.put(key,value);
        return this;
    }

    @Override
    public void request() {
        Faldom.Request(context,params,url,method,headers,action);
    }

    @Override
    public void post() {
        setMethodAsPost();
        request();
    }

    @Override
    public void get() {
        setMethodAsGet();
        request();
    }
}