package com.androidemu;

public class Emulator {

	public static final int VIDEO_W = 320;
	public static final int VIDEO_H = 240;

	public static final int GAMEPAD_UP		= 0x0001;
	public static final int GAMEPAD_DOWN	= 0x0002;
	public static final int GAMEPAD_LEFT	= 0x0004;
	public static final int GAMEPAD_RIGHT	= 0x0008;
	public static final int GAMEPAD_B		= 0x0010;
	public static final int GAMEPAD_C		= 0x0020;
	public static final int GAMEPAD_A		= 0x0040;
	public static final int GAMEPAD_START	= 0x0080;
	public static final int GAMEPAD_Z		= 0x0100;
	public static final int GAMEPAD_Y		= 0x0200;
	public static final int GAMEPAD_X		= 0x0400;
	public static final int GAMEPAD_MODE	= 0x0800;

	public static final int GAMEPAD_UP_LEFT = (GAMEPAD_UP | GAMEPAD_LEFT);
	public static final int GAMEPAD_UP_RIGHT = (GAMEPAD_UP | GAMEPAD_RIGHT);
	public static final int GAMEPAD_DOWN_LEFT = (GAMEPAD_DOWN | GAMEPAD_LEFT);
	public static final int GAMEPAD_DOWN_RIGHT = (GAMEPAD_DOWN | GAMEPAD_RIGHT);

	public native void setRenderSurface(EmulatorView surface,
			int width, int height);
	public native void setKeyStates(int states);
	public native void setOption(String name, String value);

	public native boolean initialize(String libdir, String engine);
	public native void cleanUp();
	public native void reset();
	public native void power();
	public native boolean loadROM(String file);
	public native void unloadROM();
	public native void pause();
	public native void resume();
	public native void run();
	public native boolean saveState(String file);
	public native boolean loadState(String file);

	public void setOption(String name, boolean value) {
		setOption(name, value ? "true" : "false");
	}


	static {
		System.loadLibrary("emu");
	}
}
