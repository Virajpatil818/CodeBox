package viraj;

public class Weather {
	  float day_of_month;
      float highTemp;
      float lowTemp;
      float amountRain;
      float amountSnow;
      
      Weather(){
    	  day_of_month = 0;
    	  highTemp = 0;
    	  lowTemp = 0;
    	  amountRain = 0;
    	  amountSnow = 0;
      }

	public float getDay_of_month() {
		return day_of_month;
	}

	public void setDay_of_month(float day_of_month) {
		this.day_of_month = day_of_month;
	}

	public float getHighTemp() {
		return highTemp;
	}

	public void setHighTemp(float highTemp) {
		this.highTemp = highTemp;
	}

	public float getLowTemp() {
		return lowTemp;
	}

	public void setLowTemp(float lowTemp) {
		this.lowTemp = lowTemp;
	}

	public float getAmountRain() {
		return amountRain;
	}

	public void setAmountRain(float amountRain) {
		this.amountRain = amountRain;
	}

	public float getAmountSnow() {
		return amountSnow;
	}

	public void setAmountSnow(float amountSnow) {
		this.amountSnow = amountSnow;
	}
      
    
}
