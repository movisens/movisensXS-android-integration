package com.yourApp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class YourReceiverName extends BroadcastReceiver {
	@Override
	public void onReceive(Context context, Intent intent) {
		if (intent.getAction().equals("com.yourApp.YourReceiverName")) {
			Toast.makeText(context, "Received broadcast from movisensXS",
					Toast.LENGTH_SHORT).show();
		}
	}
}