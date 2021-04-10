package com.atsignjar;

import java.util .*;

public class Inheritance {

    class Person {
        protected String firstName;
        protected String lastName;
        protected int idNumber;

        // Constructor
        Person(String firstName, String lastName, int identification) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.idNumber = identification;
        }

        // Print person data
        public void printPerson() {
            System.out.println(
                    "Name: " + lastName + ", " + firstName
                            + "\nID: " + idNumber);
        }

    }

    static class Student extends Person {
        private int[] testScores;

        /*
         *   Class Constructor
         *   S
         *   @param firstName - A string denoting the Person's first name.
         *   @param lastName - A string denoting the Person's last name.
         *   @param id - An integer denoting the Person's ID number.
         *   @param scores - An array of integers denoting the Person's test scores.
         */
        // Write your constructor here
        Student(String firstName, String lastName, int identification, int[] testScores) {
            super(firstName, lastName, identification);

            this.testScores = testScores;
        }

        /*
         *   Method Name: calculate
         *   @return A character denoting the grade.
         */
        // Write your method here
        char calculate() {
            int average = 0;
            for (int i = 0; i < testScores.length; i++) {
                average += testScores[i];
            }
            int a = average / testScores.length;

            if (100 >= a && a >= 90) {
                return 'O';
            } else if (90 > a && a >= 80) {
                return 'E';
            } else if (80 > a && a >= 70) {
                return 'A';
            } else if (70 > a && a >= 50) {
                return 'P';
            } else if (55 > a && a >= 40) {
                return 'D';
            } else return 'T';

        }
    }

    static class Solution {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String firstName = scan.next();
            String lastName = scan.next();
            int id = scan.nextInt();
            int numScores = scan.nextInt();
            int[] testScores = new int[numScores];
            for (int i = 0; i < numScores; i++) {
                testScores[i] = scan.nextInt();
            }
            scan.close();

            Student s = new Student(firstName, lastName, id, testScores);
            s.printPerson();
            System.out.println("Grade: " + s.calculate());
        }
    }
}

