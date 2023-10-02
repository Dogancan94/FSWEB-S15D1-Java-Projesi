package com.workintech.grocery.main;

import com.workintech.grocery.models.Grocery;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> grocery = new LinkedList<>();
        startGrocery(grocery);
    }

    public static void startGrocery(List<String> groceryList) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Yapmak istediğiniz işlemi giriniz:");
                int process = scanner.nextInt();
                if (process < 0 || process > 2) {
                    System.out.println("Process must be between 0-2");
                }

                if (process == 0) {
                    System.exit(0);
                }

                if (process == 1) {
                    Grocery.addItems(groceryList);
                }

                if (process == 2) {
                    Grocery.removeItems(groceryList);
                }
            } catch (Exception ex) {
                System.out.println("Invalid process: " + ex.getMessage());
                break;
            }
        }
    }
}