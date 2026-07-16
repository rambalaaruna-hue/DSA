//Palindrome
// public class New {
//     public static void main(String[] args) {
//         int n = 121;
//      int temp = n;
//      int rev = 0;
//      while(n > 0){
//          rev = rev * 10 + n %10;
//          n /= 10;
//      }
//      if(temp == rev){
//          System.out.println("Palindrome");
//      }else{
//          System.out.println("Not ");
//      }
//     }
// }

//prime
// import java.util.Scanner;
// public class New {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         boolean prime = true;
//         if(n <= 1){
//            prime = false;

//         }
//         for(int i = 2;i <= n/2;i++){
//             if(n % i == 0){
//                 prime = false;
//                 break;
//             }
//         }
//         if(prime){
//             System.out.println("Prime");
//         }else{
//             System.out.println("Not prime");
//         }
//     }
// }

//Fabinocci series
// public class New {
//     public static void main(String[] args) {
//         int n = 10;
//         int a = 0;
//         int b = 1;
//         for(int i = 1; i <= n;i++){
//             System.out.println(a+" ");
//             int c = a + b;
//             a = b;
//              b = c;
//         }

//     }
// }

//Factorial
// public class New {
//     public static void main(String[] args) {
//         int n = 5;
//         int fact = 1;
//         for(int i = n ; i >= 1;i--){
//              fact = fact * i;
//         }
//         System.out.println(fact);

//     }
// }

// public class New {
//     public static void main(String[] args) {
//         int[] arr = {10,50,20,30,40};
//         int n = arr.length;
//         for(int i = 0; i < n - 1;i++){
//             boolean swapped = false;
//             for(int j = 0; j< n- i-1;j++){
//                 if(arr[j] > arr[j + 1]){
//                     int temp =arr[j] ;
//                     arr[j] = arr[j+1];
//                     arr[j+1]= temp;
//                     swapped = true;
//                 }

//             }
//             if(swapped == false){
//                     break;
//                 }

//         }
//         for(int i:arr){
//                 System.out.println(i + " ");
//             }

//     }
// }

//Reverse Number
// public class New {
//     public static void main(String[] args) {
//         int num = 234;
//         int rev = 0;
//         while(num > 0){
//             rev = rev * 10 + num % 10;
//             num /= 10;
//         }
//         System.out.println(rev);

//     }
// }

//Sum of didgits
// public class New {
//     public static void main(String[] args) {
//         int num = 234;
//         int sum = 0;
//         while(num > 0){
//             sum += num % 10;
//             num /= 10;
//         }
//         System.out.println(sum);

//     }
// }

//ArmStrong Number
// public class New {
//     public static void main(String[] args) {
//         int num = 153;
//         int temp = num;
//         int sum = 0;
//         while (num > 0) {
//             int rem = num % 10;
//             sum += rem * rem * rem;
//             num /= 10;
//         }
//         if (sum == temp) {
//             System.out.println("Armstrong");
//         } else {
//             System.out.println("Not Armstrong");
//         }

//     }
// }



//Anagram
import java.util.*;
public class New {
    public static void main(String[] args) {
        String s="aruna";
        String t = "anjali";
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        if(Arrays.equals(a,b)){
            System.out.println("Anagram");
        }else{
            System.out.println("Not Anagram");
        }
     
    }
}
//2114,1480,1512,3,209,53