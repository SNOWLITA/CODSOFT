import java.util.*;

 class Grade_and_percentage_calculator
{
    public static void main(String args[])
    { 
        int marks[] = new int[5];
        int i;
        float grandtotal=0, average;
        Scanner in = new Scanner(System.in);
		
        
        for(i=0; i<5; i++) { 
       System.out.print("Please enter the marks of Subject"+(i+1)+":");
         
           marks[i] = in.nextInt();
           grandtotal = grandtotal + marks[i];
        }
        in.close();
        
        average = grandtotal/5;
        
        System.out.println("The student Percentage is : "+average);
        System.out.println("The student's total mark is : "+grandtotal);
        System.out.print("The student grade is : ");
        
        if(average>=80)
        {
            System.out.print("Grade A ");
        }
        else if(average>=60 && average<80)
        {
           System.out.print("Grade B ");
        } 
        else if(average>=40 && average<60)
        {
            System.out.print("Grade C");
        }
        else
        {
            System.out.print("Grade D");
        }
        
    }
}