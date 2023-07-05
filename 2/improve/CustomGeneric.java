package com.improve;

public class CustomGeneric {
    public static void main(String[] args) {
        Tiger<Double, String, Integer> john = new Tiger<>("john");
        john.setT(10.9);
        System.out.println(john);
        Tiger john1 = new Tiger("john");
        john1.setR("yy");
        System.out.println(john1);
    }
}
class Tiger<T,R,N>{
    String name;
    R r;
    N n;
    T t;

    public Tiger(String name) {
        this.name = name;
    }

    public Tiger(R r, N n, T t) {

        this.r = r;
        this.n = n;
        this.t = t;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public R getR() {
        return r;
    }

    public void setR(R r) {
        this.r = r;
    }

    public N getN() {
        return n;
    }

    public void setN(N n) {
        this.n = n;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    @Override
    public String toString() {
        return "Tiger{" +
                "name='" + name + '\'' +
                ", r=" + r +
                ", n=" + n +
                ", t=" + t +
                '}';
    }
}
