package com.company;
class Hamburger{
    private String name;
    private String meat;
    private double price;
    private String breadRollType;
    private String addition1Name;
    private String addition2Name;
    private String addition3Name;
    private String addition4Name;
    private double addition1Price;
    private double addition2Price;
    private double addition3Price;
    private double addition4Price;


    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }
    public void addHamburgerAddition1( String name,double price){
        this.addition1Price=price;
        this.addition1Name=name;
        System.out.println("Added "+ addition1Name+" for an extra "+addition1Price);
    }
    public void  addHamburgerAddition2(String name,double price){
        this.addition2Price=price;
        this.addition2Name=name;
        System.out.println("Added "+ addition2Name+" for an extra "+addition2Price);
    }
    public void addHamburgerAddition3(String name,double price){
        this.addition3Price=price;
        this.addition3Name=name;
        System.out.println("Added "+ addition3Name+" for an extra "+addition3Price);
    }
    public void addHamburgerAddition4(String name,double price){
        this.addition4Price=price;
        this.addition4Name=name;
        System.out.println("Added "+ addition4Name+" for an extra "+addition4Price);
    }
    public double itemizeHamburger(){
        double hamburger=this.price;
        System.out.println(this.name +" hamburger on a "+this.breadRollType+" roll "+"price is "+this.price);


        return this.addition1Price+this.addition4Price+this.addition3Price+this.addition2Price+this.price;
    }
}
class DeluxeBurger extends  Hamburger{
    public DeluxeBurger() {
        super("Deluxe","Sausage & Beacon", 14.54, "White Roll");

    }
    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("You cannot add any item for Deluxe");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("You cannot add any item for Deluxe");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("You cannot add any item for Deluxe");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("You cannot add any item for Deluxe");
    }

    @Override
    public double itemizeHamburger() {
        System.out.println("Added chips for an extra 2.75");
        double chips=2.75;
        System.out.println("Added drinks for an extra 1.81");
        double drink = 1.81;
            return drink+chips+super.itemizeHamburger();
    }
}
class HealthyBurger extends  Hamburger{
    private String healthyExtra1Name;
    private String healthyExtra2Name;
    private double healthyExtra1Price;
    private double healthyExtra2Price;


    public HealthyBurger(String meat, double price) {
        super("Healthy burger", meat, price, "Brown rye");
    }
    public void addHealthyAddition1( String meat,double price){
        this.healthyExtra1Name=meat;
        this.healthyExtra1Price=price;
        System.out.println("Added " + this.healthyExtra1Name + " for an extra "
                + this.healthyExtra1Price);

    }
    public void addHealthyAddition2 (String meat,double price){
        this.healthyExtra2Name=meat;
        this.healthyExtra2Price =price;
        System.out.println("Added " + this.healthyExtra2Name + " for an extra "
                + this.healthyExtra2Price);

    }

    @Override
    public double itemizeHamburger() {
        return this.healthyExtra1Price+this.healthyExtra2Price+super.itemizeHamburger();
    }
}


public class Main {
    /*
    Description:

The purpose of this application is to help a company called Bill's Burgers manage the process of selling their hamburgers.
 And in order to match Bill's menu, you will need to create three(3) classes, Hamburger, DeluxeBurger, and HealthyBurger.

For the base Hamburger class, there will need to be four variables to represent the four basic ingredients of the hamburger, name, meat, price, and breadRollType
. The price variable should be of type double, while the other three are of type String. A constructor will be needed to accept these four values as parameters when creating a new hamburger.

There will also need to be separate variables for four(4) possible additions to the hamburger.
 Those should be declared with these names: addition1Name, addition1Price, addition2Name, addition2Price, addition3Name, addition3Price, addition4Name, and addition4Price. The name variables should be of type String and the price variables should be of type double.

Five(5) methods are also needed inside the Hamburger class. Four(4) for adding up to four additions to the hamburger and one(1) for printing out an itemized listing of the final hamburger with addons, if any, and the total price
. Remember that a name and price must be accepted as parameters in the first four methods so that the price of the hamburger is adjusted accordingly.
 These methods should be named addHamburgerAddition1, addHamburgerAddition2, addHamburgerAddition3, addHamburgerAddition4, and itemizehamburger. The first four methods do not return values, but the last method does return the total price of the hamburger of type double,
  which includes the base price of the hamburger plus any additional items.

For the second class, DeluxeBurger, there are no additional member variables, and the constructor accepts no parameters. Instead, the constructor creates a deluxe burger with all the fixings and chips and a drink for a base price of $19.10.
 The constructor can be configured in any way, as long as chips and drink are added for the total price just mentioned
. In this class, the four(4) methods defined in the Hamburger class for including additional toppings must each be overridden so that a message is printed stating that no additional items can be added to a deluxe burger.

And for the third class, HealthyBurger, there will be four(4) additional member variables called healthyExtra1Name, healthyExtra1Price, healthyExtra2Name, and healthyExtra2Price.
 The names are type String and the prices are type double. The constructor for this class accepts two(2) parameters for meat and price.
 Those are set in the constructor along with an appropriate name for the type of burger.

Two methods, addHealthyAddition1 and addHealthyAddition2 should be created that each accept a name and price for the addition, allowing for up to two(2) addons to the basic healthy burger.
 And finally the itemizeHamburger method created in the Hamburger class should be overridden to generate a message appropriate to the type of burger along with any addons. The method also returns the total price of the healthy burger of type double.
     */

    public static void main(String[] args) {
	// write your code here
        Hamburger hamburger=new Hamburger("heart attck","sasage",3.56,"keizer");
        double price= hamburger.itemizeHamburger();


    }
}
