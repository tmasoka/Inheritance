package com.company;

public class Dog extends Mammal{
    private  String breed;

    Dog(){
        super();
        breed = "TN";
    }

    public Dog(String name, int age , int weight, String breed){
        super(name, age, weight,breed);
        this.breed = breed;
    }

    public Dog(int age,String breed){
        super(age,breed);
        this.breed = breed;
    }

    public void abort() {System.out.println("The dog is retrieving.");}

    @Override
    public void eat(String foodName) { System.out.println("The dog is eating: " + foodName);}

    @Override
    public void drinkmilk() {System.out.println("The dog is drinking milk.");}

    @Override
    public void getVoice() {System.out.println("The dog is barking.");}

    public String getOrder() {return breed;}

    public void setOrder(String order) {this.breed = breed;}

    @Override
    public String toString(){
        return "Mammal{" +
                "breed= " + breed + '\'' +
                '}';
    }

}
