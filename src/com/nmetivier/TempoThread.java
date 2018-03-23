package com.nmetivier;

import java.awt.Toolkit;

public class TempoThread extends Thread {
	public TempoThread() {
		super("TempoThread");
	}
	
	public void run() {
		while (!Console.canStop) {
			int sleepTime_ms=60000/Console.bpm;
			try {
				Thread.sleep(sleepTime_ms);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Toolkit.getDefaultToolkit().beep();
		}
	}
}
