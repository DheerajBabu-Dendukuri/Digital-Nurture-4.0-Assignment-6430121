import com.example.ExternalAPI;
import com.example.MyService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.verify;

public class MyServiceTest {
    @Test
    public void testInteraction(){
        ExternalAPI mockAPI = Mockito.mock(ExternalAPI.class);

        MyService service = new MyService(mockAPI);

        service.fetchData();

        verify(mockAPI).getData();

    }
}
