public class SubString {
    public static void main(String[] args) {
        String s="Communication";
        int n=s.length();
        int sl=3;
        int ans=0;
        for(int i=0;i<n-sl+1;i++){
            int j=i+sl-1;
            int temp=0;
                for(int k=i;k<=j;k++){
                    temp+=(int)s.charAt(k);
                    //System.out.print((int)s.charAt(k));
                }
                ans=Math.max(ans,temp);
                //System.out.println();
            
        }
        System.out.println(ans);
        
    }
}
