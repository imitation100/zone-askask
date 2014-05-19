package com.stone.zone.askask.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public final class PreferenceUtils {
	//死否是第一次启动
	public static boolean isFirstLaunch(Context ctx) {
		SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(ctx);
		return prefs.getBoolean(MyConstants.PrefKey.PREFS_KEY_IS_FIRST_LAUNCH, true);
	}
	//第一次启动成功
	public static void firstLaunched(Context ctx) {
		SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(ctx);
		prefs.edit().putBoolean(MyConstants.PrefKey.PREFS_KEY_IS_FIRST_LAUNCH, false).commit();
	}
}
