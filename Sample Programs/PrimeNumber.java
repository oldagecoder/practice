import java.io.*;
import java.util.Scanner;
public class PrimeNumber{
    public static void main(String args[]){
        int n;
        System.out.print("****");
        Scanner scan = new Scanner(System.in);
        boolean x = false;
        n = scan.nextInt();
        for (int i=2;i<= n/2;i++){
            if(n%i == 0) {
                x = true;
            }
            
        }
        if (x) System.out.print("not prime    " + n);
    else System.out.print("prime    " + n);;
    }
}