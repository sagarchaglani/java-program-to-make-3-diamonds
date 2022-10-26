//Sagar chaglani
import java.util.Scanner;
public class horizontal_diamonds {
    public static void main(String[] args) {
        int i,j,r;
        r = 7; //total rows in each coulum

        for(i=1;i<r;i++) //loop for rows
        {
            for(j=5;j>=i;j--){ //inner loop for coulum space
                System.out.print(" ")
                ;
            }
            for(j=1;j<=i;j++){ //inner loop for priting star  after space
                System.out.print("* ");

            }
            for(int k=5;k>=i;k--) //loop for sapcing after first diamond
                System.out.print("  ");
            for(int k=1;k<=i;k++)// loop for printing second uper diamond
                System.out.print("* ");
            for(int k=5;k>=i;k--)//same for third diamond
                System.out.print("  ");
            for(int k=1;k<=i;k++)
                System.out.print("* ");



            System.out.println();
        }

        //for lower half of diamond
        for(i=1;i<r;i++) // rows
        {
            for(j=1;j<=i;j++)//coulums space
            {
                System.out.print(" ");
            }

            for(j=1;j<7-i;j++)//printing stars after coulums
            {
                System.out.print("* ");
            }
            for(int e=1;e<=i;e++) //for second diamond space
                System.out.print("  ");
            for (int m =1;m<7-i;m++)//printing
                System.out.print("* ");
            for(int e=1;e<=i;e++)
                System.out.print("  ");//for third diamong
            for (int m =1;m<7-i;m++)
                System.out.print("* ");

            System.out.println();
        }

    }
    }


