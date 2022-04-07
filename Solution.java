/**************************************************************************************
***************************************************************************************
Problem : Given three values - Start Fahrenheit Value (S), End Fahrenheit value (E) and 
Step Size (W), you need to convert all Fahrenheit values from Start to End at the gap of 
W, into their corresponding Celsius values and print the table.
ALgorithm :
01. Taking 3 input from user
02. Stores input in S, E, W respevtively
03. Using Scanner s = new Scanner (System.in); for taking input from user.
04. Applying for loop for doing same tasks several no of times : 
    for (int fah = S; fah <= E; fah = fah+W)
05. Appliying Celsius Formula= ((fah-32)*5)/9
06. Using : System.out.print(fah + " " + celesius) :  For required output
    is like : fah followed by a single space and their respective celsius.
07. Again using system.out.println() : For cursor jumps to next line everytimes the 
    output comes .     
Time Complexity :  O((e-s)/g+1) 
Space Complexity : O(1)

****************************************************************************************
***************************************************************************************/




import java.util.Scanner;
public class Solution {


    public static void main(String[] args) {
        int celsius = 0;
        Scanner s = new Scanner (System.in);
        int S = s.nextInt();
        int E = s.nextInt();
        int W = s.nextInt();

        for(int fah = S; fah <= E; fah=fah+W)
        {
            celsius =  ((fah-32)*5)/9;
            System.out.print(fah + " " + celsius);
            System.out.println();

        }
    }

}
