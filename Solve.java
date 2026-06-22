//SolvingProblems

//given a number n and string s..you have to print that string s  in n times// public class SolvingProblems {
//     public static void main(String[] args) {
//         int num=5;
//         String name="Aruna";
//         for(int i=1;i<=num;i++){
//             System.out.println(name);
//         }
//     }
// }

//The above code by using functions
// public class SolvingProblems{
//     public static void fun(String s,int n){
//         for(int i=0;i<n;i++){
//             System.out.println(s);
//         }

//     }
//     public static void main(String[] args) {
//         fun("aruna",5);
//         fun("anjali",4);
//         fun("boom",6);
//     }
// }

//Largest number in an Array
// public class SolvingProblems{
//     public static void main(String[] args) {
//         int arr[]={10,50,20,30,40};
//         int max=arr[0];
//         for(int i=1;i<arr.length;i++){
//             if(max < arr[i]){
//                 max=arr[i];
                
//             }
//         }
//         System.out.println(max);
//     }
// }

//SAme as above but using Math function
// public class SolvingProblems{
//     public static void main(String[] args) {
//         int arr[]={10,50,20,30,40};
//         int ans=0;
//         for(int i=1;i<arr.length;i++){
//             ans=Math.max(arr[i],ans);
//         }
//         System.out.println(ans);
//     }
// }
 

// public class Solvep{

//     public static void main(String[] args) {
//         int count=0;
//         String words[]={"cd","ac","dc","zz"};
//         for(int i=0;i<words.length;i++){
//             String s=words[i];
//             for(int j=0;j<words.length;j++){
//                  if (i == j) {
//                      continue; 
//                  }
//                 String s1=words[j];
//                 String reverse="";
//                 for(int k=s1.length()-1;k>=0;k--){
//                     char c=s1.charAt(k);
//                     reverse=reverse + c;
//                     //System.out.println(reverse);
                
//                 }
//                 if(s.equals(reverse)){
//                 count=count + 1;
//             }  
//             }

//         }
//         System.out.println(count);
//     }
// } 


// public class Solvep{
//     public static void main(String[] args) {
//         int n=5;
//         for(int i=0;i<n;i++){
//             for(int j=0;j<n;j++){
//                 System.out.print(" * ");
//             }
//             System.out.println();
//         }
//     }
// }

// public class Solvep{
//     public static void main(String[] args) {
//         int n=5;
//         for(int i=0;i<n;i++){
//             for(int j=0;j<n;j++){
//                 System.out.print("*");
//                 if(j != n-1){
//                     System.out.print("-");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }

// public class Solvep{
//     public static void main(String[] args) {
//         int r=3;
//         int c=20;
//         for(int i=0;i<r;i++){
//             for(int j=0;j<c;j++){
//                 System.out.print("*");
//                 if(j != c-1){
//                     System.out.print("-");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }

// public class Solvep{
//     public static void main(String[] args) {
//         int r=20;
//         int c=3;
//         for(int i=0;i<r;i++){
//             for(int j=0;j<c;j++){
//                 System.out.print("*");
//                 if(j != c-1){
//                     System.out.print("-");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }


// public class Solvep{
//     public static void main(String[] args) {
//         int n=5;
//         for(int i=0;i<n;i++){
//             for(int j=0;j<n;j++){
//                 if(i==0 || i==n-1 || j==0 || j==n-1){
//                 System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
               
//             }
//             System.out.println();
//         }
//     }
// }


// public class Solvep{
//     public static void main(String[] args) {
//         int r=4;
//         int c=20;
//         for(int i=0;i<r;i++){
//             for(int j=0;j<c;j++){
//                 if(i==0 || i==r-1 || j==0 || j==c-1){
//                 System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
               
//             }
//             System.out.println();
//         }
//     }
// }

// public class Solvep{
//     public static void main(String[] args) {
//         int n=5;
//         for(int i=0;i<n;i++){
//             for(int j=0;j<n-i;j++){
//             System.out.print(" * ");
               
//             }
//             System.out.println();
//         }
//     }
// }

// public class Solvep{
//     public static void main(String[] args) {
//         int n=5;
//         for(int i=0;i<n;i++){
//             for(int j=0;j<i+1;j++){
//             System.out.print(" * ");
               
//             }
//             System.out.println();
//         }
//     }
// }

// public class Solvep{
//     public static void main(String[] args) {
//         int r=6;
//         int c=10;
//         for(int i=0;i<r;i++){
//             for(int j=0;j<c;j++){

//                 System.out.print("*");
               
//             }
//             System.out.println();
//         }
//     }
// }
// 


// public class Solvep{
    
//     public static void main(String[] args) {
//         int n=5;
//         for(int i=0;i<n;i++){
//             for(int j=0;j<n-i;j++){
//             System.out.print(" ");
               
//             }
//             for(int k=0;k<5;k++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }



// public class Solvep{
    
//     public static void main(String[] args) {
//         int n=5;
//         for(int i=0;i<n;i++){
//             for(int j=0;j<n-i;j++){
//             System.out.print(" ");
               
//             }
//             for(int k=0;k<5+i;k++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }


// public class Solvep{
    
//     public static void main(String[] args) {
//         int n=5;
//         for(int i=0;i<n;i++){
//             for(int j=0;j<n-i-1;j++){
//             System.out.print(" ");
               
//             }
//             for(int k=0;k<(2*i + 1);k++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// public class Solvep{
    
//     public static void main(String[] args) {
//         int n=5;
//     for(int i=n-1;i>=0;i--){
//             for(int j=0;j<n-i-1;j++){
//             System.out.print(" ");
               
//             }
//             for(int k=0;k<(2*i + 1);k++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// public class Solvep{
    
//     public static void main(String[] args) {
//         int n=5;
//         for(int i=0;i<n-1;i++){
//             for(int j=0;j<n-i-1;j++){
//             System.out.print(" ");
               
//             }
//             for(int k=0;k<(2*i + 1);k++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

//         for(int i=n-1;i>=0;i--){
//             for(int j=0;j<n-i-1;j++){
//             System.out.print(" ");
               
//             }
//             for(int k=0;k<(2*i + 1);k++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }


// public class Solvep{
    
//     public static void main(String[] args) {
//         int n=5;
//     for(int i=n-1;i>0;i--){
//             for(int j=0;j<n-i-1;j++){
//             System.out.print(" ");
               
//             }
//             for(int k=0;k<(2*i + 1);k++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         for(int i=0;i<n;i++){
//             for(int j=0;j<n-i-1;j++){
//             System.out.print(" ");
               
//             }
//             for(int k=0;k<(2*i + 1);k++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// public class Solvep{

//     public static void main(String[] args) {
//         int n=5;
//         for(int i=0;i<n;i++){
//             for(int j=0;j<n-i-1;j++){
//                 System.out.print(" ");

//             }
//             for(int k=0;k<2*i+1;k++){
//                 if(i==n-1 ||k==0 ||k==2*i ){
//                 System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }


// public class Solvep{
//     public static void main(String[] args) {
//         int n=5;
//         for(int i=0;i<n;i++){
//             for(int j=0;j<n-i-1;j++){
//                 System.out.print(" ");

//             }
//             for(int k=0;k<2*i+1;k++){
//                 if(i==n-1 ||k==0 ||k==2*i ){
//                 System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }


// public class Solvep{
//     public static void main(String[] args) {
//         int n=5;
//         for(int i=n-1;i>=0;i--){
//             for(int j=0;j<n-i-1;j++){
//                 System.out.print(" ");

//             }
//             for(int k=0;k<2*i+1;k++){
//                 if(i==n-1 ||k==0 ||k==2*i ){
//                 System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }

// public class Solvep{
//     public static void main(String[] args) {
//         int n=5;

//         for(int i=0;i<n-1;i++){
//             for(int j=0;j<n-i-1;j++){
//                 System.out.print(" ");

//             }
//             for(int k=0;k<2*i+1;k++){
//                 if( k==0 ||k==2*i ){
//                 System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//         for(int i=n-1;i>=0;i--){
//             for(int j=0;j<n-i-1;j++){
//                 System.out.print(" ");

//             }
//             for(int k=0;k<2*i+1;k++){
//                 if( k==0 ||k==2*i ){
//                 System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }


// public class Solvep{
//     public static void main(String[] args) {
//         int n=6;
//         for(int i=0
//         ;i<n;i++){
//             for(int j=1;j<=i+1;j++){
//                 System.out.print(j +" ");
//             }
//             System.out.println();
//         }
//     }
// }





// public class Solvep{
//     public static void main(String[] args) {
//         int n=5;
//         for(int i=0;i<n;i++){
//             for(int j=0;j<n-i-1;j++){
//                 System.out.print("  ");
//             }
//             for(int k=i;k>=0;k--){
//                 System.out.print((k+1)+" ");
//             }
//             System.out.println();
//         }
//     }
// }

// public class Solvep{
//     public static void main(String[] args) {
//         int n=5;
//         for(int i=0;i<n;i++){
//             for(int j=0;j<n-i-1;j++){
//                 System.out.print("  ");
//             }
//             for(int k=i;k>=0;k--){
//                 System.out.print((k+1)+" ");
//             }
//             for(int j=2;j<=i+1;j++){
//                 System.out.print(j+" ");
//             }
//             System.out.println();
//         }
//     }
// }

// public class Solvep{

//     public static void main(String[] args) {
//         int n=5;
//         for(int i=0;i<n;i++){
//             for(int j=0;j<n-i-1;j++){
//                 System.out.print("  ");
//             }
//             for(int k=0;k<2*i+1;k++){
//                 if(i==n-1 || k==0 || k==2*i){
//                 System.out.print("* ");
//                 }else{
//                     System.out.print("  ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }

// public class Solvep{
    
//     public static void main(String[] args) {
//         int n=5;
//         for(int i=0;i<n-1;i++){
//             for(int j=i+1;j<n;j++){
//                 System.out.println(i +" "+  j);
//             }
//         }
//     }
// }


//Print 4 table
// import java.util.Scanner;
// public class Solvep{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         for(int i=1;i<=10;i++){
//             System.out.println(n+" * "+ i +" = "+n*i );
//         }
        
//     }
// }


//import java.util.Scanner;
// public class SolvingProblems{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int[] arr=new int[n];
//         for(int i=0;i<arr.length;i++){
//             arr[i]=sc.nextInt();
//         }
//         int max=arr[0];
//         for(int i=1;i<arr.length;i++){
//             if(max < arr[i]){
//                 max=arr[i];
                
//             }
//         }
//         System.out.println(max);
//     }
// }


// import java.util.HashMap;
// public class Solving{
//     public static void main(String[] args) {
//         HashMap <Integer,Integer> aruna=new HashMap<>();
//        //int[] arr={6,7,8,9,6,9};
//        int[] arr={1,5,8,0,1,8,1,5,1};
//        for(int i=0;i<arr.length;i++){
//         int n=arr[i];
//        if(aruna.containsKey(n)){
//         int prev=aruna.get(n);
//         aruna.put(n,prev+100);

//        }
//        else{
//         aruna.put(n,100);
//        }

//        }
//         for(int boom:aruna.keySet()){
//             //System.out.println(boom);
//             System.out.println(boom+" -> "+aruna.get(boom));

//         }
// }
// }


// import java.util.*;
// public class Solve{
//     public static void main(String[] args) {
//         HashMap<String,Integer> hm=new HashMap<>();
//         String arr[]={"Hello","Bolo","Hello","Tata","Bolo"};
//         for(int i=0;i<arr.length;i++){
//             String key=arr[i];
//             // if(hm.containsKey(key)){
//             //     int curval=hm.get(key);
//             //     hm.put(key,curval+1);

//             // }
//             // else{
//             //     hm.put(key,1);
//             // }
//             hm.put(key,hm.getOrDefault(key,0)+1);
//         }
//         for(String s:hm.keySet()){
//             System.out.println(s+" -> "+hm.get(s));
//         }
        
//     }
//}



// import java.util.*;
// public class Solve{
//     public static void main(String[] args) {
//         HashMap<Integer,Integer> hm=new HashMap<>();
//         int arr[]={1,2,1,1,2,2,2};
//         int ans=0;
//         for(int i=0;i<arr.length;i++){
//             if(hm.containsKey(arr[i])){
//                 ans=ans+hm.get(arr[i]);
//                 hm.put(arr[i],hm.get(arr[i])+1);

//             }
//             else{
//                 hm.put(arr[i],1);
//             }
//         }
//         System.out.println(ans);
//     }
// }



//Highest sum of sub array
// public class Solve{
//    public static void main(String[] args) {
//     int[] arr={5,9,1,8,7};
//     int n=arr.length;
//     int ans=0;
//     for(int i=0;i<n;i++){
//         for(int j=i;j<n;j++){
//             int temp=0;
//             for(int k=i;k<=j;k++){
//                 temp+=arr[k];

//             }
//             ans=Math.max(ans,temp);
//         }
//     }
//     System.out.println(ans);
//    }
// }


//highest sum of sub Array of length 3
// public class Solve{
//    public static void main(String[] args) {
//     int[] arr={5,9,1,8,7};
//     int n=arr.length;
//     int sl=3;
//     int ans=0;
//     for(int i=0;i<n-sl+1;i++){
//         int j=i+sl-1;
//             int temp=0;
//             for(int k=i;k<=j;k++){
//                 temp+=arr[k];

//             }
//             ans=Math.max(ans,temp);
//     }
//     System.out.println(ans);
//    }
// }

// import java.util.*;
// public class Solve{
//     public static void main(String[] args) {
//         String s="Communication";
//         int n=s.length();
//         int sl=3;
//         int ans=0;
//         for(int i=0;i<n-sl+1;i++){
//             int j=i+sl-1;
//             int temp=0;
//                 for(int k=i;k<=j;k++){
//                     temp+=(int)s.charAt(k);
//                     System.out.print((int)s.charAt(k));
//                 }
//                 ans=Math.max(ans,temp);
//                 System.out.println();
            
//         }
//         System.out.println(ans);
        
//     }
// }


// public class Solve{

//     public static void main(String[] args) {
//         int arr[]={1,2,3,1,4};
//         int l=0;
//         int ans=0;
//         int temp=0;
//         int threshold=6;
//         int k=3;
//         for(int r=0;r<arr.length;r++){
//             temp+=arr[r];
//             if(r-l==k){
//                 temp=temp-arr[l];
//                 l++;
//             }
//                 if(r-l+1==k){
//                     if(temp>=threshold){
//                         ans++;
//                     }
//                 }
            

//         }
//         System.out.println(ans);
//     }
// }



// public class Solve{
//     public static void main(String[] args) {
//         int arr[]={1,8,3,7,5,6};
//         int l=0;
//         int temp=0;
//         int k=3;
//         int max=Integer.MIN_VALUE;
//         for(int r=0;r<arr.length;r++){
//             temp+=arr[r];
//             if(r-l==k){
//                 temp-=arr[l];
//                 l++;
//             }
//             if(r-l+1==k){
//                 max=Math.max(max,temp);
//             }
//         }
//         System.out.println(max);
//     }
// }


// public class Solve{
//     public static void main(String[] args) {
//         int arr[]={1,2,3,2,9};
//         int l=0;
//         int temp=0;
//         int ans=0;
//         int k=10;
//         for(int r=0;r<arr.length;r++){
//             temp+=arr[r];
//             while(temp>10){
//                 temp-=arr[l];
//                 l++;
//             }
//             ans=Math.max(ans,r-l+1);
//         }
//         System.out.println(ans);
//     }
// }

// public class Solve{
//     public static void main(String[] args) {
//         int arr[]={0,1,3,1,1,6,7,1,0,1};
//         int l=0;
//         int k=2;
//         int temp=0;
//         int ans=0;
//         for(int r=0;r<arr.length;r++){
//             if(arr[r]==1){
//                 temp++;
//             }
//             while(temp>k){
//                 if(arr[l]==1){
//                     temp--;
//                 }
//                 l++;
//             }
//             ans=Math.max(ans,r-l+1);
//         }
//         System.out.println(ans);
//     }
// }


// public class Solve{
//     public static void main(String[] args) {
//         int arr[]={12,1,3,1,1,6,7,1,8,1};
//         int l=0;
//         int k=2;
//         int temp=0;
//         int ans=0;
//         for(int r=0;r<arr.length;r++){
//             if(arr[r]%2 != 0){
//                 temp++;
//             }
//             while(temp>k){
//                 if(arr[l]%2 != 0){
//                     temp--;
//                 }
//                 l++;
//             }
//             ans=Math.max(ans,r-l+1);
//         }
//         System.out.println(ans);
//     }
// }


public class Solve{
    public static void main(String[] args) {
        int arr[]={1,1,0,1,0,0,0};
        int l=0;
        int k=2;
        int temp=0;
        int ans=0;
        for(int r=0;r<arr.length;r++){
            if(arr[r]== 0){
                temp++;
            }
            while(temp>k){
                if(arr[l]== 0){
                    temp--;
                }
                l++;
            }
            ans=Math.max(ans,r-l+1);
        }
        System.out.println(ans);
    }
}