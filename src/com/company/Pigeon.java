package com.company;

public class Pigeon extends Bird {
    private String speciesManthan56458;



    public Pigeon(String nameManthan56458, int ageManthan56458, int weightManthan56458, String featherColorManthan56458, String speciesManthan56458){
        super(nameManthan56458, ageManthan56458, weightManthan56458,featherColorManthan56458);
        this.speciesManthan56458= speciesManthan56458;
    }

    public Pigeon(int ageManthan56458, String featherColorManthan56458, String speciesManthan56458){
        super(ageManthan56458, featherColorManthan56458);
        this.speciesManthan56458=speciesManthan56458;
    }

    public void peckingWoodManthan56458(){
        System.out.println("The Pigeon is pecking wood");
    }

    @Override
    public void getVoiceManthan56458() {
        System.out.println("The Pigeon chirps");
    }

    @Override
    public void eatManthan56458(String FoodName) {
        System.out.println("The Pigeon is eating: "+ FoodName);
    }

    public String getSpeciesManthan56458() {
        return speciesManthan56458;
    }

    public void setSpeciesManthan56458(String speciesManthan56458) {
        this.speciesManthan56458 = speciesManthan56458;
    }

    @Override
    public String toString() {
        return "Pigeon{" +
                "speciesManthan56458='" + speciesManthan56458 + '\'' +
                '}';
    }
}
