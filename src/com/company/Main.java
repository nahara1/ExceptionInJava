/*

Author: Nahara
Description: Java Exception - Try and Catch Homework

 */


package com.company;
import java.util.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        getNumber();


    }

        public static void getNumber () {
            Scanner scnr = new Scanner(System.in);

            int number;
            System.out.println("Enter a number: ");
            try {

                number = scnr.nextInt();


            } catch (InputMismatchException e) {
                System.out.println("Try again!\n");

                // recursion
                getNumber();
            }

        }


}
