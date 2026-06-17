//count how many 1's are there in an Array?
// public class Array{
//     public static void main(String[] args) {
//         int arr[]={1,4,6,1,3,5,1,8};
//         int count=0;
//         for(int i=0;i<arr.length;i++){
//              if(arr[i]==1){
//                 count=count + 1;
//              }
//         }
//          System.out.println(count);
//     }
// }


//How many numbers are divided by 3 in an Array?
// public class Array{
//     public static void main(String[] args) {
//         int arr[]={1,4,6,1,3,5,1,8};
//         int count=0;
//         for(int i=0;i<arr.length;i++){
//              if(arr[i] % 3== 0){
//                 count++;
//              }
//         }
//          System.out.println(count);
//     }
// }

// How many numbers are divided by  2 or 3 in an Array?
// public class Array{
//     public static void main(String[] args) {
//         int arr[]={1,4,6,1,3,5,1,8};
//         int count=0;
//         for(int i=0;i<arr.length;i++){
//               if(arr[i] % 2 == 0 || arr[i] % 3== 0 ){
//                count++;
//               }
//          }
//           System.out.println(count);
//      }
//  }

 // How many numbers are divided by  2 and 3 in an Array?
//  public class Array{
//     public static void main(String[] args) {
//         int arr[]={1,4,6,1,3,5,1,8};
//         int count=0;
//         for(int i=0;i<arr.length;i++){
//               if(arr[i] % 2 == 0 && arr[i] % 3== 0 ){
//                count++;
//               }
//          }
//           System.out.println(count);
//      }
//  }


//Printing an array using functions
// public class Array{
//     public static int[] fun(){
//         int arr[] = {3,4,8};
//         return arr;

//     }
//     public static void main(String[] args) {
//         int aruna[]=fun();
//        for(int i=0;i< aruna.length;i++){
//         System.out.println(aruna[i]);
//        }
//     }
// }


//Sub-Arrays
// public class Array{
//    public static void main(String[] args) {
//     int[] arr={1,3,4,5};
//     int n=arr.length;
//     for(int i=0;i<n;i++){
//         for(int j=i;j<n;j++){
//             for(int k=i;k<=j;k++){
//                 System.out.print(arr[k]+" ");
//             }
//             System.out.println();
//         }
//     }
//    }
// }


//Sub-String
// public class Array{
//    public static void main(String[] args) {
//     String s="vign";
//     int n=s.length();
//     for(int i=0;i<n;i++){
//         for(int j=i;j<n;j++){
//             for(int k=i;k<=j;k++){
//                 System.out.print(s.charAt(k)+" ");
//             }
//             System.out.println();
//         }
//     }
//    }
// }


// import java.util.*;
// public class Array{
//    public static void main(String[] args) {
//     String s="vign";
//     int n=s.length();
//     ArrayList<String> arr=new ArrayList<>();
//     for(int i=0;i<n;i++){
//         for(int j=i;j<n;j++){
//             String temp=s.substring(i,j+1);
//             arr.add(temp);
//         }
//     }
//     System.out.println(arr);
//    }
// }