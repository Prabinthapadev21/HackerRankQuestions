import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                System.out.println("Enter the string");
                String s1=sc.nextLine();
                System.out.println("Enter the number");
                int x=sc.nextInt();
                //Complete this line
                System.out.print(s1);
                if(x>100 && x<1000)
                {
                    System.out.print(x);
                }
                else
                {
                    System.out.print("0"+x);
                }
                System.out.println();
            }
            System.out.println("================================");

    }
}



