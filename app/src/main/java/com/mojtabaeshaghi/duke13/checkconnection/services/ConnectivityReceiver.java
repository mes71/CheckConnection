package com.mojtabaeshaghi.duke13.checkconnection.services;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

import com.mojtabaeshaghi.duke13.checkconnection.MyApplications;

public class ConnectivityReceiver extends BroadcastReceiver {
    public static ConnectivityReceiverListener connectivityReceiverListener;

    public ConnectivityReceiver() {
    }

    public static boolean isConnected() {
        ConnectivityManager cm = (ConnectivityManager) MyApplications.getInstance().getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = cm.getActiveNetworkInfo();
        return networkInfo != null && networkInfo.isConnectedOrConnecting();

    }

    @Override
    public void onReceive(Context context, Intent intent) {

        boolean isConnect = isConnected();

        if (connectivityReceiverListener != null) {
            connectivityReceiverListener.onNetWorkConnectivityChanged(isConnect);
        }


    }


    public interface ConnectivityReceiverListener {
        void onNetWorkConnectivityChanged(boolean isConnected);
    }
}
