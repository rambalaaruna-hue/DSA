//Array List
// import java.util.*;
// public class Arraylist {
//     public static void main(String[] args) {
//         ArrayList<Integer> arr=new ArrayList<>();
//         arr.add(5);
//         arr.add(3);
//         arr.add(4);
//         System.out.println(arr);
//         arr.remove(1);//We need to give index number here not array element
//          System.out.println(arr);
//           System.out.println(arr.size());
        
//     }
// }


//2D ArrayList
import java.util.*;
public class Arraylist{
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arr=new ArrayList<>();

        ArrayList<Integer> temp=new ArrayList<>();
        temp.add(5);
        temp.add(4);
        temp.add(8);
        arr.add(temp);
        ArrayList<Integer> temp2=new ArrayList<>();
        temp2.add(2);
        temp2.add(3);
        temp2.add(6);
        arr.add(temp2);
         System.out.println(arr);  
    }
}
