package day2.part1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Part1Solu {

    public static boolean checkReport(List<Integer> arr) {
        int diff1 = 0;
        int diff2 = 0;
        boolean val = true;
        for (int j = 0; j < arr.size() - 1; j++) {
            diff2 = diff1;
            diff1 = arr.get(j) - arr.get(j + 1);
            if (diff1 < -3 || diff1 > 3) {
                val = false;
                break;
            }
            if (j != 0 && diff1 * diff2 <= 0) {
                val = false;
                break;
            }
        }
        return val;
    }

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new FileReader("D:\\adventofcode2024\\adventofcode2024\\adventofCode\\src\\day2\\part1\\input.txt"));
        String line=br.readLine();
        List<List<Integer>> arr=new ArrayList<>();
        while (line!=null){
            String[] s=line.split("\\s+");
            List<Integer> tmp=new ArrayList<>();
            for(int i=0; i<s.length; i++){
                tmp.add(Integer.parseInt(s[i]));
            }
            arr.add(tmp);
            line=br.readLine();
        }

        int res=0;
        for(int i=0; i<arr.size(); i++){
            boolean val=checkReport(arr.get(i));
            if(val){
                res++;
            }
        }

        System.out.println(res);
    }
}
