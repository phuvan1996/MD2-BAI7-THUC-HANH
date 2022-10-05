package rikkrei.academy.bai7TH3;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        System.out.println("------COMPARATOR------");
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(3.6);
        circles[1] = new Circle();
        circles[2] = new Circle(3.5,"indigo",false);

        System.out.println("pre-sort:");
        for (Circle circle1:circles){
            System.out.println(circle1);
        }
        Comparator circleComparator = new CircleComparator();
        Arrays.sort(circles,circleComparator);
        System.out.println("apter-sorted");
        for (Circle circle:circles){
            System.out.println(circle);
        }
    }
}
