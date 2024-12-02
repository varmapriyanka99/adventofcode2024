package day1;

import day1.part1.Part1Solu;
import day1.part2.Part2Solu;

public class Day1 {
    public static void main(String[] args) throws Exception {
        System.out.println("Running Day1 Part1");
        Part1Solu p1=new Part1Solu();
        p1.main(new String[]{""});

        System.out.println("Running Day1 Part2");
        Part2Solu p2=new Part2Solu();
        p2.main(new String[]{""});

        System.out.println("Day1 successful!\n");
    }
}
