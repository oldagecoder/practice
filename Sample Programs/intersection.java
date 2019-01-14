import java.util.Arrays;
import java.util.List;
import java.io.*;
import java.util.Collection;
import java.util.ArrayList;
public class intersection{
    public static void main(String args[]){
        ArrayList<String> l1 = new ArrayList<String> ();
        ArrayList<String> l2 = new ArrayList<String> (Arrays.asList("2","4","6","8"));
        ArrayList<String> l3 = new ArrayList<String> ();
        l1.add("1");
        l1.add("2");
        l1.add("3");
        l1.add("4");
        l1.add("5");
        l1.add("6");
        if(l1.size() > l2.size()) inter(l1,l2,l3);
        else inter(l2,l1,l3);
        System.out.println(l3);
    }
    public static void inter(List x, List y, List z){
        for(int i=0;i<x.size();i++){
                if(y.contains(x.get(i))) z.add(x.get(i)) ;
        }
    }
    
}