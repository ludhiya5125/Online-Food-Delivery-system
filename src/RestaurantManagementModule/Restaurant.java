package RestaurantManagementModule;

import java.time.LocalTime;
import java.util.List;

public class Restaurant
{
    protected long restaurantId;
    protected String name;
    protected String location;
    protected CuisineType cuisineType;
    protected LocalTime openingTime;
    protected LocalTime closingTime;
    protected boolean isActive;
    protected List<MenuItem> menuItems;
    public Restaurant(long restaurantId,String name, String location, CuisineType cusineType, LocalTime openingTime,LocalTime closingTime)
    {
        this.restaurantId=restaurantId;
        this.name=name;
        this.location=location;
        this.cuisineType=cusineType;
        this.openingTime=openingTime;
        this.closingTime=closingTime;
        this.isActive=true;
    }

    public long getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(long restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public CuisineType getCuisineType() {
        return cuisineType;
    }

    public void setCuisineType(CuisineType cuisineType) {
        this.cuisineType = cuisineType;
    }

    public LocalTime getOpeningTime() {
        return openingTime;
    }

    public void setOpeningTime(LocalTime openingTime) {
        this.openingTime = openingTime;
    }

    public LocalTime getClosingTime() {
        return closingTime;
    }

    public void setClosingTime(LocalTime closingTime) {
        this.closingTime = closingTime;
    }

    public static boolean isActive(boolean status) {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }
/* public void active(boolean status)
    {
        mode=true;
    }
    public void deactive(boolean status)
    {
        mode=false;
    }*/
    /*  public void addItemtoMenuCard(String item, double price) {
        MenuCard.put(item, price);
    }

    public void updateItemtoMenuCard(String item, double price) {
        if (MenuCard.containsKey(item)) {
            MenuCard.put(item, price);
        } else {
            throw new RestaurantNotFoundException("Item not found in the menu.");
        }
    }
    /*public void browseMenuCard()
    {
        for (Map.Entry<String, Double> entry : MenuCard.entrySet()) {
            System.out.println(entry.getKey() + "-$" + entry.getValue());
        }
    }*/

    public void display() {
        System.out.println("RestaurantID:"+restaurantId);
        System.out.println("RestaurantName: " + name);
        System.out.println("Location: " + location);
        System.out.println("CusineType:"+cuisineType);
        System.out.println("Opening time:"+openingTime);
        System.out.println("Closing Time:"+closingTime);
        System.out.println("Active: " + isActive);
    }

    //updating menu items
    public void updateMenuItem(MenuItem item) {
        for (MenuItem menuItem : menuItems) {
            if (menuItem.getName().equals(item.getName())) {
                menuItem.setPrice(item.getPrice());
                menuItem.setType(item.getType());
                menuItem.setCalorieCount(item.getCalorieCount());
                // Optionally update other attributes of MenuItem as needed
                break;
            }
        }
    }




   /* public void displayMenu() {
        System.out.println("Menu for " + name + ":");
        for (Map.Entry<String, Double> entry : MenuCard.entrySet()) {
            System.out.println(entry.getKey() + " - $" + entry.getValue());
        }*/
    }



