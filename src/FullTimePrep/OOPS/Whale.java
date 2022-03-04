package FullTimePrep.OOPS;

public class Whale implements Animal{

    @Override
    public void habitat() {
        System.out.println("water");
    }

    @Override
    public void food() {
        System.out.println("insects");
    }
}
