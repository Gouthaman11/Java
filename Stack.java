class stack{
    int[] arr;
    int top;
    int s;
    stack(int size) {
        arr = new int[size];
        top = -1;
        s = size;
    }   
}
public void push(int val){
    if(arr.length == s){
        System.out.println("Stack is full");
    } else {
        arr[++top] = val;
    }
}
public int peek(){
    return arr[top];
}
public boolean isFull(){
    return (arr.length-1==top)
}
public boolean isEmpty(){
    return (top == -1);
}
public int pop(){
    if(isEmpty()){
        System.out.println("Stack is empty");
        return -1;
    } else {
        return arr[top--];
    }
}
public void display(){
    for(int i = 0; i <= top; i++){
        System.out.print(arr[i] + " ");
    }
}

public static void main(String[] args) {
    stack s = new stack(5);
    s.push(10);
    s.push(20);
    s.push(30);
    s.display();
    System.out.println("\nTop element is: " + s.peek());
    System.out.println("Popped element is: " + s.pop());
    s.display();
}



