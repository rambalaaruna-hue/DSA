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


class ChaiShop{
    String branchName;
    int cupsSold;
    int pricePerCup;
    public ChaiShop(String branchName,int cupsSold,int pricePerCup){
        this.branchName=branchName;
        this.cupsSold=cupsSold;
        this.pricePerCup=pricePerCup;

    }
    public void order(int n){
        cupsSold=n;
    }
    public void display(){
        System.out.println(branchName);
        System.out.println(cupsSold);
        System.out.println(pricePerCup);
        revenue();
    }
    public void revenue(){
        System.out.println("revenue "+(cupsSold)*(pricePerCup));
    }
}
public class OOPS {
    public static void main(String[] args) {
        ChaiShop branch1 = new ChaiShop("Hyd",0,7);
        branch1.order(9);
        branch1.display();
         //branch1.revenue();
      

        ChaiShop branch2 = new ChaiShop("Chennai",8,9);
        branch2.order(10);
        branch2.display();
        //branch2.revenue();
         

    }
    
}