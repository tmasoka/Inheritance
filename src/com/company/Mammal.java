package com.company;

public class Mammal extends Animals{
    private String order;

    public Mammal(){
        super();
        order = "TM";
    }
    public Mammal(String name, int age , int weight, String order){
        super(name, age, weight);
        this.order = order;
    }

    public Mammal(int age,String order){
        super(age);
        this.order =  order;
    }

    public void drinkmilk() {System.out.println("Sip Sip");}

    @Override
    public void eat(String foodName) { System.out.println("Mammal is eating: " + foodName);}

    @Override
    public void getVoice() {System.out.println("Mammal is making sounds");}

    public String getOrder() {return order;}

    public void setOrder(String order) {this.order = order;}

    @Override
    public String toString(){
        return "Mammal{" +
                "order= " + order + '\'' +
                            '}';
    }

}

