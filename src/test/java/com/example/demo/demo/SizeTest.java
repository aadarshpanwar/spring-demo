//package com.example.demo.demo;
//
//import java.lang.instrument.Instrumentation;
//
//import org.junit.jupiter.api.Test;
//
//public class SizeTest {
//
//    private static Instrumentation instrumentation ;
//
//    private int a = 32;
//    private String b = "asdvavava";
//    private long c = 242525l;
//
//    public static void premain(String args, Instrumentation inst) {
//        instrumentation = inst;
//    }
//
//    @Test
//    public void test() {
//        System.out.println(instrumentation.getObjectSize(a));
//        System.out.println(instrumentation.getObjectSize(b));
//        System.out.println(instrumentation.getObjectSize(c));
//    }
//
//}
