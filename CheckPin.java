import java.util.Scanner;

public class CorrectPin{
    public static void main(String args[])
    {
        int n=123,pin,count=0;
        Scanner sc=new Scanner(System.in);



        for(int i=0;i<3;i++) {
            count++;
            System.out.println("Enter the pin");
            pin= sc.nextInt();
            if (pin == n) {
                System.out.print("Correct, welcome back.");
                break;
            }
            else {
                System.out.println("Incorrect, try again");
            }
        }
        if(count==3)
        {
            System.out.println("Sorry, but you have been locked out");
        }
    }
}
