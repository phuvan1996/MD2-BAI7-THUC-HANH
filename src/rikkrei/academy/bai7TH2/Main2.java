package rikkrei.academy.bai7TH2;

import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle(3.6);
        circles[1] = new ComparableCircle();
        circles[2] = new ComparableCircle(3.5,"indigo",false);

        System.out.println("pre-sorted");
        for (ComparableCircle comparableCircle:circles){
            System.out.println(comparableCircle);
        }
        Arrays.sort(circles);
        System.out.println("apter-sort:");
        for (ComparableCircle comparableCircle:circles){
            System.out.println(comparableCircle);
        }
    }
}