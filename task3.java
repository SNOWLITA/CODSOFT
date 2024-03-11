 
import java.util.*;  
  
 
 class ATM_INTERFACE
{  
     
    public static void main(String args[] )  
    {  
          
        int balance_amount = 100000, withdraw_amount, deposit_amount;  
          
         
        Scanner in = new Scanner(System.in);  
          
        while(true)  
        {  
            System.out.println("HI I am The ATM Machine \n I would provide the below services");  
            System.out.println("Choose 1 for Withdrawing the amount");  
            System.out.println("Choose 2 for Depositing the amount");  
            System.out.println("Choose 3 for Checking the Balance");  
            System.out.println("Choose 4 for QUITING");  
            System.out.print("Choose the operation that you want to perform:");  
              
         
            int choose_from_the_options_provided = in.nextInt();  
            switch(choose_from_the_options_provided)  
            {  
                case 1:  
        System.out.print("Enter the desired amount to be withdrawn:");  
                      
        
        withdraw_amount = in.nextInt();  
                      
        
        if(balance_amount >= withdraw_amount)  
        {  
            
            balance_amount = balance_amount - withdraw_amount;  
            System.out.println("Please do collect your money...Thank You");  
        }  
        else  
        {  
        
            System.out.println("Sorry Insufficient Balance :( )");  
        }  
        System.out.println("");  
        break;  
   
                case 2:  
                      
        System.out.print("Enter money to be deposited:");  
                      
        
        deposit_amount = in.nextInt();  
                      
      
        balance_amount = balance_amount + deposit_amount;  
        System.out.println("Your Money has been successfully deposited");  
        System.out.println("");  
        break;  
   
                case 3:  
        
        System.out.println("Balance : "+balance_amount);  
        System.out.println("");  
        break;  
   
                case 4:  
        
        System.exit(0);  
            }  
        }  
    }  
}  
