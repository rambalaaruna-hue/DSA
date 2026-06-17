//First way

// public class Palindrome {
//     public static void main(String[] args) {
//         String s="madam";
//         String ans="";
//         for(int i=s.length()-1;i>=0;i--){// for strings use s.length() where as arrays use arr.length
//             ans=ans+s.charAt(i);
//         }
//         if(s.equals(ans)){
//             System.out.println(" it is a Palindrome");
//         }else{
//            System.out.println("It is not a palindrome");
//         }
        
//     }
// }



//Another way
public class Palindrome{
    public static void main(String[] args) {
        boolean isPalindrome=true;
        String s="Madam";
        //s=s.toLowerCase();
        int n=s.length();
        for(int i=0;i<n/2;i++){
            if(s.charAt(i) != s.charAt(n-i-1)){
                isPalindrome=false;
                break;
            }
        }
        if(isPalindrome){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
