 import java.util.*;
 class main{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int minimum_number=1;
        int maximum_number=100;
        System.out.println("Random number between minimum number and maximum number is : ");
        int number=(int)(Math.random()*(maximum_number-minimum_number+1)+minimum_number);
        System.out.println(number);
    }
 }