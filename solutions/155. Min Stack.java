class MinStack 
{
    Stack<Integer> stack;
    PriorityQueue<Integer> priorityQueue;
    
    /** initialize your data structure here. */
    public MinStack() 
    {
        this.stack = new Stack<>();
        this.priorityQueue = new PriorityQueue<>();
    }
    
    public void push(int x)
    {
        stack.push(x);
        priorityQueue.add(x);
    }
    
    public void pop() 
    {
        Integer popped = stack.pop();
        priorityQueue.remove(popped);
    }
    
    public int top() 
    {
        return stack.peek();
    }
    
    public int getMin()
    {
        return priorityQueue.peek();
    }

}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */