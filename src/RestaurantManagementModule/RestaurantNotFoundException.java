package RestaurantManagementModule;

public class RestaurantNotFoundException extends RuntimeException
{
    public RestaurantNotFoundException(String message)
    {
        super(message);
    }
}
