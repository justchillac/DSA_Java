package ArrayLists;

import java.util.ArrayList;

public class PairSum2 {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target = 16;
        System.out.println(pairSum(list, target));
    }

    public static boolean pairSum(ArrayList<Integer> list, int target) {
        //First let's find the point that breaks the sorted array
        int i = 0;
        int lp = 0, rp = 0;
        while(i<list.size()-1){
            if(list.get(i+1)<list.get(i)){
                lp = i+1;
                rp = i;
                break;
            }
            i++;
        }
        
        //Now let's find if the target exists in the array by updating the array accordingly
        while(lp!=rp){
            //Checking the target
            if(list.get(lp)+list.get(rp)==target) return true;
            
            //Case 1 for lp updation:
            if(list.get(lp)+list.get(rp)<target) lp = (lp+1)%list.size();

            //Case 2 for rp updation:
            if(list.get(lp)+list.get(rp)>target) rp = (list.size()+rp-1)%list.size();
        }
        return false;
    }
}
