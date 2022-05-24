package com.company;

abstract class Animals {
    private String name;
    private int age;
    private int weight;

    public Animals(){
        age=weight = 0;
        name = "TM";
    }

    public Animals(String name,int age, int weight){
        this.name = name;
        this.age = age;
        this.weight =  weight;
    }
    public Animals(int age) {this.age = age;}
    public abstract void eat(String foodName);

    public abstract void getVoice();

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public int getAge() {return age;}
    public void setAge(int age) {this.age = age;}
    public int getWeight () {return weight;}
    public void setWeight (int weight) {this.weight =  weight;}
}
