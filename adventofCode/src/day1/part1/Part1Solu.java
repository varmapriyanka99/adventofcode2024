package day1.part1;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Part1Solu {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("D:\\adventofcode2024\\adventofcode2024\\adventofCode\\src\\day1\\part1\\input.txt"));
        String line=br.readLine();
        List<Integer> arr1=new ArrayList<>();
        List<Integer> arr2=new ArrayList<>();
        while(line!=null){
            String[] s=line.split("\\s+");
            arr1.add(Integer.parseInt(s[0]));
            arr2.add(Integer.parseInt(s[1]));
            line= br.readLine();
        }
        Collections.sort(arr1);
        Collections.sort(arr2);
        int sum=0;
        for(int i=0; i<arr1.size(); i++){
            sum+=Math.abs(arr1.get(i)-arr2.get(i));
        }
        System.out.println(sum);
    }
}
