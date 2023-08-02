package com.example.bai_hoc_1.b1.service;

import com.example.bai_hoc_1.b1.entity.Student;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LambdaService {
    static List<Student> listStudents = Arrays.asList(
            new Student("Nguyễn Quốc Tuấn", true, 7.6),
            new Student("Hoàng Thanh Tâm", false, 7.8),
            new Student("Linh Đan Văn", true, 8.6),
            new Student("Nguyễn Văn Đạt", true, 5.2)
    );

    public static void main(String[] args) {
//        demo1();
//        demo2();
//        demo3();
        demo4();
    }

    private static void demo4() {
        Demo4Inter inter = (x) -> System.out.println(x);
        inter.m1(10);
    }

    private static void demo3() {
        Collections.sort(listStudents, (sv1, sv2) -> sv2.getMarks().compareTo(sv1.getMarks()));
        demo2();
    }

    private static void demo2() {
        listStudents.forEach(sv ->
        {
            System.out.println("NAME: " + sv.getName());
            System.out.println("GENDER: " + sv.getGender());
            System.out.println("MARKS: " + sv.getMarks());
        });
    }

    private static void demo1() {
        List<Integer> integerList = Arrays.asList(1, 9, 4, 10, 11, 12);
        integerList.forEach(n -> System.out.println(n));
    }
}

@FunctionalInterface
interface Demo4Inter {
    void m1(int x);

    default void m2() {
    }

    ;

    public static void m3(int a, int b) {
        System.out.println(a - b);
    }

    ;
}