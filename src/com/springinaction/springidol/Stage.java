package com.springinaction.springidol;

public class Stage {
	private Stage() {
	}

	private static class StageSingletonHolder {
		static Stage instance = new Stage();
	}

	public static Stage getInstance() {
		System.out.println("123");
		return StageSingletonHolder.instance;
	}
}