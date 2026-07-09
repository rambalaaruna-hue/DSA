//Inheritance


//Single Inheritance
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


//Multilevel Inheritance
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


//Heirarchical Inheritance
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


//Multiple Inheritance through Interfaces
  
interface A{
   double PI = 3.14;
}
interface B{
    double r = 10.20;
}
interface C{
     public double area();
}
class D{
    void compute(){
        System.out.println(Math.pow(2,4));
    }
}
class E extends D implements A,B,C{
    public double area(){
        return PI*r*r;
    }
}
public class OOP {
    public static void main(String[] args) {
         E e = new E();
         e.compute();
         System.out.println(e.area());
}
}