package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean extraCheese;
    private boolean extraToppings;
    private boolean takeAway;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.bill = "";
        this.extraCheese = false;
        this.extraToppings = false;
        this.takeAway = false;
        if(isVeg) this.price += 300;
        else this.price += 400;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(extraCheese) return;
        this.price += 80;
        this.extraCheese = true;
    }

    public void addExtraToppings(){
        if(extraToppings) return;
        if(this.isVeg) this.price += 70;
        else this.price += 120;
        this.extraToppings = true;
    }

    public void addTakeaway(){
        if(takeAway) return;
        this.price += 20;
        this.takeAway = true;
    }

    public String getBill(){
        if(isVeg) this.bill += "Base Price Of The Pizza: 300\n";
        else this.bill += "Base Price Of The Pizza: 400\n";

        if(extraCheese) this.bill += "Extra Cheese Added: 80\n";
        if(isVeg && extraToppings) this.bill += "Extra Toppings Added: 70\n";
        else if(!isVeg && extraToppings) this.bill += "Extra Toppings Added: 120\n";
        if(takeAway) this.bill += "Paperbag Added: 20\n";
        this.bill += "Total Price: " + this.price;
        return this.bill;
    }
}
