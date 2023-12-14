package com.driver;

public class Main {

    // Task 1: Create a class Product inside Main class
    public static class Product {
        
        // Task 3: Create a method with the given definition
        public int product(int x, int y) {
            return x * y;
        }

        // Task 4: Create an overloaded method
        public int product(int x, int y, int z) {
            return x * y * z;
        }

        // Task 5: Create another overloaded method
        public double product(double x, double y) {
            return x * y;
        }
    }

    // Task 2: Create an object of Product in the Main function called p
    public static void main(String[] args) {
        Product p = new Product();

        // Task 3: Call the method with int parameters
        int result1 = p.product(2, 3);
        System.out.println("Result 1: " + result1);

        // Task 4: Call the overloaded method with int parameters
        int result2 = p.product(2, 3, 4);
        System.out.println("Result 2: " + result2);

        // Task 5: Call the overloaded method with double parameters
        double result3 = p.product(2.5, 3.5);
        System.out.println("Result 3: " + result3);
    }
}
