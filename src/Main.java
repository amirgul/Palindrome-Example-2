import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        char[] anArray = new char[50];
        boolean isTrue = isPalindrome(anArray,100);
        System.out.println("Is the given array is palindrome");
        System.out.println("Please enter yes or no");
        System.out.println(isTrue);
        System.out.println();


    }
    public static boolean isPalindrome(char[] a, int used)
    {
        int counter = 0;
        boolean istrue = true;
        int i = 0;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter a char for index: ");
        a[i] = keyboard.next().charAt(0);
        while (a[i] != '.')
        {
            i++;
            System.out.println("Enter a char for index: ");
            a[i] = keyboard.next().charAt(0);
            counter++;

        }

        for( i = 0; i<counter; i++)
        {
            a[i] = a[i];
           // System.out.println(a[i]);
        }

        //System.out.println();
        for(int k = counter-1; k>=0; k--)
        {

            if(a[k] != a[i-(k+1)])
            {
                istrue = false;
                //System.out.println(a[k]);

            }
            else
            {
                istrue = true;
               // System.out.println(a[k]);

            }

        }
        System.out.println(counter);
        return  istrue;

    }


}
