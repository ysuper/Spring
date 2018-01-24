package com.springinaction.springidol;

import java.util.Set;

public class QuerySet {
	private City chosenCity;
	private City randomChosenCity;
	private Set<City> bigCities;
	private Set<String> cityNames;
	private Set<String> cityNamesAndState;
	private Set<String> bigCitiesCityNames;
	
	@Override
	public String toString() {
		System.out.println(chosenCity);
		System.out.println(randomChosenCity);
		System.out.println(bigCities);
		System.out.println(cityNames);
		System.out.println(cityNamesAndState);
		System.out.println(bigCitiesCityNames);
		return "";
	}

	public Set<String> getBigCitiesCityNames() {
		return bigCitiesCityNames;
	}

	public void setBigCitiesCityNames(Set<String> bigCitiesCityNames) {
		this.bigCitiesCityNames = bigCitiesCityNames;
	}

	public Set<String> getCityNamesAndState() {
		return cityNamesAndState;
	}

	public void setCityNamesAndState(Set<String> cityNamesAndState) {
		this.cityNamesAndState = cityNamesAndState;
	}

	public Set<String> getCityNames() {
		return cityNames;
	}

	public void setCityNames(Set<String> cityNames) {
		this.cityNames = cityNames;
	}

	public Set<City> getBigCities() {
		return bigCities;
	}

	public void setBigCities(Set<City> bigCities) {
		this.bigCities = bigCities;
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
