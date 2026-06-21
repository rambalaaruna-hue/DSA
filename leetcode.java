// class leetcode {
//     public int addDigits(int num) {
//         return num == 0 ? 0 : 1 + (num - 1) % 9;
//     }
// }

// class leetcode{
    
//         public   int scoreOfString(String s){
//         int ans=0;
//         for(int i=0;i<s.length()-1;i++){
//             int a=i;
//             int b=i+1;
//             char first=s.charAt(a);
//             char second=s.charAt(b);
//             int aascii=first;
//             int bascii=second;
//             int temp=Math.abs(first - second);
//              ans=ans + temp;
           

//         }
//         return ans;
//     }
  
//     public static void main(String[] args) {
//         leetcode obj=new leetcode();
//         int result=obj.scoreOfString("hello");
//         System.out.println(result);
        
    
// }
//   }


//2110
// class Solution {
//     public int finalValueAfterOperations(String[] operations) {
//         int X=0;
//         for(String op:operations ){
//             if(op.equals("X++") || op.equals("++X")){
//                 X++;
//             }
//             else {
//                 X--;
//             }
            
//         }
//         return X;
        
//     }
// }


// class Solution {
//     public String defangIPaddr(String address) {
//         String UpdatedAddress = address.replace("." , "[.]");
        
//         return UpdatedAddress;
        
//     }
// }


// class leetcode {
//     public  static  int numJewelsInStones(String jewels, String stones) {
//         int ans=0;
//         for(int j=0;j<jewels.length();j++){
//             //char temp=jewels.charAt(j);
//             for(int s=0;s<stones.length();s++){
//                 //char temp2=stones.charAt(s);
//                 if(jewels.charAt(j) == stones.charAt(s)){
//                     ans=ans + 1;
//                 }
//             }
//         }
//         return ans;
        
//     }
//     public static void main(String[] args) {
//         int result=numJewelsInStones("aA","aAAbbb");
//         System.out.println(result);
//     }
// }


// class Solution {
//     public int mostWordsFound(String[] sentences) {
//         int ans=0;
//         for(int i=0;i<sentences.length;i++){
//             String s=sentences[i];
//             int temp=1;
//             for(int j=0;j<s.length();j++){
//                 if(s.charAt(j) == ' '){
//                     temp++;
//                 }
//             }
//             ans=Math.max(ans,temp);
//         }
//         return ans;
        
//     }
// }

//2744
// class Solution {
//     public String reverse(String s){
//         String rev="";
//         for(int i=s.length()-1;i>=0;i--){
//             rev = rev +s.charAt(i);
//         }
//         return rev;
//     }
//     public int maximumNumberOfStringPairs(String[] words) {
//         int ans = 0;
//         int n= words.length;
//         for(int i=0;i<n-1;i++){
//             String a=words[i];
//             if(a.equals("0")){
//                 continue;
//             }
//             for(int j= i+1;j<n;j++){
//                 String b=words[j];
//                 String revb=reverse(b);
//                 if(revb.equals(a)){
//                     ans++;
//                     words[j]="0";
//                     break;
//                 }
//             }
//         }

       
//         return ans;
        
//     }
// }


// public class leetcode{

//     public static void main(String[] args) {
//         int m=6;
//         for(int p=0;p<m;p++){
//             for(int q=2;q<p+1;q++){
//                 System.out.print(q);
//             }
//             System.out.println();
//         }
//     }
// }


//Leetcode problem-1984

// import java.util.*;
// class leetcode {
//     public static int minimumDifference(int[] nums, int k) {
//         Arrays.sort(nums);
//         int ans=Integer.MAX_VALUE;
//         int l=0;
//         for(int r=0;r<nums.length;r++){
//             if(r-l==k){
//                 l++;
//             }
//             if(r-l+1==k){
//                 int temp=nums[r]-nums[l];
//                 ans=Math.min(ans,temp);
//             }
//         }
//         return ans;
        
//     }
//     public static void main(String[] args) {
//         int nums[]={0,4,3,1};
//         int result=minimumDifference(nums,2);
//         System.out.println(result);
//     }
// }


//Leetcode problem-26
// class leetcode{
//     public static int removeDuplicates(int[] nums) {
//         int count=0;
//         for(int i=0;i<nums.length;i++){
//             if(i<nums.length-1 && nums[i]==nums[i+1]){
//                 continue;
//             }
//             else{
//                 nums[count]=nums[i];
//                 count++;
//             }
//         }
//         return count;
        
//     }
//     public static void main(String[] args) {
//         int nums[]={1,1,2,3,3,3,4};
//         int result=removeDuplicates(nums);
//         System.out.println(result);
//     }

// }


//Leetcode-2144
// import java.util.*;
// public class leetcode{
//      public static int minimumCost(int[] cost) {
//         Arrays.sort(cost);
//         int took=0;
//         int minCost=0;
//        for(int i=cost.length-1;i>=0;i--){
//         if(took==2){
//             took=0;
//         }
//         else{
//             minCost+=cost[i];
//             took ++;
//         }
//        }
//         return minCost;
//     }
//     public static void main(String[] args) {
//         int cost[]={2,9,7,6,2,5};
//         int result=minimumCost(cost);
//         System.out.println(result);
//     }    
        
// }


//Leetcode-561

import java.util.Arrays;

public class leetcode{
     public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int ans=0;
        for(int i=0;i<nums.length;i=i+2){
            ans+=nums[i];
        }
        return ans;
        
    }
    public static void main(String[] args) {
        int nums[]={1,4,3,2};
        int result=arrayPairSum(nums);
        System.out.println(result);
    }
}

