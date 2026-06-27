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

// import java.util.Arrays;

// public class leetcode{
//      public static int arrayPairSum(int[] nums) {
//         Arrays.sort(nums);
//         int ans=0;
//         for(int i=0;i<nums.length;i=i+2){
//             ans+=nums[i];
//         }
//         return ans;
        
//     }
//     public static void main(String[] args) {
//         int nums[]={1,4,3,2};
//         int result=arrayPairSum(nums);
//         System.out.println(result);
//     }
// }


//Leetcode-2024
// public class leetcode{
//         public static int maxConsecutiveAnswers(String answerKey, int k) {
//         int l=0;
//         int cnt0=0;
//         int cnt1=0;
//         int ans=0;
//         for(int r=0;r<answerKey.length();r++){
//             if(answerKey.charAt(r)=='T'){
//                 cnt0++;
//             }else{
//                 cnt1++;

//             }
//             while(Math.min(cnt0,cnt1)>k){
//                 if(answerKey.charAt(l)=='T'){
//                     cnt0--;
//                 }else{
//                     cnt1--;
//                 }
//                 l++;
//             }
//             ans=Math.max(ans,r-l+1);
//         }
//         return ans;
//     }
    
//     public static void main(String[] args) {
//         String answerKey="TFFFTFFTTT";
//         int k=2;
//         int result=maxConsecutiveAnswers(answerKey,k);
//         System.out.println(result);
//     }
// }


//Leetcode-3
// import java.util.HashSet;

// public class leetcode{
//     public  static int lengthOfLongestSubstring(String s) {
//         HashSet<Character> hs=new HashSet<>();
//         int l=0;
//         int ans=0;
//         for(int r=0;r<s.length();r++){
//             char ch=s.charAt(r);
//             if(!hs.contains(ch)){
//                 hs.add(ch);
//             }else{
//                 while(hs.contains(ch)){
//                     hs.remove(s.charAt(l));
//                     l++;
//                 }
//                 hs.add(ch);
//             }
//             ans=Math.max(ans,r-l+1);
//         }
//         return ans;
        
//     }
//     public static void main(String[] args) {
//         String s="bbbbb";
//         int result=lengthOfLongestSubstring(s);
//         System.out.println(result);
//     }
// }


//Leetcode-904

// import java.util.HashMap;

// public class leetcode{
//     public static int totalFruit(int[] fruits) {
//         HashMap<Integer,Integer> hm=new HashMap<>();
//         int l=0;
//         int ans=0;
//         for(int r=0;r<fruits.length;r++){
//         int val=fruits[r];
//         hm.put(val,hm.getOrDefault(val,0)+1);

//         while(hm.size()>2){
//             int lval=fruits[l];
//             hm.put(lval,hm.get(lval)-1);
//             if(hm.get(lval)==0){
//                 hm.remove(lval);
//             }
//             l++;
//         }
//             ans=Math.max(ans,r-l+1);
//         }
//         return ans;
        
//     }
//     public static void main(String[] args) {
//         int fruits[]={0,1,2,2};
//         int result=totalFruit(fruits);
//         System.out.println(result);
//     }
// }


// import java.util.*;

// public class leetcode{
//     public static boolean fun(HashMap<Character,Integer>hm1,HashMap<Character,Integer>hm2){
//         if(hm1.size()!=hm2.size()){
//             return false;
//         }
//         for(char key:hm1.keySet()){
//             if(!hm2.containsKey(key)){
//                 return false;
//             }
//             int a=hm1.get(key);
//             int b=hm2.get(key);
//             if(a!=b){
//                 return false;
//             }
//         }
//         return true;
//     }
//     public static void main(String[] args) {
//         String s="cbaebabacd";
//         String p="abc";
//         HashMap<Character,Integer> hm1=new HashMap<>();
//         HashMap<Character,Integer> hm2=new HashMap<>();
//         List<Integer> li=new ArrayList<>();
//         for(int i=0;i<p.length();i++){
//             char c=p.charAt(i);
//                 hm2.put(c,hm2.getOrDefault(c,0)+1);
//         }
//         System.out.println(hm2);
        
//         int l=0;
//         int temp=0;
//         for(int r=0;r<s.length();r++){
//             temp+=s.charAt(r);
//             if(r-l==p.length()){
//                 temp-=s.charAt(l);
//                 l++;
//             }
//             if(r-l+1==p.length()){
//                String sub=s.substring(l,r+1);
//                for(int i=0;i<sub.length();i++){
//                 char ch=sub.charAt(i);
//                 hm1.put(ch,hm1.getOrDefault(ch,0)+1);
//                }
                
//             }
//             boolean valid=fun(hm1,hm2); 
//             if(valid==true){
//                 li.add((r-p.length())+1);
//             }
//             hm1.clear();
//         }
//         System.out.println(hm1);
//         System.out.println(li);
//     }
// }


//Leetcode -438
// import java.util.*;
// public class leetcode{


//     public static boolean fun(HashMap<Character,Integer>hms,HashMap<Character,Integer>hmp){
//         if(hms.size()!=hmp.size()){
//             return false;
//         }
//         for(char key:hms.keySet()){
//             if(!hmp.containsKey(key)){
//                 return false;
//             }
//             int a=hms.get(key);
//             int b=hmp.get(key);
//             if(a!=b){
//                 return false;
//             }
//         }
//         return true;

//     }
//     public static void main(String[] args) {
//         String s="abab";
//         String p="ab";
//         HashMap<Character,Integer> hms=new HashMap<>();
//         HashMap<Character,Integer> hmp=new HashMap<>();
//          for(int i=0;i<p.length();i++){
//               char ch=p.charAt(i);
//               hmp.put(ch,hmp.getOrDefault(ch,0)+1);
    
//          }

//          List<Integer> ans=new ArrayList<>();
//     int k=p.length();
//     int n=s.length();
//     int l=0;
//     for(int r=0;r<n;r++){
//         char ch=s.charAt(r);
//         hms.put(ch,hms.getOrDefault(ch,0)+1);
//         if(r-l==k){
//             char chl=s.charAt(l);
//             hms.put(chl,hms.get(chl)-1);
//             if(hms.get(chl)==0){
//                 hms.remove(chl);
//             }
//             l++;
//         }

//         if(r-l+1==k){
//             boolean valid=fun(hms,hmp);
//             if(valid){
//                 ans.add(l);
//             }

//         }
//     }
//     System.out.println(ans);

// }
// }


//Leetcode-209
// public class leetcode{
//     public static int minSubArrayLen(int target, int[] nums) {
//         int l=0;
//         int temp=0;
//         int ans=Integer.MAX_VALUE;
//         for(int r=0;r<nums.length;r++){
//             temp+=nums[r];
//         while(temp>=target){
//             ans=Math.min(ans,r-l+1);
//             temp-=nums[l];
//             l++;
//         }
//         }
//         if(ans==Integer.MAX_VALUE){
//             return 0;
//         }
//         return ans;
        
//     }
//     public static void main(String[] args) {
//         int nums[]={1,4,4};
//         int target=4;
//         int result=minSubArrayLen(target,nums);
//         System.out.println(result);
        
//     }
// }



//Leetcode-1248
// public class leetcode{
//     public static int atmostK(int[] nums,int k){
//         int l=0;
//         int temp=0;
//         int ans=0;
//         for(int r=0;r<nums.length;r++){
//             if(nums[r]%2 != 0){
//                 temp++;
//             }
//             while(temp>k){
//                 if(nums[l]%2 != 0){
//                     temp--;
//                 }
//                 l++;
//             }
//             ans+=r-l+1;
            
//         }
//         return ans;

//     }
//     public static void main(String[] args) {
//         int nums[]={1,1,2,1,1};
//         int k=3;
//         int finalAns=atmostK(nums,k)-atmostK(nums,k-1);
//         System.out.println(finalAns);
//     }
// }


//Leetcode-930:Binary SubArrays With Sum
public class leetcode{
    public static int atmostK(int[] nums,int goal){
        if(goal<0){
            return 0;
        }
        int l=0;
        int temp=0;
        int ans=0;
        for(int r=0;r<nums.length;r++){
            if(nums[r]==1){
                temp++;
            }
            while(temp>goal){
                if(nums[l]==1){
                    temp--;
                }
                l++;
            }
            ans+=r-l+1;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums={0,0,0,0,0};
        int goal=0;
        int finalAns=atmostK(nums,goal)-atmostK(nums,goal-1);
        System.out.println(finalAns);
    }
}