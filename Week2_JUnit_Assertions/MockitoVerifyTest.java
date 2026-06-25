import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.*;

public class MockitoVerifyTest {

    public static void main(String[] args) {

        UserService service = mock(UserService.class);

        service.getName();

        verify(service).getName();

        System.out.println("Method verified successfully");
    }
}