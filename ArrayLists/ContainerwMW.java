package ArrayLists;

import java.util.ArrayList;

class ContainerwMW {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);
        System.out.println(findMW(list));
    }

    public static int findMW(ArrayList<Integer> list){
        int lp = 0;
        int rp = list.size()-1;

        int maxWater = Math.min(list.get(lp), list.get(rp))*(rp-lp);

        while(lp<rp){
            maxWater = Math.max(maxWater, Math.min(list.get(lp), list.get(rp))*(rp-lp));
            if(lp<rp) lp++;
            if(rp<lp) rp++;
        }

        return maxWater;
    }
}
