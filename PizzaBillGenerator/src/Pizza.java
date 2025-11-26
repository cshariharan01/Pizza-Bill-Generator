public class Pizza {
    private int price;
    private Boolean veg;
    private int extraCheesePrice = 100;
    private int extraToppingPrice = 100;
    private int packingChargesPrice = 20;
    private int basePizzaPrice;
    private boolean isExtraCheeseAdded = false;
    private boolean isExtraToppingAdded = false;
    private boolean isOptedTakeaway = false;

    public Pizza(Boolean veg) {
        this.veg = veg;
        if(this.veg){
            this.price=300;
        }
        else{
            this.price=400;
        }
        basePizzaPrice = this.price;
    }
    public void addExtraCheese(){
        isExtraCheeseAdded = true;
        System.out.println("Extra Cheese Added");
        this.price = this.price + extraCheesePrice;
    }
    public void addExtraTopping(){
        isExtraToppingAdded = true;
        System.out.println("Extra Toppings Added");
        this.price = this.price + extraToppingPrice;
    }
    public void packingCharges(){
        isOptedTakeaway = true;
        System.out.println("Take away opted");
        this.price = this.price + packingChargesPrice;
    }
    public void generateBill(){
        System.out.println("Pizza Price: "+basePizzaPrice);
        if(isExtraCheeseAdded){
            System.out.println("Extra Cheese Price: "+extraCheesePrice);
        }
        if(isExtraToppingAdded){
            System.out.println("Extra Toppings Price: "+extraToppingPrice);
        }
        if(isOptedTakeaway){
            System.out.println("Packing Charges: "+packingChargesPrice);
        }
        System.out.println("Bill Amount: "+this.price);
    }


}
