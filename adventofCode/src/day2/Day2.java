package day2;

import day2.part1.Part1Solu;
import day2.part2.Part2Solu;

public class Day2 {
    public static void main(String[] args) throws Exception {
        System.out.println("Running Day2 Part1");
        Part1Solu p1=new Part1Solu();
        p1.main(new String[]{""});

        System.out.println("Running Day2 Part2");
        Part2Solu p2=new Part2Solu();
        p2.main(new String[]{""});

        System.out.println("Day2 successful!\n");
    }
}
