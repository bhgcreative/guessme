/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practiceprogramming6;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author briangreen
 */
public class GuessMeFinally {
    public static void main(String[] args) {
       
        int guess;
        int guesscount = 1;
       
        //create random number and set high low limits
        //int random = (int)(Math.random() * 100 - 100);
        //int random = -1;
        
        Scanner myScanner = new Scanner(System.in);
        //Random randomNumber = new Random();
        
        int random = (int)(Math.random() * 100 + 1);
                 
        System.out.println("I've chosen a number. Betcha can't guess it!");
        //put this in here for testing
        //System.out.println(random);
        System.out.print("Pick a Number between -100 and 100: ");
        
        guess = myScanner.nextInt();
      
        //If they get it correct the first time run an if statement.
        if (guess == random) {
            
            System.out.println("You nailed it! It took you 1 try.");
            
        } else {
            
            //yes guess a first time!
            boolean guessagain = true;
            
            //run a loop until it is not true
            while (guessagain) {
                
                if (random < guess) {
                        System.out.println("To bad that's too high. Try again!");
                        System.out.print("Guess again: ");
                        guess = myScanner.nextInt();
                        guesscount++;
                    } else if (random > guess) {
                        System.out.println("To bad that's too low. Try again!");
                        System.out.print("Guess again: ");
                        guess = myScanner.nextInt();
                        guesscount++;
                    } else {
                        guessagain = false;
                        System.out.println("You nailed it! It took you " + guesscount + " tries.");                             
                    }
                
                   
                }
            }
        
    }
}

