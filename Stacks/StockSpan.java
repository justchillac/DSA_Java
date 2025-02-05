package Stacks;

import java.util.Stack;

public class StockSpan {
    public static void main(String[] args) {
        int stock[] = {100,80,60,70,60,85,100};
        int span[] = new int[stock.length];
        span = stockSpan(stock, span);

        for(int i=0;i<span.length;i++){
            System.out.print(span[i] + " ");
        }
    }

    public static int[] stockSpan(int stocks[], int span[]){
        Stack<Integer> s = new Stack<>();
        span[0] = 1;
        s.push(0);
        
        for(int i=1;i<stocks.length;i++){
            while(!s.isEmpty() && stocks[s.peek()]<=stocks[i]){
                // if(stocks[s.peek()]<=stocks[i]) 
                s.pop();
            }
            if(s.isEmpty()) span[i] = i+1;
            else span[i] = i-s.peek();
            s.push(i);
        }

        return span;
    }
}
