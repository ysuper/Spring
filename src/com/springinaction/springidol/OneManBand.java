package com.springinaction.springidol;

import java.util.Collection;

public class OneManBand implements Performer {
	public OneManBand() {
	}

	public void perform() {
		for (Instrument instrument : instruments) {
			instrument.play();
		}
	}

	private Collection<Instrument> instruments;

	public void setInstruments(Collection<Instrument> instruments) {
		this.instruments = instruments;
	}
}