package javapr.src.test;

// import javapr.src.test.Outer.StaticNested;

// import javapr.src.test.Outer.Inner;

// import java.util.ArrayList;
// import java.util.Collection;
// import java.util.List;
// import java.util.Locale;

/*
 * @Author: Liu Li liuliwoku1@163.com
 * @Date: 2022-08-21 16:29:55c
 * @LastEditors: Liu Li liuliwoku1@163.com
 * @LastEditTime: 2022-08-25 11:52:24
 * @FilePath: \leetcode\javapr\HellowJava.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
// package javapr;

// import java.util.Arrays;
// // import java.util.Scanner;

// public class HellowJava {
    
//     // private static Scanner scanner = new Scanner(System.in);

//     /**
//      * @param args
//      */
//     public static void main(String[] args) {
        // int i = (100 + 200) * (99 - 88);
        // int n = 7 * (5 + (i - 9));
        // System.out.println(i);
        // System.out.println(n);
        // int x = 2147483640;
        // int y = 15;
        // long x = 2147483640;
        // long y = 15;
        // int sum = x + y;
        // long sum = x + y;
        // System.out.println(sum);
        // int n = 3133;
        // n --;
        // System.out.println(n);
        // double x = 1.0 / 10;
        // double y = 1 - 9.0 / 10;
        // System.out.println(x);
        // System.out.println(y);
        // System.out.println(x == y);
        // double r = Math.abs(x - y);
        // if (r < 0.00001) {
        //     System.out.println("equal");
        // } else {
        //     System.out.println("not equal");
            
        // System.out.print("Input your name:");
        // String name = scanner.nextLine();
        // System.out.print("Input your age:");
        // int age = scanner.nextInt();
        // System.out.printf("Hi, %s, you are %d\n", name, age);
        // int i = new intterg("aaaa");
        // String fruit = "apple";
        // switch (fruit) {
        //     case "apple":
        //         System.out.println("selected apple");
        //         break;
        //     case "pear":
        //         System.out.println("selected pear");
        //         break;
        //     case "mango":
        //         System.out.println("selected mango");
        //         break;
        //     default:
        //         System.out.println("No fruit selected");
        //         break;
        // }
        // String fruit = "apple";
    //     switch (fruit) {
    //     case "apple" -> System.out.println("Selected apple");
    //     case "pear" -> System.out.println("Selected pear");
    //     case "mango" -> {
    //         System.out.println("Selected pear");
    //         System.out.println("Good choice!");
    //     }
    //     default -> System.out.println("No fruit selected");
    // // }
    //     int opt = switch(fruit) {
    //         case "apple" -> 1;
    //         case "pear", "mango" -> 2;
    //         default -> 0;
    //     }; //注意赋值语句要以;结束
    //     System.out.println("opt =" + opt);
        // String fruit = "orange";
        // int opt = switch(fruit) {
        //     case "apple" -> 1;
        //     case "pear", "mango" -> 2;
        //     default -> {
        //         int code = fruit.hashCode();
        //         yield code; //switch语句的返回值
        //     }
        // };
        // System.out.println("opt =" + opt);
        // int sum = 0;
        // int n = 1;
        // while (n > 0) {
        //     sum = sum + n;
        //     n++;
        // }
        // System.out.println(n);
        // System.out.println(sum); 
        // int sum = 0;
        // int n = 1;
        // do {
        //     sum += n;
        //     n++;
        // } while (n <=100);
        // System.out.println(sum);
        // int sum = 0;
        // for (int i = 1; i <= 100; i++) {
        //     sum += i;
        // }
        // System.out.println(sum);
        // int[] ns = {1,3,5,6,12,23};
        // int sum = 0;
        // for (int i = 0; i < ns.length; i++) {
        //     System.out.println("i = " + i + ", ns[i] =" + ns[i]);
        //     sum = sum + ns[i];
        //     i += 1;
        // }
        // System.out.println("sum = " + sum);
        // int[] ns = {1,2,12,344,12,13,5345,212,11,34};
        // System.out.println(ns);
        // System.out.println(Arrays.toString(ns));
        //排序前
        // System.out.println(Arrays.toString(ns));
        // for (int i = 0; i < ns.length - 1; i++) {
        //     for (int j = 0; j < ns.length - i - 1; j++) {
        //         if (ns[j] > ns[j+1]){
        //             //swap ns[j] and ns[j+1]:
        //             int tmp = ns[j];
        //             ns[j] = ns[j+1];
        //             ns[j+1] = tmp;
        //         }
        //     }            
        // }
        //after sorted:
        // System.out.println(Arrays.toString(ns));
        // System.out.println(ns);
        // Arrays.sort(ns);
        // System.out.println(ns);
        // System.out.println(Arrays.toString(ns));
        // int[][] ns= {
        //     {1,2,3,4},
        //     {2,43,543,23},
        //     {1231,4,3,2}
        // };
        // System.out.println(Arrays.deepToString(ns));
        // int[][] scores = {
        //     { 82, 90, 91 },
        //     { 68, 72, 64 },
        //     { 95, 91, 89 },
        //     { 67, 52, 60 },
        //     { 79, 81, 85 },
        // };
        // System.out.println(Arrays.deepToString(scores));
        // int[][][] ns = {
        //     {
        //         {1, 2, 3},
        //         {4, 5, 6},
        //         {7, 8, 9}
        //     },
        //     {
        //         {10, 11},
        //         {12, 13}
        //     },
        //     {
        //         {14, 15, 16},
        //         {17, 18}
        //     }
        // };
        // System.out.println(Arrays.deepToString(ns));
        // for (String arg : args) {
        //     if ("-version".equals(arg)) {
        //         System.out.println("v 1.0");
        //         break;
        //     }            
        // }
//         Person p = new Person();
//         String[] bob = {"Bod"};
//         int[] ns = {1,2};
//         System.out.println(bob);
//         System.out.println("ns" + ns);
//         p.setName(bob, ns);
//         System.out.println(Arrays.toString(p.getName()));
//         Person1 p1 = new Person1();
//         System.out.println(p1.getName());
//         System.out.println(Person1.age1);
//         Person2 p2 = new Person2();
//         p2.test();
//         System.out.println(p2.age1);
//         // bob = {"Liu li"};
//         // System.out.println(p.getName());
//     }
// }
// /**
//  * InnerHellowJava
//  */
// class Person {
//     private String[] name;

//     public String[] getName() {
//         return this.name;
//     }
//     public void setName(String[] name, int[] ns1) {
//         System.out.println("in setName" + name);
//         System.out.println("in setName" + ns1);
//         this.name = name;
//     }
    
// }
// class Person1 extends Object {
//     private String name;
//     public int age = 1;
//     public static int age1 = 1;
//     // private int[] ns;

//     public  Person1(String name, int age) {
//         this.name = name;
//         this.age = age;
//     }

//     public  Person1(String name) {
//         this(name, 10);
//     }

//     public  Person1() {
//         this("Unnamed");
//     }

//     public String getName() {
//         return this.name + this.age;
//     }
//     // public void setName(String[] name, int[] ns1) {
//     //     System.out.println("in setName" + name);
//     //     System.out.println("in setName" + ns1);
//     //     this.name = name;
//     // }
    
// }
// class Person2 extends Person1 {
//     void test() {
//         System.out.println(super.age1);
//     }
    
// }

// public class HellowJava {
//     public static void main(String[] args) {
        // Student s = new Student("Xiao Ming", 12, 89);
        // int[] ns = {1,2,3};
        // int[] l = ns.clone(); 
        // Object obj = "hello";
        // if (obj instanceof String s) {
        //     // use variable s 
        //     System.out.println(s.toUpperCase());
        // // }
        // Object p = new Person();
        // // p.run();
        // // Student p = (Student) p1;
        // // Person p = (Person) p1;
        // System.out.println(p instanceof Object);
        // System.out.println(p instanceof Person);
        // System.out.println(p instanceof Student);
        // Student s = new Student("liu");
        // System.out.println(s.name);
        // Person p = new Person("liu") {
        //     public void abstractRun() {
                
        //     }
        // };
        // Person p1 = new person("liu");
        // Person p2 = new Student("name");
        // p2.run1()
        // List<String> list = new ArrayList<>();
        // Collection<String> coll = list;
        // Iterable<String> it = coll;
        // Student s = new Student("name");
        // Student s1 = new Student("liu");
        // System.out.println(s.staticField);
        // System.out.println(s1.staticField);
        // s.staticField = 1;
        // System.out.println(s.staticField);
        // System.out.println(s1.staticField);
        // Student.staticField = 2;
        // System.out.println(s.staticField);
        // System.out.println(s1.staticField);
        // s1.staticField = 3;
        // System.out.println(s.staticField);
        // System.out.println(s1.staticField);
//         Person3 p = new Student("name");
//         // Person3.gender = 2;
//         System.out.println(Person3.gender);
//         Person3.staticMethod();
//     }
// }

// abstract class Person {
//     public String name;
//     protected int age;
//     public Person(String name) {
//         this.name = name;
//     }

//     public Person(String name, int age) {
//         this.name = name;
//         this.age = age;
//     }
//     public void run() {
//         System.out.println("Person run");
//     }
//     public final String hello() {
//         return "Hello, Person"; 
//     }
    
//     public abstract void abstractRun();
        
    
// }

// class Student extends Person implements Person3{
//     public static int staticField;
//     protected int score;
//     public Student(String name) {
//         super("name");
//         // this.name = name;
        
//         super.name = name;
//     }

//     public Student(String name, int age, int score) {
//         super(name, age);
//         this.score = score;
//     }

//     public static void staticMethod() {
//         System.out.println(Student.staticField);
//     }
//     @Override
//     public void run() {
//         System.out.println("Student run");
//         // return "as";
//     }
    
//     public String hello(int i) {
//         return "hello student";
//     }
//     // public void abstractRun() {
//     //     System.out.println("student abstractRun");
//     // }
//     public void run1() {
//         System.out.println("student run1");
//     }

//     @Override
//     public void abstractRun() {
//         
        
//     }
//     @Override
//     public void run3() {
//         
        
//     }
// }

// sealed class Shape permits Rect, Circle, Triangle {
    
// }

// non-sealed class Rect extends Shape{

    
// }

// final class Ellipse extends Shape {

    
// }
// interface Person3 {
//    void run3();
//    default void defaultPerson3() { // default function, subclass don't need override default function , use default function when need to add function to interface otherwise need change all subclass

    
//    }
//    public static int gender = 1;
//    public static void staticMethod() {
//         System.out.println("interface static method");
//    }
// }



// public class HellowJava {
//         public static void main(String[] args) {
//             Inner i = new Inner();
//             i.hi();
//         }
    
//         // private方法:
//         protected void hello() {
//             System.out.println("private hello!");
//         }
    
//         // 静态内部类:
//         static public class Inner {
//             public void hi() {
//                 // HellowJava.hello();
//                 HellowJava h = new HellowJava();
//                 h.hello();
//             }
//         }
//     }



// class innerHellowJava {
//         private static void hi() {
//                 System.out.println("InnerHellowJava");
//                 InnerHellowJava_1 i11 = new InnerHellowJava_1();
//                 i11.hi();

//         }
//         protected static class InnerHellowJava_1 {
        
//                 public void hi() {
//                         System.out.println("InnerHellowJava_1");
//                         InnerHellowJava i = new InnerHellowJava();
//                         i.hi();
//                         innerHellowJava.hi();
//                 }
//         }
        
        
// }
/**
 * InnerHellowJava_2
 */
// class InnerHellowJava_2 extends innerHellowJava{
//         public void hi() {
//                 System.out.println("InnerHellowJava_2");
//                 InnerHellowJava_1 i1 = new InnerHellowJava_1();
//                 i1.hi();
//         }
        
// }



// public class HellowJava {
//         public static void main(String[] args) {
//             Outer outer = new Outer("Nested"); // 实例化一个Outer
//         //     Outer.Inner inner = outer.new Inner(); // 实例化一个Inner
//         //     Outer.Inner inner1 =  new Inner();
//             Inner inner = new Inner();
//             Inner.hello();
//             inner.hello();
//         }
//     }
    
//     class Outer {
//         private String name;
    
//         Outer(String name) {
//             this.name = name;
//         }
    
//         public static class Inner {
//             private String name;    
//             static void hello() {
//                 // this.clone();
//                 this.name = "as";
//                 System.out.println("Hello, " + Outer.this.name);
//             }
//         }
//     }


// import java.util.HashMap;

// public class HellowJava {
//     public static void main(String[] args) {
//         HashMap<String, String> map1 = new HashMap<>();
//         HashMap<String, String> map2 = new HashMap<>() {}; // 匿名类!
//         HashMap<String, String> map3 = new HashMap<>() {
//             {
//                 put("A", "1");
//                 put("B", "2");
//             }
//         };
//         System.out.println(map3.get("A"));
//     }
// }


// public class HellowJava {
//         public static void main(String[] args) {
//             Outer.StaticNested sn = new Outer.StaticNested();
//             sn.hello();
//             StaticNested.hello();
//         }
//     }
    
//     class Outer {
//         private static String NAME = "OUTER";
    
//         private String name;
                                        
//         Outer(String name) {
//             this.name = name;
//         }
    
//         static class StaticNested {
//                 static void hello() {
//                          System.out.println("Hello, " + Outer.NAME);
//             }           
//         }
//     }


