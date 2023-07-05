package com.Exercise;

public class Computer {
    private String CPU;
    private int disk;
    private int memory;

    public Computer(String CPU, int disk, int memory) {
        this.CPU = CPU;
        this.disk = disk;
        this.memory = memory;
    }
    public String Detail(){
        return "信息如下：" + " CPU=" +CPU + " disk=" + disk +" memory=" + memory;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public int getDisk() {
        return disk;
    }

    public void setDisk(int disk) {
        this.disk = disk;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }
}
