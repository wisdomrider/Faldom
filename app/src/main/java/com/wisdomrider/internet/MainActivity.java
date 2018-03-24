package com.wisdomrider.internet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.VolleyError;
import com.wisdomrider.faldom.Action;
import com.wisdomrider.faldom.Faldom;
import com.wisdomrider.faldom.FaldomError;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
HashMap<String,String> maps=new HashMap<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//this is app

        Faldom.Builder(this)
                .addParam("kusal","aa")
                .setUrl("https://nasazone.crystalsoft.com.np/api/about-us/")
                .after(new Action() {
                    @Override
                    public void onSuccess(String response) {
                   Toast.makeText(getApplicationContext(),response,Toast.LENGTH_LONG).show();
                    }

                    @Override
                    public void onError(FaldomError error) {
                        Toast.makeText(getApplicationContext(),error.getMessage(),Toast.LENGTH_LONG).show();

                    }
                })
                .request();






    }
}
