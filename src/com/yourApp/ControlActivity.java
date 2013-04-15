package com.yourApp;

import java.io.IOException;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ControlActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_control);
	}

	public void onNavButtonClick(View view) throws IOException,
			InterruptedException {
		switch (view.getId()) {
		case R.id.startSampling:
			sendBroadcast(new Intent("com.movisens.xs.android.core.intent.action.START_SAMPLING"));
			break;
		case R.id.stopSampling:
			sendBroadcast(new Intent("com.movisens.xs.android.core.intent.action.STOP_SAMPLING"));
			break;
		case R.id.sendBroadcast:
			sendBroadcast(new Intent("com.yourApp.YourBroadcastName"));
			break;
		}
	}
}
