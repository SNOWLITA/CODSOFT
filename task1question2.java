import java.util.*;
 class main {
    public static void main (String [] args) {
        
        java.util.Scanner input = new java.util.Scanner(System.in);
        
        
        int randomNumberfrom_mintomax = (int)(Math.random() * 10000);
        
        System.out.print("Guess a number between 1 and 10000: ");
      
        int guess = input.nextInt();
        
        while (guess != randomNumberfrom_mintomax) {
            
            if (guess > randomNumberfrom_mintomax) {
                System.out.println("Sorry! your guess is too high");
            } else {
                System.out.println("Sorry! your guess is too low");
            }
           
            System.out.print("Please do make another guess : ");
            guess = input.nextInt();
        }
        
        System.out.println("Awesome ! You guessed the correct number");
    }
    }  
    
    