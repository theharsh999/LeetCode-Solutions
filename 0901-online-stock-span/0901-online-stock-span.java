import java.util.*;

class StockSpanner {

    Stack<Integer> s = new Stack<>();
    ArrayList<Integer> prices = new ArrayList<>();

    public StockSpanner() {

    }

    public int next(int price) {
        int span = 0;
        prices.add(price);
        int currIdx = prices.size() - 1;
        while(!s.isEmpty() && price >= prices.get(s.peek())){
            s.pop();
        }
        if(s.isEmpty()){
            span = currIdx + 1;
        }else{
            span = currIdx - s.peek();
        }
        s.push(currIdx);
        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */