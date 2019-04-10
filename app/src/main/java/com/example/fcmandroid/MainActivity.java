package com.example.fcmandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.firebase.iid.FirebaseInstanceId;

public class MainActivity extends AppCompatActivity {

    private static String TAG = "MyMainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnShowToken = findViewById(R.id.btnFCM);


        btnShowToken.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String token = FirebaseInstanceId.getInstance().getToken();

                Log.d(TAG, token);
                Toast.makeText(MainActivity.this, "token= " + token, Toast.LENGTH_SHORT).show();
            }
        });


    }
}
