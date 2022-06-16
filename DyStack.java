public class DyStack {

    int capacity=2;
    int stack[]=new int[capacity];
    int top=0;
    public void push(int data){
        if(size()==capacity){
            expand();
        }
        stack[top]=data;
        top++;
    }
    public void show(){
        for(int i:stack) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public void expand(){
        int length=size();
        int newStack[] = new int[capacity*2];
        System.arraycopy(stack,0,newStack,0,length);
        stack=newStack;
        capacity=capacity*2;
    }

    public int pop(){
        int data;
        top--;
        data=stack[top];
        stack[top]=0;
        return data;
    }
    public int size(){
        return top;
    }
    public boolean isEmpty(){
        return top<=0;
    }
}

