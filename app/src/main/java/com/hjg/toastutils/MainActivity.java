package com.hjg.toastutils;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.hjg.toast.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.showShort("11213123");
    }
}
