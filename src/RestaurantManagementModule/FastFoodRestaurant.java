package RestaurantManagementModule;

import java.time.LocalTime;

public class FastFoodRestaurant extends Restaurant {
    private float rating;

    public FastFoodRestaurant(int restaurantId, String name, String location, CuisineType cuisineType, LocalTime openingTime, LocalTime closingTime)
    {
        super(restaurantId,name,location,cuisineType,openingTime,closingTime);
        this.rating=rating;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public void display()
    {
        super.display();
        System.out.println("Rating:"+rating);
    }

    }

