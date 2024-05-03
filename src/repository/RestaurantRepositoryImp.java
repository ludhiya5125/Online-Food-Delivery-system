package repository;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import RestaurantManagementModule.*;

import java.util.*;
import java.util.stream.Collectors;


public abstract class RestaurantRepositoryImp implements RestaurantRepository {
    private Map<Long, Restaurant> restaurants;

    public void RestaurantRepositoryImpl() {
        restaurants = new HashMap<>();
        init();
    }

    public void init() {
        // Creating and adding restaurants
        Restaurant restaurant1 = new FastFoodRestaurant(1, "Fast Food Place","123 Main St", CuisineType.,
                LocalTime.of(10, 0), LocalTime.of(22, 0),
                List.of(new MenuItem("Burger", 5.99, ItemType.NON_VEG, 500)),
                true);
        Restaurant restaurant2 = new FineDiningRestaurant(2, "Fine Dining Place","456 Oak St", CuisineType.,
                LocalTime.of(18, 0), LocalTime.of(23, 0),
                List.of(new MenuItem("Pasta", 15.99, ItemType.NON_VEG, 700)),
                true, true, true, 100, 50, 20, 100, 10, "Live Music Every Friday", true, 4.8);

        addRestaurant(restaurant1);
        addRestaurant(restaurant2);
    }


    public void addRestaurant(Restaurant restaurant) {
        restaurants.put(restaurant.getRestaurantId(), restaurant);
    }

    @Override
    public void setActivationStatus(boolean status)
    {
        for (Restaurant restaurant : restaurants.values()) {
            restaurant.isActive(status);
        }
    }

    public void updateMenuItem(MenuItem item)
    {
        for (Restaurant restaurant : restaurants.values()) {
            restaurant.updateMenuItem(item);
        }
    }
    @Override
    public Restaurant getRestaurantById(long id) {
        return restaurants.get(id);
    }
    @Override
    public List<Restaurant> findRestaurantByLocation(String location) {
        List<Restaurant> foundRestaurants = new ArrayList<>();
        restaurants.values().stream()
                .filter(restaurant -> restaurant.getLocation().equalsIgnoreCase(location))
                .forEach(foundRestaurants::add);
        return foundRestaurants;
    }
    @Override
    public List<Restaurant> findRestaurantByName(String name) {
        List<Restaurant> foundRestaurants = new ArrayList<>();
        restaurants.values().stream()
                .filter(restaurant -> restaurant.getName().equalsIgnoreCase(name))
                .forEach(foundRestaurants::add);
        return foundRestaurants;
    }

    @Override
    public List<Restaurant> findRestaurantByType(CuisineType type) {
        List<Restaurant> foundRestaurants = new ArrayList<>();
        restaurants.values().stream()
                .filter(restaurant -> restaurant.getCuisineType() == type)
                .forEach(foundRestaurants::add);
        return foundRestaurants;
    }
    @Override
    public List<Restaurant> findAllActiveRestaurant() {
        return restaurants.values().stream()
                .filter(Restaurant::isActive)
                .collect(Collectors.toList());
    }


    @Override
    public List<Restaurant> findAllDeactivatedRestaurant() {
        List<Restaurant> deactivatedRestaurants = new ArrayList<>();
        restaurants.values().stream()
                .filter(restaurant -> !restaurant.isActive(false))
                .forEach(deactivatedRestaurants::add);
        return deactivatedRestaurants;
    }
    }









