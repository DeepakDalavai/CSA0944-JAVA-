class Forecast {
    protected String date;
    protected double temperature;
    public Forecast(String date, double temperature) {
        this.date = date;
        this.temperature = temperature;
    }
    public void displayForecast() {
        System.out.println("Forecast for: " + date);
        System.out.println("Temperature: " + temperature + "°C");
    }

    public void predictWeather() {
        System.out.println("Predicting general weather");
    }
}

class SunnyForecast extends Forecast {
    private String sunIntensity;

    public SunnyForecast(String date, double temperature, String sunIntensity) {
        super(date, temperature);
        this.sunIntensity = sunIntensity;
    }

    @Override
    public void predictWeather() {
        System.out.println("It will be sunny today with " + sunIntensity + " intensity of sunlight.");
    }

    public void displaySunnyForecast() {
        displayForecast();
        System.out.println("Sun Intensity: " + sunIntensity);
    }
}

class RainyForecast extends Forecast {
    private double rainfallAmount;

    public RainyForecast(String date, double temperature, double rainfallAmount) {
        super(date, temperature);
        this.rainfallAmount = rainfallAmount;
    }

    @Override
    public void predictWeather() {
        System.out.println("It will rain today with " + rainfallAmount + " mm of rain.");
    }

    public void displayRainyForecast() {
        displayForecast();
        System.out.println("Rainfall Amount: " + rainfallAmount + " mm");
    }
}

public class R192210646 {
    public static void main(String[] args) {
        SunnyForecast sunnyForecast = new SunnyForecast("2024-11-09", 25.5, "moderate");
        RainyForecast rainyForecast = new RainyForecast("2024-11-09", 18.0, 12.3);

        sunnyForecast.displaySunnyForecast();
        sunnyForecast.predictWeather();

        rainyForecast.displayRainyForecast();
        rainyForecast.predictWeather();
    }
}
