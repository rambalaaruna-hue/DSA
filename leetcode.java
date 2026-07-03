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
// public class leetcode{
//     public static int atmostK(int[] nums,int goal){
//         if(goal<0){
//             return 0;
//         }
//         int l=0;
//         int temp=0;
//         int ans=0;
//         for(int r=0;r<nums.length;r++){
//             if(nums[r]==1){
//                 temp++;
//             }
//             while(temp>goal){
//                 if(nums[l]==1){
//                     temp--;
//                 }
//                 l++;
//             }
//             ans+=r-l+1;
//         }
//         return ans;
//     }
//     public static void main(String[] args) {
//         int[] nums={0,0,0,0,0};
//         int goal=0;
//         int finalAns=atmostK(nums,goal)-atmostK(nums,goal-1);
//         System.out.println(finalAns);
//     }
// }


//Leetcode-80
// public class leetcode{
//     public static int removeDuplicates(int[] nums){
//         int k=2;
//         for(int i=2;i<nums.length;i++){
//             if(nums[i] != nums[k-2]){
//                 nums[k]=nums[i];
//                 k++;
//             }
//         }
//         return k;
//     }
//     public static void main(String[] args) {
//         int[] nums={1,1,2,2,3};
//         int k=removeDuplicates(nums);
//         System.out.println(k);
//         for(int i=0;i<k;i++){
//             System.out.println(nums[i]);
//         }
//     }
// }



//Leetcode-412

// import java.util.ArrayList;
// import java.util.List;

// public class leetcode{
//     public static  List<String> fizzBuzz(int n) {
//         List<String> li=new ArrayList<>();
//         for(int i=1;i<=n;i++){
//             if(i%3 == 0 && i%5 == 0){
//                 li.add("FizzBuzz");
//             }
//             else if(i%3 == 0){
//                 li.add("Fizz");
//             }
//             else if(i%5 == 0){
//                 li.add("Buzz");
//             }
//             else{
//                 li.add(String.valueOf(i));
//             }
//         }
//         return li;

        
//     }
//     public static void main(String[] args) {
//         int n=15;
//         System.out.println(fizzBuzz(n));
//     }
// }


//Leetcode-643
// public class leetcode{
//     public static double findMaxAverage(int[] nums, int k) {
//         int l=0;
//         int temp=0;
//         double ans = -Double.MAX_VALUE;
//         for(int r=0;r<nums.length;r++){
//             temp+=nums[r];
//             if(r-l == k){
//                 temp-=nums[l];
//                 l++;
//             }
//             if(r-l+1 == k){
//                 ans=Math.max(ans,(double)temp/k);
//             }
//         }
//         return ans;
//     }
//     public static void main(String[] args) {
//         int[] nums={8,3,-2,-5,3,4};
//         int k=3;
//         System.out.println(findMaxAverage(nums,k));
//     }
// }


//Leetcode-387

// import java.util.HashMap;

// public class leetcode{
//     public static int firstUniqChar(String s) {
//         HashMap<Character,Integer> hm=new HashMap<>();
//         for(int i=0;i<s.length();i++){
//             char ch=s.charAt(i);
//             hm.put(ch,hm.getOrDefault(ch,0)+1);
//         }
//         for(int i=0;i<s.length();i++){
//             char ch=s.charAt(i);
//             if(hm.get(ch) == 1){
//                 return i;
//             }
//         }
//         return -1;
//     }
//     public static void main(String[] args) {
//         String s="leetcodeproblems";
//         System.out.println(firstUniqChar(s));
//     }
// }


//Leetcode-13
// public class leetcode{
//     public static int romanToInt(String s) {
//     int ans=0;
//     int num=0;
//       for(int i=s.length()-1;i>=0;i--){
//         switch (s.charAt(i)){
//             case 'I':
//             num=1;
//             break;
//             case 'V':
//             num=5;
//             break;
//             case 'X':
//             num=10;
//             break;
//             case 'L':
//             num=50;
//             break;
//             case 'C':
//             num=100;
//             break;
//             case 'D':
//             num=500;
//             break;
//             case 'M':
//             num=1000;
//             break;

//         }
//         if(4*num < ans){
//             ans-=num;
//         }
//         else{
//             ans+=num;
//         }
        
//     }
//     return ans;
// }
// public static void main(String[] args) {
//     String s="XIV";
//     System.out.println(romanToInt(s));
// }
// }


//Leetcode-992

// import java.util.HashMap;

// public class leetcode{
//     public static int atmostK(int[] nums,int k){
//         int l = 0;
//         int ans = 0;
//         HashMap<Integer,Integer> hm = new HashMap<>();
//         for(int r = 0;r < nums.length;r++){
//             int val = nums[r];
//             hm.put(val,hm.getOrDefault(val,0)+1);

//             while(hm.size()>k){
//                 int lval=nums[l];
//                 hm.put(lval,hm.get(lval)-1);
//                 if(hm.get(lval) == 0){
//                     hm.remove(lval);
//                 }
//                 l++;
//             }
//             ans+=r-l+1;
//         }
//         return ans;
//     }
//     public static void main(String[] args) {
//         int[] nums={1,2,1,2,3};
//         int k=2;
//         int finalAns = atmostK(nums,k)-atmostK(nums,k-1);
//         System.out.println(finalAns);
//     }
// }


//Leetcode-704
// public class leetcode{
//     public static  int search(int[] nums, int target) {
//         int l = 0;
//         int r = nums.length - 1;
//         int ans = -1;
//         while(l <= r){
//             int mid = l + (r - l)/2;
//             if(nums[mid] == target){
//                 ans = mid;
//                 break;
//             }
//             else if(nums[mid] > target){
//                 r = mid - 1;
//             }
//             else{
//                 l = mid + 1;
//             }
//         }
//         return ans;
        
//     }
//     public static void main(String[] args) {
//         int[] nums={4,5,6,9,10,12};
//         int target = 9;
//         System.out.println(search(nums,target));

        
//     }
// }



//Leetcode-34
// import java.util.Arrays;
// public class leetcode{
//     public static int left(int[] nums,int target){
//         int l = 0;
//         int r = nums.length-1;
//         while(l<=r){
//            int  mid = l + (r - l)/2;
//             if(nums[mid] >= target){
//                 r = mid -1;
//             }else{
//                 l = mid + 1;
//             }
//         }
//         if(l >= nums.length){
//             return -1;
//         }
//         else if(nums[l] != target){
//             return -1;
//         }
//         return l;
//     }

//     public static int right(int[] nums,int target){
//         int l = 0;
//         int r = nums.length-1;
//         while(l<=r){
//            int mid = l + (r - l)/2;
//             if(nums[mid] > target){
//                 r = mid -1;
//             }else{
//                 l = mid + 1;
//             }
//         }
//         if(r < 0){
//             return -1;
//         }
//         else if(nums[r] != target){
//             return -1;
//         }
//         return r;
//     }
//     public static void main(String[] args) {
//         int[] nums={5,7,7,8,8,9};
//         int target=8;
//         int[] arr=new int[2];
//         arr[0]=left(nums,target);
//         arr[1]=right(nums,target);

//         System.out.println(Arrays.toString(arr));
        
//     }
// }


//Leetcode-2529
// public class leetcode{
//     public static int LeftMost(int[] nums,int target){
//         int l=0;
//         int r=nums.length-1;
//         while(l<=r){
//         int mid=l+(r-l)/2;
//         if(nums[mid] >= target ){
//             r=mid-1;
//         }
//         else{
//             l=mid+1;
//         }
//         }
//         return l;
        
//     }

//     public static void main(String[] args) {
//         int[] nums={-2,-1,0,1,3,5,6};
//         int n=nums.length;
//         int negatives= LeftMost(nums,0);
//          int one=LeftMost(nums,1);
//          int positives = n-one;
//           System.out.println(Math.max(negatives,positives));
        
//     }
// }


//Leetcode-1283
// public class leetcode{
//     public static boolean isPossible(int[] nums,int threshold,int k){
//         for(int i=0;i<nums.length;i++){
//             int upper = nums[i]/k;
//             if(nums[i]%k != 0){
//                 upper++;

//             }
//              threshold -= upper;
//              if( threshold < 0){
//             return false;
//              }
//         }
        
//         return true;
//     }
//     public static int smallestDivisor(int[] nums, int threshold) {
//         int l = 1;
//         int r = (int)Math.pow(10,6);
//         while(l <= r){
//             int k = l + (r - l)/2;
//             if(isPossible(nums,threshold,k)){
//                 r = k - 1;
//             }else{
//                 l = k + 1;
//             }
//         }
//         return l;
        
//     }
//     public static void main(String[] args) {
//         int[] nums={1,2,5,9};
//         int threshold=6;
//         System.out.println(smallestDivisor(nums,threshold));
        
        
        
//     }
// }


//Leetcode-875
// public class leetcode{
//      public static boolean isPossible(int[] piles,int h,int k){
//         for(int i=0;i<piles.length;i++){
//             int time = piles[i]/k;
//             if(piles[i]%k != 0){
//                 time++;
//             }
//             h -= time;
//             if(h < 0){
//                 return false;
//             }
//         }
//         return true;
//     }
//     public static int minEatingSpeed(int[] piles, int h) {
//         int l = 1;
//         int r = 1000000000; 
//          while(l <= r){
//             int k = l + (r - l)/2;
//             if(isPossible(piles,h,k)){
//                 r = k - 1;
//             }else{
//                 l = k + 1;
//             }
//         }
//         return l;

        
//     }
//     public static void main(String[] args) {
//         int[] piles = {3,6,7,11};
//         int h = 8;
//         System.out.println(minEatingSpeed(piles,h));

        
//     }
// }


//Leetcode-1482
// public class leetcode{
//     public static boolean isPossible(int[] bloomDay, int m, int k, int day){
//         int took = 0;
//         int bouquets = 0;
//         for(int i=0;i<bloomDay.length;i++){
//             if(bloomDay[i] <= day){
//                 took +=1;
//                if(took == k){
//                 bouquets += 1;
//                 took = 0;
//                 }
//             }
//             else{
//                 took = 0;
//             }
//             if(bouquets >= m){
//                 return true;
//             }
//         }
//         return false;
//     }

//      public static int minDays(int[] bloomDay, int m, int k) {
//         if((bloomDay.length < (long)m*k)){
//             return -1;
//         }else{
//         int l = 1;
//         int r = 1000000000;
//         while(l <= r){
//             int day = l +(r - l)/2;
//             if(isPossible(bloomDay,m,k,day)){
//                 r = day - 1;
//             }else{
//                 l = day + 1;
//             }
//         }
//         return l;
//         }
//     }
//     public static void main(String[] args) {
//         int[] bloomDay = {7,7,7,7,12,7,7};
//         int m = 2;
//         int k = 3;
//         System.out.println(minDays(bloomDay,m,k));
    
//     }
// }


//Leetcode-1011
// public class leetcode{
//     public static  boolean isPossible(int[] weights, int days ,int k){
//         int temp = 0;
//         for(int i=0;i<weights.length;i++){
//             int val = weights[i];
//             if(val > k){
//                 return false;
//             }
//             if(temp + val > k){
//                 days -= 1;
//                 temp = 0;
//                  if(days <= 0){
//                 return false;
//                  }
//             }
//             temp += val;
//         }
//         return true;
//     }

//     public static int shipWithinDays(int[] weights, int days) {
//         int l = 1;
//         int r = Integer.MAX_VALUE;
//         while(l <= r){
//             int mid = l + (r - l)/2;
//             if(isPossible(weights,days,mid)){
//                 r = mid - 1;
//             }else{
//                 l = mid + 1;
//             }
//         }
//         return l;
        
//     }
//     public static void main(String[] args) {
//         int[] weights = {3,2,2,4,1,4};
//         int days = 3;
//         System.out.println(shipWithinDays(weights,days));
        
//     }
// }


//Leetcode-2064
// public class leetcode{
//     public static boolean isPossible(int n,int[] quantities,int limit){
//         int temp = 0;
//         for(int i = 0;i < quantities.length;i++){
//             temp = quantities[i]/limit;
//             if(quantities[i]%limit != 0){
//                 temp++;
//             }
//             n -= temp;
//             if(n < 0){
//                 return false;
//             }
//         }
//         return true;
//     }

//     public static int minimizedMaximum(int n, int[] quantities) {
//         int l = 1;
//         int r = 100000;
//         while(l <= r){
//             int mid  = l + (r - l)/2;
//             if(isPossible(n,quantities,mid)){
//                 r = mid - 1;
//             }else{
//                 l = mid + 1;
//             }
//         }
//         return l;
        
//     }
//     public static void main(String[] args) {
//         int[] quantities = {15,10,10};
//         int n = 7;
//         System.out.println(minimizedMaximum(n,quantities));
        
//     }
// }


//Leetcode-1552

import java.util.Arrays;

public class leetcode{
    public static boolean isPossible(int[] position, int m ,int k){
        int prev = position[0];
        m -= 1;
        for(int i = 1;i < position.length;i++){
            int val = position[i];
            if(val - prev >= k){
                m -= 1;
                prev = val;
            }
            if(m <= 0){
                return true;
            }
        }
        return false;
    }

    public static int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int l = 1;
        int r = 1000000000;
        while( l <= r){
            int mid = l + (r - l)/2;
            if(isPossible(position,m,mid)){
                l = mid + 1;
            }else{
                r = mid - 1;
            }
        }
        return r;
        
    }
    public static void main(String[] args) {
        int[] position = {1,2,3,4,7};
        int m = 3;
        System.out.println(maxDistance(position,m));
        
    }
}