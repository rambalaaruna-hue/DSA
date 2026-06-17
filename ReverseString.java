public class ReverseString {
    public static void main(String[] args) {
        String s="Aruna";
        String ans="";
        for(int i=4;i>=0;i--){
            ans=ans+s.charAt(i);
        }
        System.out.println(ans);
    }
}
