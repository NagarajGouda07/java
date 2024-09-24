package com.xworkz.external;

public class Television implements RemoteControl {

	@Override
	public void powerOn() {
		System.out.println("Television is powering on...");
	}

	@Override
	public void powerOff() {
		System.out.println("Television is powering off...");
	}

	public static void main(String[] args) {
		// Using the interface to refer to a Television object
		RemoteControl tvRemote = new Television();
		tvRemote.powerOn();

		tvRemote.powerOff();
	}
}
