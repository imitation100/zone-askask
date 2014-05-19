package com.stone.zone.askask;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Fullscreen;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;

import com.stone.zone.askask.utils.PreferenceUtils;

@EActivity(R.layout.activity_splash)
@Fullscreen
public class SplashActivity extends Activity {
	@AfterViews
	void afterViews() {
		new Handler().postDelayed(new Runnable() {
			public void run() {
				gotoNextPage();
			}
		}, 2000);
	}
	private void gotoNextPage() {
		Intent i = null;
		if(PreferenceUtils.isFirstLaunch(this)) {
			i = new Intent(this,GuideActivity.class);
		} else {
			i = new Intent(this,MainActivity.class);
		}
		startActivity(i);
		finish();
	}
}
