package ru.mirea.lab1.Homework24;

public class MagicalChair extends SuperChair implements Chair {

    private String Material;
    private String Legs;
    private String Back;

    public MagicalChair(String material, String legs, String back) {
        this.Material = material;
        this.Legs = legs;
        this.Back = back;
    }

    @Override
    public String getMaterial() {
        return Material;
    }

    @Override
    public String getLegs() {
        return Legs;
    }

    @Override
    public String chairBack() {
        return Back;
    }


    @Override
    public void Seat() {

    }
}
