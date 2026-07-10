
//OOPS:OOP stands for Object-Oriented Programming. It is a programming style (or paradigm) that organizes software design around data, or "objects," rather than functions and logic.

//Inheritance: Inheritance is an OOP mechanism where a subclass acquires the state and behavior of a superclass, establishing an 'IS-A' relationship. In Java, it is implemented using the extends keyword to achieve code reusability and enable runtime polymorphism.


//Single Inheritance:Single inheritance is a type of inheritance where a subclass is derived from only one superclass.
// class A{
//     int x = 10;
//     int y = 20;
//     void addA(){
//         System.out.println("Addition is :" + (x+y));
//     }
// }
// class B extends A{
//     int z = 30;
//     void addB(){
//         System.out.println("Addition is :" + (x+y+z));
//     }
// }
// public class OOP {
//     public static void main(String[] args) {
//     B b = new B();
//     b.addA();
//     b.addB();
// }
// }


//Multilevel Inheritance:Multilevel  inheritance is a type of inheritance where a child class acquires properties and behaviour from a parent class which itself inherits from another parent class.
// class A{
//     int a = 10;
//     void addA(){
//         System.out.println("A");
//     }
// }
// class B extends A{
//     int b = 20;
//     void addB(){
//         System.out.println("Addition  is :" + (a+b));
//     }
// }
// class C extends B{
//     int c = 30;
//     void addC(){
//         System.out.println("Addition with c is :" + (a+b+c));
//     }
// }
// public class OOP {
//     public static void main(String[] args) {
//    C c = new C();
//    c.addA();
//    c.addB();
//    c.addC();

// }
// }


//Heirarchical Inheritance:Hierarchical inheritance is a structure where multiple subclasses inherit from a single superclass. 
// class A{
//     int a = 50;
//     void disp(){
//         System.out.println("Class A:" + a);
//     }
// }
// class B extends A{
//     int b = 20;
//     void add(){
//         System.out.println("Addition  is :" + (a+b));
//     }
// }
// class C extends A{
//     int c = 30;
//     void sub(){
//         System.out.println("Subtraction is :" + (a-c));
//     }
// }
// public class OOP {
//     public static void main(String[] args) {
//         B b = new B();
//         b.disp();
//         b.add();
//         C c = new C();
//         c.disp();
//         c.sub();

// }
// }


//Multiple Inheritance through Interfaces:"Multiple inheritance is a mechanism where one subclass inherits from more than one superclass. While languages like C++ support this directly, Java does not support multiple inheritance with classes to avoid the ambiguity of the Diamond Problem."
  
// interface A{
//    double PI = 3.14;
// }
// interface B{
//     double r = 10.20;
// }
// interface C{
//      public double area();
// }
// class D{
//     void compute(){
//         System.out.println(Math.pow(2,4));
//     }
// }
// class E extends D implements A,B,C{
//     public double area(){
//         return PI*r*r;
//     }
// }
// public class OOP {
//     public static void main(String[] args) {
//          E e = new E();
//          e.compute();
//          System.out.println(e.area());
// }
// }


//Inner Class
// class A{
//     String a = "Aruna";
//     class B{
//         String b = "Anjali";
//     }
// }
// public class OOP{
//     public static void main(String[] args) {
//         A obja = new A();
//         System.out.println(obja.a);
//         A.B objb = obja.new B();
//         System.out.println(objb.b);
//     }
// }


//Method Overloading:"Method Overloading is a compile-time polymorphism feature in Java that allows a class to have multiple methods with the exact same name but different parameter lists (signatures)."
// class A{
//     void add(int a,int b){
//            System.out.println("Sum of 2 ints:" +(a+b));
//     }
//     void add(int a,int b,int c){
//         System.out.println("Sum of 3 ints:"+ (a+b+c));
//     }
//     void add(double a,double b){
//         System.out.println("Sum of 2 doubles:"+ (a+b));
//     }
// }
// public class OOP{
//     public static void main(String[] args) {
//         A obj = new A();
//         obj.add(10,20);
//         obj.add(50,100,150);
//         obj.add(34.28,97.32);
//     }
// }


//Method Overriding:Method overriding is an Object-Oriented Programming (OOP) feature where a subclass provides a specific implementation of a method that is already defined in its parent class. When the method is called, the program executes the child class's version instead of the parent's.
// class A{
//     void add(int a,int b){
//            System.out.println("Sum of 2 ints:" +(a+b));
//     }
//     void add(int a,int b,int c){
//         System.out.println("Sum of 3 ints:"+ (a+b+c));
//     }
//     void add(double a,double b){
//         System.out.println("Sum of 2 doubles:"+ (a+b));
//     }
// }
// public class OOP{
//     public static void main(String[] args) {
//         A obj = new A();
//         obj.add(10,20);
//         obj.add(50,100,150);
//         obj.add(34.28,97.32);
//     }
// }



