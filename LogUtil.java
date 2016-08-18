package com.example.abc;

import android.util.Log;

/**
 * Log������<br/><br/>
 * 
 * 1.���Զ����ǩ���ƻ�ʹ��Ĭ�ϱ�ǩ����<br/>
 * 2.��Ŀ��ʽ���ߺ� LEVELָ���� NOTHING�������������־<br/>
 * 
 * @author lzh
 * @since  2016 ����3:28:12
 */
public class LogUtil {
	
	private LogUtil() {
		/* cannot be instantiated */
		throw new UnsupportedOperationException("cannot be instantiated");
	}
	
	/** Ĭ�ϵ�TAG��ǩ����   */
	public static String tag = "test";
	
	public static final int VERBOSE = 1;
	
	public static final int DEBUG = 2;
	
	public static final int INFO = 3;
	
	public static final int WARN = 4;
	
	public static final int ERROR = 5;
	
	public static final int NOTHING = 6;
	
	public static final int LEVEL = VERBOSE;
	
	public static void v(String msg) {
		if (LEVEL <= VERBOSE) {
			Log.v(tag, msg);
		}
	}
	
	public static void v(String tag, String msg) {
		if (LEVEL <= VERBOSE) {
			Log.v(tag, msg);
		}
	}

	public static void d(String msg) {
		if (LEVEL <= DEBUG) {
			Log.d(tag, msg);
		}
	}
	
	public static void d(String tag, String msg) {
		if (LEVEL <= DEBUG) {
			Log.d(tag, msg);
		}
	}

	public static void i(String msg) {
		if (LEVEL <= INFO) {
			Log.i(tag, msg);
		}
	}
	public static void i(String tag, String msg) {
		if (LEVEL <= INFO) {
			Log.i(tag, msg);
		}
	}

	public static void w(String msg) {
		if (LEVEL <= WARN) {
			Log.w(tag, msg);
		}
	}
	
	public static void w(String tag, String msg) {
		if (LEVEL <= WARN) {
			Log.w(tag, msg);
		}
	}

	public static void e(String msg) {
		if (LEVEL <= ERROR) {
			Log.e(tag, msg);
		}
	}
	
	public static void e(String tag, String msg) {
		if (LEVEL <= ERROR) {
			Log.e(tag, msg);
		}
	}
}
