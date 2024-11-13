public class StackUsingArrays {
    int[] st;
    int top;
    int MAX = 1001;
    public StackUsingArrays() {
        st = new int[MAX];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }

    public void push(int x) {
        if(this.size() > MAX -1) return;
        st[++top] = x;
    }

    public int pop() {
        if(this.isEmpty()) return -1;
        return st[top--];
    }

    public int peek() {
        if(this.isEmpty()) return -1;
        return st[top];
    }

    public void display() {
        for(int i = top; i >= 0; i--) {
            System.out.print(st[i] + " ");
        }
    }

}

