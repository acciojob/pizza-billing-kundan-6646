package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int cPrice;
    private int tPrice;
    private boolean takeAway;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.bill = "";
        this.cPrice = 0;
        this.tPrice = 0;
        this.takeAway = false;
        if(isVeg) {
            this.price += 300;
            this.bill += "Base Price Of The Pizza: 300\n";
        }else {
            this.price += 400;
            this.bill += "Base Price Of The Pizza: 400\n";
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        this.price += 80;
        this.cPrice += 80;
    }

    public void addExtraToppings(){
        if(this.isVeg) {
            this.tPrice += 70;
            this.price += 70;
        }
        else {
            this.tPrice += 120;
            this.price += 120;
        }
    }

    public void addTakeaway(){
        this.price += 20;
        this.takeAway = true;
    }

    public String getBill(){
        this.bill += "Extra Cheese Added: " + this.cPrice + "\n";
        this.bill += "Extra Toppings Added: " + this.tPrice + "\n";
        if(takeAway) this.bill += "Paperbag Added: 20\n";
        this.bill += "Total Price: " + this.price;
        return this.bill;
    }
}
