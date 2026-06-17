//HashMap DataStructure
// import java.util.HashMap;
// public class HashMap {
//     public static void main(String[] args) {
//         HashMap <Integer,Integer> aruna=new HashMap<>();
//         aruna.put(2,5);
//         int prev=aruna.get(2);
//         aruna.put(2,prev+1);
//         aruna.put(3,9);
//         aruna.put(3,10);
//         if(aruna.containsKey(7)){
//             int prevv=aruna.get(7);
//         }
//         System.out.println(aruna.get(3));
//         System.out.println(aruna.get(2));
// }
// }

// import java.util.HashMap;
// public class HashMap{
//     public static void main(String[] args) {
//         HashMap <Integer,Integer> aruna=new HashMap<>();
//         aruna.put(3,9);
//         //aruna.put(7,2);
//         int n=7;
//         if(aruna.containsKey(7)){
//             int prev=aruna.get(n);
//             aruna.put(n,prev+1);
//         }
//         else{
//             aruna.put(n,1);
//         }
//         System.out.println(aruna.get(3));
//         System.out.println(aruna.get(7));
// }
// }


// import java.util.HashMap;
// public class HashMap{
//     public static void main(String[] args) {
//         HashMap <Integer,Integer> aruna=new HashMap<>();
//         aruna.put(3,9);
//         aruna.put(8,10);
//         aruna.put(5,4);
//         for(int boom:aruna.keySet()){
//             //System.out.println(boom);
//             System.out.println(boom+" "+aruna.get(boom));

//         }
// }
// }


// import java.util.*;
// public class hashmappp{
  
//     public static boolean isIsomorphic(String s, String t) {
//         HashMap<Character,Character> hm=new HashMap<>();
//         HashMap<Character,Character> rev=new HashMap<>();
//         boolean ans=true;
//         for(int i=0;i<s.length();i++){
//             char ch1=s.charAt(i);
//             char ch2=t.charAt(i);
//             if(!hm.containsKey(ch1) && !rev.containsKey(ch2)){
//                 hm.put(ch1,ch2);
//                 rev.put(ch2,ch1);
//             }else if(hm.containsKey(ch1) && hm.get(ch1)!=ch2){
//                 ans=false;
//                 break;

//             }else if(rev.containsKey(ch2) && rev.get(ch2)!=ch1){
//                 ans=false;
//                 break;
//             }
//         }
       
//         return ans;

        
//     }
//     public static void main(String[] args) {
//         boolean result=isIsomorphic("foc","bca");

//         System.out.println(result);
//     }
// }


