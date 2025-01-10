package ArrayLists;

import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        System.out.println(list.size());

        reverseAL(list);
    }

    public static void reverseAL(ArrayList lt){
        for(int i= lt.size()-1;i>=0;i--){
            System.out.print(lt.get(i) + " ");
        }
    }

    
}
