// public class VariableSliding {
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


//Number of subarrays with atmost k odd numbers
public class VariableSliding {
    public static void main(String[] args) {
        int arr[]={1,2,4,3,8};
        int l=0;
        int temp=0;
        int ans=0;
        int k=1;
        for(int r=0;r<arr.length;r++){
            if(arr[r]%2 != 0){
                temp++;
            }
            while(temp>k){
                if(arr[l]% 2 != 0){
                  temp--;
                }
                
                l++;
            }
            System.out.println(" l "+ l +" r "+ r);
            ans+=r-l+1;
        }
        System.out.println(ans);
    }
}
