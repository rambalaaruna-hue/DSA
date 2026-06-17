//Two D-Arrays
// public class TwoDArray {
//     public static void main(String[] args) {
//         int [][] arr={{5,4},{3,2}};
//         //arr[0][0]=10;
//         for(int i=0;i<2;i++){
//             for(int j=0;j<2;j++){
//                 System.out.println(arr[i][j]);
//             }
//         }
//     }
// }


//First row
// public class TwoDArray {
//     public static void main(String[] args) {
//         int [][] arr={{5,4},{3,2},{8,6}};
//         int r=arr.length;
//         int c=arr[0].length;
//         for(int i=0;i<r;i++){
//             for(int j=0;j<c;j++){
//                 System.out.println(arr[i][j]);
//             }
//         }
//     }
// }


//second row
// public class TwoDArray {
//     public static void main(String[] args) {
//         int [][] arr={{5,4},{3,2},{8,6}};
//         int r=arr.length;
//         int c=arr[0].length;
//             for(int i=0;i<c;i++){
//                 System.out.println(arr[1][i]);
//             }
        
//     }
// }


//First column
// public class TwoDArray {
//     public static void main(String[] args) {
//         int [][] arr={{5,4,7},{3,2,1},{8,6,9}};
//         int r=arr.length;
//         int c=arr[0].length;
//         for(int i=0;i<r;i++){
//             System.out.println(arr[i][0]);
//         }
//     }
// }


//Print Diagonal elements
// public class TwoDArray {
//     public static void main(String[] args) {
//         int [][] mat={{1,4,3},{2,4,6},{5,8,2}};
//         int r=mat.length;
//         int c=mat[0].length;
//         for(int i=0;i<r;i++){
//             System.out.println(mat[i][i]);
//         }
//     }
// }

//Reverse Diagonal elements using for loop
// public class TwoDArray {
//     public static void main(String[] args) {
//         int [][] mat={{1,2,3,4},{5,6,7,8},{9,2,1,6}};
//         int r=mat.length;
//         int c=mat[0].length;
//         for(int i=0;i<r;i++){
//             int j=c-i-1;
//             System.out.println(mat[i][j]);
//         }
//     }
// }


// // Diagonal elements using while loop
// public class TwoDArray {
//     public static void main(String[] args) {
//         int [][] mat={{1,2,3,4},{5,6,7,8},{9,2,1,6}};
//         int r=mat.length;
//         int c=mat[0].length;
//         int i=0;
//         int j=0;
//         while(i<r && j<c){
//             System.out.println(mat[i][j]);
//             i++;
//             j++;
//         }
//     }
// }



// Reverse Diagonal elements using while loop
// public class TwoDArray {
//     public static void main(String[] args) {
//         int [][] mat={{1,2,3,4},{5,6,7,8},{9,2,1,6}};
//         int r=mat.length;
//         int c=mat[0].length;
//         int i=0;
//         int j=c-1;
//         while(i<r && j>=0){
//             System.out.println(mat[i][j]);
//             i++;
//             j--;
//         }
//     }
// }


// public class TwoDArray {
//     public static void main(String[] args) {
//         int [][] mat={{1,2,3,4},{5,6,7,8},{9,2,1,6}};
//         int r=mat.length;
//         int c=mat[0].length;
//         int i=0;
//         int j=2;
//         while(i<r && j<c){
//             System.out.println(mat[i][j]);
//             i++;
//             j++;
//         }
//     }
// }


// public class TwoDArray {
//     public static void main(String[] args) {
//         int [][] mat={{1,2,3,11},{4,11,6,12},{7,8,1,13}};
//         int r=mat.length;
//         int c=mat[0].length;
//         int i=0;
//         int j=0;
//         boolean isValid=true;
//         while(i<r && j<c){
//             System.out.println(mat[i][j]);
//             if(mat[i][j]!=1){
//                 isValid=false;
//             }
//             i++;
//             j++;
            
//         }
//         System.out.println(isValid);
//     }
// }


//All diagnal eleemnts are same or not
// public class TwoDArray {
//     public static void main(String[] args) {
//         int [][] mat={{1,2,3,11},{4,1,2,12},{7,8,1,2}};
//         int r=mat.length;
//         int c=mat[0].length;
//         int i=0;
//         int j=1;
//         boolean isValid=true;
//         int temp=mat[i][j];
//         while(i<r && j<c){
//             if(mat[i][j]!=temp){
//                 isValid=false;
//             }
//            // System.out.println(mat[i][j]);
//             i++;
//             j++;
            
//         }
//         System.out.println(isValid);
//     }
// }


public class TwoDArray {
    public static void main(String[] args) {
        int [][] mat={{1,2,3,4},{5,1,2,3}};
        int r=mat.length;
        int c=mat[0].length;
        boolean isValid=true;
        for(int n=0;n<r;n++){
        int i=0;
        int j=n;
         
         int temp=mat[i][j];
        while(i<r && j<c){
             if(mat[i][j]!=temp){
                 isValid=false;
             }
            System.out.println(mat[i][j]);
            i++;
            j++;
            
        }
    }
        System.out.println(isValid);
    }
}
 
