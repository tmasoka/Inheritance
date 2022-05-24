package com.company;

public class AnimalMain {
    public static void main(String[] args){
        Animals animal[] = new Animals[6];

        animal[0] = new Mammal("Little brown",2,3,"Bat");
        animal[1] = new Dog("Brutus",6,20,"Pitbull");
        animal[2] = new Bird("Falcon",3,4,"Blue","Predator");

        animal[1].getVoice();
        animal[2].getVoice();
    }
}
