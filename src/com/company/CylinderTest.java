package com.company;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);
        cylinder = new Cylinder(12);
        System.out.println(cylinder);
        cylinder =new Cylinder(12,"yellow",14);
        System.out.println(cylinder);
    }
}
