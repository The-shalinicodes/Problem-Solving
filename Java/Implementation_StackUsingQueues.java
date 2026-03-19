class MyStack {
    Queue<Integer> q1; //Main Queue acts like a stack
    Queue<Integer> q2; //Helper Queue

    public MyStack() {
        //Both are constructors initializes both queues as empty
        q1 = new LinkedList<>(); //q1=[]
        q2 = new LinkedList<>(); //q2=[]
    }

    public void push(int x) {
        //Step 1: Push into q2
        q2.add(x);
        //Step 2: Move all elements from q1 to q2
        while (!q1.isEmpty()) {
            q2.add(q1.remove());
        }
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    public int pop() {
        return q1.remove();
    }

    public int top() {
        return q1.peek();
    }

    public boolean empty() {
        return q1.isEmpty();
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