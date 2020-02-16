package com.mojtabaeshaghi.duke13.checkconnection;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.mojtabaeshaghi.duke13.checkconnection.services.ConnectivityReceiver;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        isConneted();
    }

    @Override
    protected void onResume() {
        super.onResume();
        isConneted();
    }


    private void isConneted() {
        boolean is = ConnectivityReceiver.isConnected();
        if (is) {
            Toast.makeText(this, "😃😃😃" + is, Toast.LENGTH_SHORT).show();

        } else {
            Toast.makeText(this, "😒😒😒" + is, Toast.LENGTH_SHORT).show();
        }
    }
}
