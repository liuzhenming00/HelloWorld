package com.Exercise;

public class PC extends Computer{
    private String brand;

    public PC(String CPU, int disk, int memory, String brand) {
        super(CPU, disk, memory);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void Info(){
        System.out.println(Detail() + "brand=" +brand);
    }
}
