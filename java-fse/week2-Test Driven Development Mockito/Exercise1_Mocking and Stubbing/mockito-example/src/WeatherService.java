public class WeatherService {
    private final WeatherApiClient apiClient;

    public WeatherService(WeatherApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public String fetchWeatherReport(String city) {
        String weather = apiClient.getWeather(city);
        return "Weather in " + city + ": " + weather;
    }
}
