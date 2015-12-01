package com.gerryger.starbuzz;

/**
 * Created by user on 2015-12-01.
 */
public class Drink {
    private String name;
    private String description;
    private int imageResourceID;

    public static final Drink[] drinks = {
            new Drink("Latte", "A couple of espresso shots with steamed milk", R.drawable.latte),
            new Drink("Cappuccino", "Espresso, hot milk, and steamed milk foam", R.drawable.cappuccino),
            new Drink("Filter", "Highest quality beans roasted and brewed fresh", R.drawable.filter)
    };

    private Drink(String name, String description, int imageResourceID){
        this.name = name;
        this.description = description;
        this.imageResourceID = imageResourceID;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public String getDescription(){
        return this.description;
    }

    public void setImageResourceID(int imageResourceID){
        this.imageResourceID = imageResourceID;
    }

    public int getImageResourceID(){
        return this.imageResourceID;
    }
}
