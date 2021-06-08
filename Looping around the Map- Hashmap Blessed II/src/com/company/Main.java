package com.company;

import java.util.*;
public class Main {

    public static void main(String[] args) {

        HashMap<String, ArrayList<String>> vehicles = new HashMap<String, ArrayList<String>>();
        // key is the model and make is the value.


        vehicles.put("Toyota", new ArrayList<String>(Arrays.asList("Corolla", "Tacoma", "Rav4")));
        vehicles.put("Ford", new ArrayList<String>(Arrays.asList("Focus", "Ranger", "Explorer")));
        vehicles.put("Honda", new ArrayList<String>(Arrays.asList("Civic", "Ridgeline", "CR-V")));
        vehicles.put("Chevy", new ArrayList<String>(Arrays.asList("Malibu", "Silverado", "Suburban")));
        vehicles.put("Jeep", new ArrayList<String>(Arrays.asList("Wrangler", "Grand Cherokee", "Gladiator")));
        // we have domestic and internation options here at Fred's used car dealership
al

        Scanner sc = new Scanner(System.in);
        // the scanner scanning for input



        System.out.println("What kind of car are we looking for today?");
        String input = sc.nextLine();
        // we are taking in input here


        if(vehicles.containsKey(input)) {
            System.out.println("Oh, you're looking for a " + input + "?" + " We have these right over here!" );
            // the machine checks for presence of vehicle


            ArrayList<String> list = vehicles.get(input);


            for (String make : list) {
                System.out.println("Make: " + input + " Model: " + make);
            }
            // if the presence is detected then we print all of the makes that are available for that vehicle.
        }else {

            System.out.println("Sorry we currently do not have any " + input + " vehicle");
            // if we don't have it then we print the message above
        }
    }
    }

