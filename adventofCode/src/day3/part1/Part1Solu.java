package day3.part1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Part1Solu {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("D:\\adventofcode2024\\adventofcode2024\\adventofCode\\src\\day3\\part1\\input.txt"));
        List<String> str=new ArrayList<>();
        String line=br.readLine();
        while(line!=null){
            str.add(line);
            line=br.readLine();
        }
        final Pattern p = Pattern.compile("mul\\(([0-9]{1,3}),([0-9]{1,3})\\)");

        System.out.println("Ans is: 190604937");
        int result = 0;
        for (String s : str) {
            Matcher m = p.matcher(s);
            while (m.find()) {
                if (m.group(0).startsWith("mul")) {
                    int product = Integer.parseInt(m.group(1)) * Integer.parseInt(m.group(2));
                    result += product;
                }
            }
        }

        System.out.println("Day 03:");
        System.out.printf("Part 1: %d\n\n", result);
        System.out.println("Success!!\nGold start achieved!\n");
    }
}
