// class ChaiShop{
//     String branchName;
//     int cupsSold;
//     public void classFun(String s){
//         System.out.println("class inside function "+s);
//     }
// }
// public class OOPS {
//     public static void main(String[] args) {
//         ChaiShop branch1 = new ChaiShop();
//         branch1.branchName="Hyd";
//         branch1.cupsSold=5;
//         branch1.classFun("tea");
//         System.out.println(branch1.branchName);
//         System.out.println(branch1.cupsSold);

//          ChaiShop branch2 = new ChaiShop();
//         branch2.branchName="Chennai";
//         branch2.cupsSold=10;
//         System.out.println(branch2.branchName);
//         System.out.println(branch2.cupsSold);


//     }
    
// }


//Constructers
// class ChaiShop{
//     String branchName;
//     int cupsSold;
//     int pricePerCup;
//     public ChaiShop(String branchName,int cupsSold,int pricePerCup){
//         this.branchName=branchName;
//         this.cupsSold=cupsSold;
//         this.pricePerCup=pricePerCup;
//         //System.out.println("Constructor here");
//         //System.out.println(bn +" "+cs+" "+ppc);
//         // branchName = bn;
//         // cupsSold=cs;
//         // pricePerCup=ppc;
//         //System.out.println(branchName);
//         //System.out.println(this.branchName);

//     }
//     public void display(){
//         System.out.println(branchName);
//         System.out.println(cupsSold);
//         System.out.println(pricePerCup);
//     }
// }
// public class OOPS {
//     public static void main(String[] args) {
//         ChaiShop branch1 = new ChaiShop("Hyd",5,7);
//         branch1.display();

//         ChaiShop branch2 = new ChaiShop("Chennai",8,9);
//         branch2.display();

//         //  System.out.println(branch1.branchName);
//         //  System.out.println(branch1.cupsSold);
//         //  System.out.println(branch1.pricePerCup);
         

//     }
    
// }


//Access Modifiers
// class ChaiShop{
//     private String branchName;
//     private int cupsSold;
//     int pricePerCup;
//     public ChaiShop(String branchName,int cupsSold,int pricePerCup){
//         this.branchName=branchName;
//         this.cupsSold=cupsSold;
//         this.pricePerCup=pricePerCup;

//     }
//     public void order(int n){
//         cupsSold=n;
//     }
//     private void display(){
//         System.out.println(branchName);
//         System.out.println(cupsSold);
//         System.out.println(pricePerCup);
//         revenue();
//     }
//     public void revenue(){
//         System.out.println("revenue "+(cupsSold)*(pricePerCup));
//     }
// }
// public class OOPS {
//     public static void main(String[] args) {
//         ChaiShop branch1 = new ChaiShop("Hyd",0,7);
//         branch1.order(9);
//         // System.out.println(branch1.branchName);
//         // System.out.println(branch1.cupsSold);
//         // branch1.display();
//         branch1.revenue();

//         // branch1.display();
//          //branch1.revenue();
      

//         ChaiShop branch2 = new ChaiShop("Chennai",8,9);
//         // branch2.order(10);
//         // branch2.display();
//         // //branch2.revenue();
         

//     }
    
// }


//Inheritance
// class Owner{
//     String ownerName="Aruna";
//     int age = 20;
//     int num = 123;
//     public void fun(){
//         System.out.println("This is Parent Class");
//     }


// }
// class ChaiShop extends Owner{ 
//      String branchName;
//      int cupsSold;
//     int pricePerCup;
//     public ChaiShop(String branchName,int cupsSold,int pricePerCup){
//         this.branchName=branchName;
//         this.cupsSold=cupsSold;
//         this.pricePerCup=pricePerCup;

//     }
//     public void order(int n){
//         cupsSold=n;
//     }
//     public void display(){
//         System.out.println(branchName);
//         System.out.println(cupsSold);
//         System.out.println(pricePerCup);
//         revenue();
//     }
//     public void revenue(){
//         System.out.println("revenue "+(cupsSold)*(pricePerCup));
//     }
// }

// class XeroxShop extends Owner{
//     String branchName;
//     int papersSold;
//     int pricePerPaper;
//     public XeroxShop(String branchName,int papersSold,int pricePerPaper){
//         this.branchName = branchName;
//         this.papersSold = papersSold;
//         this.pricePerPaper = pricePerPaper;
//     }
//     public void display(){
//         System.out.println(branchName);
//         System.out.println(papersSold);
//         System.out.println(pricePerPaper);
//     }
// }

// public class OOPS {
//     public static void main(String[] args) {
//         ChaiShop branch1 = new ChaiShop("Hyd",0,7);
//         branch1.order(9);
//          branch1.display();
//         System.out.println(branch1.num);
//         branch1.fun();

//         XeroxShop branch2= new XeroxShop("vizag", 5, 2);
//         branch2.display();
//          System.out.println(branch2.num);
//          Owner o=new Owner();
//          o.fun();

//     }
    
// }


//Method Overloading
class Owner{
    String ownerName="Aruna";
    int age = 20;
    int num = 123;
    public void fun(){
        System.out.println(1);
    }

    public void fun(int a){
        System.out.println(2);
    }
    public void fun(int a,int b){
        System.out.println(3);
    }
    public void fun(int a,String b){
        System.out.println(4);
    }
    public void fun(String a,int b){
        System.out.println(5);
    }


}

public class OOPS {
    public static void main(String[] args) {
         Owner o=new Owner();
         o.fun();
         o.fun(5);
         o.fun(4,8);
         o.fun(5,"abc");
         o.fun("aruna",3);

    }
    
}



