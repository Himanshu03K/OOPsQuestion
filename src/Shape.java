/*
Q1) Write a program to create a class named shape. It should contain 2 methods, draw() and erase()
     that prints “Drawing Shape” and “Erasing Shape” respectively.
 */


import java.util.Scanner;

    public class Shape {
        void draw(){
            System.out.println("Drawing Shape");
        }

        void erase(){
            System.out.println("Erasing Shape");
        }
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            Shape obj = new Shape();
            obj.draw();
            obj.erase();
        }
    }

