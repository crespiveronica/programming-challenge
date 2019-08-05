package de.exxcellent.challenge.models;

import com.opencsv.bean.CsvBindByName;

public class Weather implements Spreadable{
	
	@CsvBindByName(column = "Day")
	private Integer day;

	@CsvBindByName(column = "MnT")
	private Integer minTemp;

	@CsvBindByName(column = "MxT")
	private Integer maxTemp;

	public Weather() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Weather(Integer day, Integer min_temp, Integer max_temp) {
		super();
		this.day = day;
		this.minTemp = min_temp;
		this.maxTemp = max_temp;
	}

	public Integer getDay() {
		return day;
	}

	public void setDay(Integer day) {
		this.day = day;
	}

	public Integer getMinTemp() {
		return minTemp;
	}

	public void setMinTemp(Integer minTemp) {
		this.minTemp = minTemp;
	}

	public Integer getMaxTemp() {
		return maxTemp;
	}

	public void setMaxTemp(Integer maxTemp) {
		this.maxTemp = maxTemp;
	}

	public Integer getSpread() {
		return maxTemp-minTemp;
	}

	@Override
	public boolean equals(Object obj) {

		if (obj == null || getClass() != obj.getClass()) {
            return false;
        } else {
        		Weather anotherWeather = (Weather) obj;
        		return day.equals(anotherWeather.getDay()) && minTemp.equals(anotherWeather.getMinTemp()) && maxTemp.equals(anotherWeather.getMaxTemp());
        }
		
	}

	@Override
	public String getIdentification() {
		return day.toString();
	}
	
	
	
	

}
