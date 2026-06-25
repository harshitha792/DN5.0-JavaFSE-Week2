import static org.mockito.Mockito.*;

public class MockitoTest {

    public static void main(String[] args) {

        UserService service = mock(UserService.class);

        when(service.getName())
                .thenReturn("Harshitha");

        System.out.println(service.getName());
    }
}