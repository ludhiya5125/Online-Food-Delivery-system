package RestaurantManagementModule;

import java.time.LocalTime;

public class FineDiningRestaurant extends Restaurant
{
    private boolean parkingAvailability;
    public FineDiningRestaurant(int restaurantId, String name, String location, CuisineType cuisineType, LocalTime openingTime, LocalTime closingTime)
    {
        super(restaurantId,name,location,cuisineType,openingTime,closingTime);

    }

    public boolean isParkingAvailability() {
        return parkingAvailability;
    }

    public void setParkingAvailability(boolean parkingAvailability) {
        this.parkingAvailability = parkingAvailability;
    }

    public void display()
    {
        super.display();
        System.out.println("Parking Availability:"+parkingAvailability);
    }
}
