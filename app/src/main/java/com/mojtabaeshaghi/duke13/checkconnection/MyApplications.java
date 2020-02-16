package com.mojtabaeshaghi.duke13.checkconnection;

import android.app.Application;

import com.mojtabaeshaghi.duke13.checkconnection.services.ConnectivityReceiver;

public class MyApplications extends Application {
    private static MyApplications mInstance;

    public static synchronized MyApplications getInstance() {
        return mInstance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;
    }

    public void setConnectivityListener(ConnectivityReceiver.ConnectivityReceiverListener listener) {
        ConnectivityReceiver.connectivityReceiverListener = listener;

    }
}
