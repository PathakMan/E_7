package com.company;

public class Animals {

    public static void main(String[] args)
    {
        Animal animal[]= new Animal[6];

        animal[0]=new Mammal("Little brown",2,3,"Bat");
        animal[1]=new Dog("Tom",3,16,"Carnivora","German Shepard");
        animal[2]=new Fish("Catfish", 5 , 2, "Grey");
        animal[3]=new BlowFish("Kevin",2,5,"Purple",10);
        animal[4]=new Bird("Falcon",4,10,"Brown");
        animal[5]=new Pigeon("Smith",3,4,"Grey","Argentina");

        animal[2].getVoiceManthan56458();
        animal[4].getVoiceManthan56458();
    }
}
