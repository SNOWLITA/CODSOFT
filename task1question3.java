     
import java.util.*;
 
class GuessingGame {
 public static void main(String[] args) {
    
   int ans = (int)(Math.random() * 1000) + 1;
    
   int number_of_tries = 3;
    
   Scanner in = new Scanner(System.in);
    
   boolean correct = false;
   System.out.println("I'm thinking of a number between 1 and 1000.\nYou have only 3 tries to guess the number.");
   while (number_of_tries > 0) {
     System.out.println("Enter your guess and pls do wait: ");
    int guess_the_number = in.nextInt();
      
     if (guess_the_number == ans) {
       System.out.println("Great! You guessed the number!\nYou win!\nYour score is : 10");
       break;
     }
      
     else if (guess_the_number > ans) {
       System.out.println("Your guess is too high.\nYou have " + (number_of_tries - 1) + " tries left.");
       number_of_tries--;
     }
      
     else {
       System.out.println("Your guess is too low.\nYou have " + (number_of_tries - 1) + " tries left.");
     }
      
     number_of_tries--;
   }
   
   if (correct == false) {
     System.out.println("You ran out of tries.\nYou lose!\nYour score is: 0 ");
   }
 }
}
