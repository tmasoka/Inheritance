package com.company;

public class Bird extends Animals{
    private String type;

    public Bird(){
        super();
        type = "TM";
    }
    public Bird(String name, int age , int weight,String colour, String type){
        super(name, age, weight);
        this.type = type;
    }

    public Bird(int age,String order){
        super(age);
        this.type = type;
    }

    public void flee() {System.out.println("Fly Away");}

    @Override
    public void eat(String foodName) { System.out.println("Bird is eating: " + foodName);}

    @Override
    public void getVoice() {System.out.println("Bird is making sounds");}

    public String getOrder() {return type;}

    public void setOrder(String order) {this.type = type;}

    @Override
    public String toString(){
        return "Bird{" +
                "type= " + type + '\'' +
                '}';
    }

}
