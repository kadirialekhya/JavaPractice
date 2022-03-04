package FullTimePrep.OOPS;

public class Encapsulation {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public static void main(String[] args) {
        Encapsulation e=new Encapsulation();
        e.setId("1");
        System.out.println(e.getId());
    }
}
