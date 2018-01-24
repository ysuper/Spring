package com.springinaction.springidol;

import java.util.Enumeration;
import java.util.Properties;

public class OneManBandProps implements Performer {
	public OneManBandProps() {
	}

	public void perform() {
		// for (String key : instruments.keySet()) {
		// 		System.out.print(key + " : ");
		// 		Instrument instrument = instruments.get(key);
		// 		instrument.play();
		// }
		Enumeration<String> enums = (Enumeration<String>) instruments.propertyNames();
		while (enums.hasMoreElements()) {
			String key = enums.nextElement();
			String value = instruments.getProperty(key);
			System.out.println(key + " : " + value);
		}
	}

	private Properties instruments;

	public void setInstruments(Properties instruments) {
		this.instruments = instruments;
	}
}