package repository;

import RestaurantManagementModule.CuisineType;
import RestaurantManagementModule.MenuItem;
import RestaurantManagementModule.Restaurant;

import java.util.List;

public interface RestaurantRepository
{
    void addRestaurant(Restaurant restaurant);

    void setActivationStatus(boolean status);

    void updateMenuItem(MenuItem item);

    Restaurant getRestaurantById(long id);

    List<Restaurant> findRestaurantByLocation(String location);

    List<Restaurant> findRestaurantByName(String name);

    List<Restaurant> findRestaurantByType(CuisineType type);

    List<Restaurant> findAllActiveRestaurant();

    List<Restaurant> findAllDeactivatedRestaurant();
}
