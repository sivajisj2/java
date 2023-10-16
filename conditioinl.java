import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

class jb{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter temperature in celcius : ");
        int temperature = scan.nextInt();
        if(temperature >= 20 && temperature<=30)
        System.out.println("it's a nice day");
        else if (temperature>30)
        System.out.println(" ohh!!!!!!!!!!!!....it's a hot day");
        else
        System.out.println("it's Cold");
        /*  *****************************************************
Using Ternary operator: 
*/
String result = temperature > 30 ? "It's a hot day" : "it's normal";
System.out.println(result);
    }
}

