package com.springinaction.springidol;

public class QuerySet {
	private City chosenCity;
	private City randomChosenCity;
	
	public QuerySet() {
	}
	
	public City getChosenCity() {
		return chosenCity;
	}

	public void setChosenCity(City chosenCity) {
		this.chosenCity = chosenCity;
	}

	public City getRandomChosenCity() {
		return randomChosenCity;
	}

	public void setRandomChosenCity(City randomChosenCity) {
		this.randomChosenCity = randomChosenCity;
	}
}
