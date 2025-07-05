import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class WeatherServiceTest {

    @Test
    public void testFetchWeatherReport() {
        // Mock the external API
        WeatherApiClient mockApiClient = mock(WeatherApiClient.class);

        // Stub the method
        when(mockApiClient.getWeather("Hyderabad")).thenReturn("Cloudy");

        // Inject mock into service
        WeatherService service = new WeatherService(mockApiClient);

        // Call the method under test
        String result = service.fetchWeatherReport("Hyderabad");

        // Verify output
        assertEquals("Weather in Hyderabad: Cloudy", result);

        // Verify interaction
        verify(mockApiClient).getWeather("Hyderabad");
    }
}
