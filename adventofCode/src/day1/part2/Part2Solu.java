package day1.part2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Part2Solu {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("D:\\adventofcode2024\\adventofcode2024\\adventofCode\\src\\day1\\part2\\input.txt"));
        String line=br.readLine();
        List<Integer> arr1=new ArrayList<>();
        List<Integer> arr2=new ArrayList<>();
        while(line!=null){
            String[] s=line.split("\\s+");
            arr1.add(Integer.parseInt(s[0]));
            arr2.add(Integer.parseInt(s[1]));
            line= br.readLine();
        }
        HashMap<Integer, Integer> hm=new HashMap<>();
        for(int i=0; i<arr1.size(); i++){
            hm.put(arr1.get(i),0);
        }
        for(int k: hm.keySet()){
            for(int i=0; i<arr2.size(); i++){
                if(k==arr2.get(i)){
                    hm.put(k,hm.get(k)+1);
                }
            }
        }
        int sum=0;
        for(int i=0; i<arr1.size(); i++){
            sum+=arr1.get(i)*hm.get(arr1.get(i));
        }

        System.out.println(sum);
    }
}
