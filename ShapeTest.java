package com.company;

public class ShapeTest {
    public static void main(String[] args) {
        Shape one = new Shape();
        one.setName("Прямоугольник");
        System.out.print(one.toString()+" Это - "+ one.getName() );
    }
}
