package FullTimePrep.OOPS;

public class MyClass {
    public static void main(String[] args) {
        Animal lion=new Lion();
        lion.habitat();
        lion.food();
        System.out.println();
        Animal whale=new Whale();
        whale.food();
        whale.habitat();
    }
}
