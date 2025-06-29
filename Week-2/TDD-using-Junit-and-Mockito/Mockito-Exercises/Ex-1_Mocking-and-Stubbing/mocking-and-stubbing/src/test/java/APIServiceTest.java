import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import com.example.APIService;
import com.example.ExternalAPI;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;


public class APIServiceTest {
    @Test
    public void APIServiceTest() {
        ExternalAPI mockAPI = Mockito.mock(ExternalAPI.class);
        when(mockAPI.getAPIData()).thenReturn("Mock Data");
        APIService service = new APIService(mockAPI);
        String result = service.fetchAPIData();
        assertEquals("Mock Data", result);
    }
}
