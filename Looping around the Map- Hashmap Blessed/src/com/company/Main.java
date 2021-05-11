package com.company;

import java.util.ArrayList;
import java.util.Scanner;




public class Main {

    public static void main(String[] args) {

        ArrayList<Double> list = new ArrayList<>();
        // test arrays

        Scanner sc = new Scanner(System.in);
        // scanner scanning for input


        for(int i = 0; i < 5; i++) {
            System.out.println("Let me get five random numbers fam. " + (i + 1));
            list.add(sc.nextDouble());
        }
        // we are taking input here


        double sum = 0, product = 1, largest = list.get(0), smallest = list.get(0);
        // we are declaring the variables here with the appropriate value


        for(int i = 0; i < 5; i++) {
            sum += list.get(i); // add the element to the sum
            product *= list.get(i); // multiplying the element to product

            largest = Math.max(largest, list.get(i)); // checking whether the current element is largest
            smallest = Math.min(smallest, list.get(i)); // checking whether the current element is smallest
        }
        // we are looping here


        System.out.println("The sum is: " + sum);
        System.out.println("The product is: " + product);
        System.out.println("The largest is: " + largest);
        System.out.println("The smallest is: " + smallest);
        // last but not least we are printing the final values here
    }
}