class MyStack {

    Queue<Integer> q1 = new ArrayDeque<>();
    Queue<Integer> q2 = new ArrayDeque<>();

    public MyStack() {

    }

    public void push(int x) {
        if (empty()) {
            q1.add(x);
            return;
        }
        if (!q1.isEmpty() && q2.isEmpty()) {
            q2.add(x);
            while (!q1.isEmpty()) {
                q2.add(q1.remove());
            }
        } else {
            q1.add(x);
            while (!q2.isEmpty()) {
                q1.add(q2.remove());
            }
        }
    }

    public int pop() {
        if (!q1.isEmpty()) {
            return q1.remove();
        }
        return q2.remove();
    }

    public int top() {
        if (!q1.isEmpty()) {
            return q1.peek();
        }
        return q2.peek();
    }

    public boolean empty() {
        return q1.isEmpty() && q2.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */