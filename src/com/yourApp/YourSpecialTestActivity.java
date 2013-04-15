package com.yourApp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.RatingBar.OnRatingBarChangeListener;

public class YourSpecialTestActivity extends Activity implements
		OnRatingBarChangeListener {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_your_special_test);
		RatingBar ratingBar = (RatingBar) findViewById(R.id.ratingBar1);
		ratingBar.setOnRatingBarChangeListener(this);

		String question = getIntent().getStringExtra("XS_question");
		TextView questionView = (TextView) findViewById(R.id.question);
		questionView.setText(question);

		String config = getIntent().getStringExtra("XS_config");
		TextView configView = (TextView) findViewById(R.id.config);
		configView.setText("Config: " + config);

		Boolean required = getIntent().getBooleanExtra("XS_required", true);
		TextView requiredView = (TextView) findViewById(R.id.required);
		requiredView.setText("Required: " + required.toString());
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_your_special_test, menu);
		return true;
	}

	@Override
	public void onRatingChanged(RatingBar ratingBar, float rating,
			boolean fromUser) {
		String answer = String.valueOf(ratingBar.getProgress());
		Intent intent = new Intent();
		intent.putExtra("value", answer);
		setResult(RESULT_OK, intent);
		finish();
	}
}
