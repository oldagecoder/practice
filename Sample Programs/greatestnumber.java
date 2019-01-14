import java.util.Map;
import java.util.Collections;
import java.util.HashMap;
import java.io.*;
import java.util.Iterator;

public class greatestnumber{
    public static void main(String args[]){
        int [] arr = {1,1,1,2,2,2,2,3,3,3,4,4,5,5,5,8,8,8,8,8,2,2,2,2,2,2,2,2,2,5,5,5,5};
        Map<Integer,Integer> hmap = new HashMap<Integer ,Integer>();
        for (int i =0;i<arr.length;i++){
            if(hmap.containsKey(arr[i])){
                hmap.put(arr[i],hmap.get(arr[i])+1);
            }
            else hmap.put(arr[i],1);
        }
        int sum = 0;
        int num = 0;
        Iterator <Map.Entry<Integer, Integer>> itr = hmap.entrySet().iterator();
        while(itr.hasNext()){
            //Map.Entry entry = (Map.Entry) itr.next();
            Map.Entry<Integer,Integer> entry= itr.next();
            if(entry.getKey() * entry.getValue() > sum){
                sum = entry.getKey() * entry.getValue();
                num = entry.getKey();
            }
        }
        System.out.println(sum +" >--->> "+num);
    }
}