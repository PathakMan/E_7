package com.company;

public class BlowFish extends Fish {
    private int diameterManthan56458;

    BlowFish(){
        super();
        diameterManthan56458=10;
    }

    public BlowFish(String nameManthan56458String , int ageManthan56458 , int weightManthan56458, String scaleColorManthan56458, int diameterManthan56458){
        super();
        this.diameterManthan56458=diameterManthan56458;

    }

    public BlowFish(int ageManthan56458, String scaleColorManthan56458, int diameterManthan56458){
        super();
        this.diameterManthan56458=diameterManthan56458;
    }

    public void swimManthan56458(){
        System.out.println("The BlowFish is swimming upstream");
    }

    @Override
    public void eatManthan56458(String FoodName) {
        System.out.println("The BlowFish is eating: "+ FoodName);
    }

    @Override
    public void getVoiceManthan56458() {
        System.out.println("The blowfish is howling");
    }

    public int getDiameterManthan56458() {
        return diameterManthan56458;
    }

    public void setDiameterManthan56458(int diameterManthan56458) {
        this.diameterManthan56458 = diameterManthan56458;
    }

    @Override
    public String toString() {
        return "BlowFish{" +
                "diameterManthan56458=" + diameterManthan56458 +
                '}';
    }
}
