//Absolute Difference -----> Means converting a negative number into positive number
//  public class Concepts {
//     public static void main(String[] args) {
//         int temp = 1-5;
//         int temp2 = 1-3;
//         temp2=Math.abs(temp2);
//         int temp3=Math.abs(4-10);

//         System.out.println(temp);
//         if(temp<0){
//             temp=temp * -1;
//         }
//         System.out.println(temp);
//         System.out.println(temp2);
//         System.out.println(temp3);
        
//     }
// }


// public class Concepts{
//     public static void main(String[] args) {
//         for(int i=0;i<2;i++){
//             for(int j=0;j<5;j++){
//                 System.out.println(i + " " +j);
//             }
//         }
//     }
// }


//import java.util.Scanner;

// public class Solvep {
    
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         System.out.println(n+3);
        
       
//     }
// }


// import java.util.Scanner;
// public class Solvep {
    
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String n = sc.nextLine();//try for next() also;
//         System.out.println(n);
        
       
//     }
// }


// import java.util.Scanner;
// public class Solvep {
    
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//        int n=5;
//        int[] arr=new int[n];
//        for(int i=0;i<n;i++){
//          int temp=sc.nextInt();
//          arr[i]=temp;
//        }
//        for(int i=0;i<n;i++){
//         System.out.print(arr[i]+" ");
//        }
        
       
//     }
// }

// import java.util.Scanner;
// public class Solvep {
    
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//        int n=sc.nextInt();
//        sc.nextLine();
//        String s=sc.nextLine();
//        System.out.print(n+s);
        
       
//     }
// }

// import java.util.Scanner;
// public class Solvep {
    
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//        int n=sc.nextInt();
//        sc.nextLine();
//        String arr[]=new String[n];
//        for(int i=0;i<arr.length;i++){
//         arr[i]=sc.nextLine();
//        }
//        for(int i=0;i<arr.length;i++){
//         System.out.println(arr[i]);
//        }
//        sc.close();
        
       
//     }
// }


// //Bubble sort Algorithm Assending order
// public class SolvingProblems{
//     public static void main(String[] args) {
//         int arr[]={50,20,10,40,30,14,34,16,25,43,54,11,60,36,49,54,18};
//         int n=arr.length;
//         for(int i=0;i<n-1;i++){
//             boolean swapped=false;
//             for(int j=0;j<n-i-1;j++){
//                 if(arr[j]>arr[j+1]){
//                     int temp=arr[j];
//                     arr[j]=arr[j+1];
//                     arr[j+1]=temp;
//                     swapped=true;
//                 }
//             }
//             if(swapped==false){
//                 break;
//             }
//         }
//         for(int i=0;i<n;i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
// }


//Bubble sort Algorithm Descending order
// public class SolvingProblems{
//     public static void main(String[] args) {
//         int arr[]={50,20,10,40,30,14,34,16,25,43,54,11,60,36,49,54,18};
//         int n=arr.length;
//         for(int i=0;i<n-1;i++){
//             boolean swapped=false;
//             for(int j=0;j<n-i-1;j++){
//                 if(arr[j]<arr[j+1]){
//                     int temp=arr[j];
//                     arr[j]=arr[j+1];
//                     arr[j+1]=temp;
//                     swapped=true;
//                 }
//             }
//             if(swapped==false){
//                 break;
//             }
//         }
//         for(int i=0;i<n;i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
// }


// //Array sorting technique
// import java.util.Arrays;
// public class Concepts{
//     public static void main(String[] args) {
//         int arr[]={50,20,10,40,30,14,34,16,25,43,54,11,60,36,49,54,18};
//         int n=arr.length;
//        Arrays.sort(arr);
//         for(int i=0;i<n;i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
// }

//Array sorting technique-Descending order
// import java.util.Arrays;
// public class Concepts{
//     public static void main(String[] args) {
//         int arr[]={50,20,10,40,30,14,34,16,25,43,54,11,60,36,49,54,18};
//         int n=arr.length;
//        Arrays.sort(arr);
//         for(int i=n-1;i>0;i--){
//             System.out.print(arr[i]+" ");
//         }
//     }
// }


//HashMap DataStructure
// import java.util.HashMap;
// public class Concepts{
//     public static void main(String[] args) {
//         HashMap <Integer,Integer> aruna=new HashMap<>();
//         aruna.put(2,5);
//         int prev=aruna.get(2);
//         aruna.put(2,prev+1);
//         aruna.put(3,9);
//         aruna.put(3,10);
//         if(aruna.containsKey(7)){
//             int prevv=aruna.get(7);
//         }
//         System.out.println(aruna.get(3));
//         System.out.println(aruna.get(2));
// }
// }

// import java.util.HashMap;
// public class Concepts{
//     public static void main(String[] args) {
//         HashMap <Integer,Integer> aruna=new HashMap<>();
//         aruna.put(3,9);
//         //aruna.put(7,2);
//         int n=7;
//         if(aruna.containsKey(7)){
//             int prev=aruna.get(n);
//             aruna.put(n,prev+1);
//         }
//         else{
//             aruna.put(n,1);
//         }
//         System.out.println(aruna.get(3));
//         System.out.println(aruna.get(7));
// }
// }


// import java.util.HashMap;
// public class Concepts{
//     public static void main(String[] args) {
//         HashMap <Integer,Integer> aruna=new HashMap<>();
//         aruna.put(3,9);
//         aruna.put(8,10);
//         aruna.put(5,4);
//         for(int boom:aruna.keySet()){
//             //System.out.println(boom);
//             System.out.println(boom+" "+aruna.get(boom));

//         }
// }
// }

// import java.util.*;
// public class Concepts{
//     public static void main(String[] args) {
//         HashMap <Integer,Integer> aruna=new HashMap<>();
//         int arr[]={1,3,5,1,5,3,2};
//         for(int i=0;i<arr.length;i++){
//             int key=arr[i];
//             aruna.put(key,aruna.getOrDefault(key,0)+1);

//         }
//         for(int h:aruna.keySet()){
//             System.out.println(h+" "+aruna.get(h));
//         }

        
//     }
// }



//While loop
// import java.util.*;
// public class Concepts{
//     public static void main(String[] args) {
//         HashSet<Integer> hs=new HashSet<>();
//         int i=1;
//         hs.add(2);
//         hs.add(5);
//         hs.add(6);
//         while(i<hs.size()){
//             System.out.println("Hello");
//             if(hs.size()>0){
//                 hs.add(i);
//             }else{
//                 hs.add(0);
//             }
//             i++;
//         }


//     }
// }


//Return statement
// public class Concepts{
//     public static boolean fun(int[] arra,int[] arrb){
//         boolean valid=true;
//         for(int i=0;i<arra.length;i++){
//             if(arra[i]!=arrb[i]){
//                 return false;
//             }
//         }
//         return true;
//     }
//     public static void main(String[] args) {
//         int[] arra={1,2,4};
//         int[] arrb={1,2,5};
//         boolean ans=fun(arra,arrb);
//         System.out.println(ans);
//     }
// }

//Passing HashMap as Parameter
import java.util.*;
public class Concepts{
    public static void fun(HashMap<Integer,Integer>hm){
        System.out.println(hm);
    }
    public static void main(String[] args) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        hm.put(5,1);
        hm.put(4,8);
        fun(hm);
    }
}

