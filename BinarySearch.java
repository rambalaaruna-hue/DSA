// public class BinarySearch {
//     public static int bs(int[] arr, int target){
//         int l = 0;
//         int r = arr.length - 1;
//         while(l<=r){
//               int mid = (l+r)/2;
//             if(arr[mid]== target){
//                 return mid;
//             }
//             else if(arr[mid] >= target){
//                 r = mid-1;
//             }
//             else{
//                 l = mid+1;
//             }
//         }
//         return -1;

//     }
//     public static void main(String[] args) {
//         int[] arr = {2,4,5,8,9};
//         int target = 4;
//         System.out.println(bs(arr,target));

        
//     }
// }



// public class BinarySearch{
//     public static int bs(int[] arr, int target){
//         int l = 0;
//         int r = arr.length - 1;
//         while(l<=r){
//               int mid = (l+r)/2;
//              if(arr[mid] >= target){
//                 r = mid-1;
//             }
//             else{
//                 l = mid+1;
//             }
//         }
//         return l;

//     }
//     public static void main(String[] args) {
//         int[] arr={1,3,5,7,9};
//         System.out.println(bs(arr,10));
        
//     }
// }



// public class BinarySearch{
//     public static char bs(char[] arr, char target){
//         int l = 0;
//         int r = arr.length - 1;
//         while(l<=r){
//               int mid = (l+r)/2;
//              if(arr[mid] >= target){
//                 r = mid-1;
//             }
//             else{
//                 l = mid+1;
//             }
//         }
//         if(r == -1){
//             return 'a';
//         }
//         return arr[r];

//     }
//     public static void main(String[] args) {
//         char[] arr={'c','e','g','k','y'};
//         System.out.println(bs(arr,'b'));
        
//     }
// }


//Leftmost element
// public class BinarySearch {
//     public static int leftMost(int[] arr, int target){
//         int l = 0;
//         int r = arr.length - 1;
//         while(l<=r){
//               int mid = (l+r)/2;
//             if(arr[mid]== target){
//                 r=mid-1;
//             }
//             else if(arr[mid] >= target){
//                 r = mid-1;
//             }
//             else{
//                 l = mid+1;
//             }
//         }
//         return l;

//     }
//     public static void main(String[] args) {
//         int[] arr = {2,3,3,3,3,4};
//         int target = 3;
//         System.out.println(leftMost(arr,target));

        
//     }
// }


//Rightmost element
public class BinarySearch {
    public static int rightMost(int[] arr, int target){
        int l = 0;
        int r = arr.length - 1;
        while(l<=r){
              int mid = (l+r)/2;
            if(arr[mid]== target){
                l=mid+1;
            }
            else if(arr[mid] >= target){
                r = mid-1;
            }
            else{
                l = mid+1;
            }
        }
        return r;

    }
    public static void main(String[] args) {
        int[] arr = {2,3,3,3,3,4};
        int target = 3;
        System.out.println(rightMost(arr,target));

        
    }
}