import java.util.Random;
import java.util.Scanner;
public class Main
{
    public static void main(String [] args)
    {
        int num;
        Random rand=new Random();
        Scanner sc=new Scanner(System.in);
            num=rand.nextInt(100);
            int number,i;
            for(i=5;i>0;i--)
            {
            System.out.println("try to Guess the number");
            number=sc.nextInt();
            if(number==num)
            {
            System.out.println(" congrants ,the number guessed is correct!  , it is "+num);
            System.exit(0);
            }
            else
            {
                System.out.println(" the number is wrong ,Guess again");
                System.out.println("you have only. "+(i-1)+" chances left  best of luck.");
                if(number > num)
                {
                    System.out.println(" the number guessed is greater, guess the number less than the  "+number);
                }
                if(number < num)
                {
                    System.out.println(" the guessed number is less than the number , guess the number greater than the  "+number);
                }
                if(i==1)
                {
                    System.out.println("the actual number is "+num);
                }
             
            }
            }
    }
}
