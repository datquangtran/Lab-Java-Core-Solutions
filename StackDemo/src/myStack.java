
public class myStack {
    private Object data[]; //Mang luu tru cac phan tu cua Stack
    private int top;
    private int max; //So phan tu toi da cua mang
    public myStack(){
        max = 50;
        data = new Object[max];
        top = -1; //Sinh ra mot stack rong
    }
    
    public myStack(int max){
        this.max = max;
        data = new Object[max];
        top = -1;
    }
    public void clear(){
        top = -1;
    }
    public boolean isEmpty(){
        if(top==-1){
            return true;
        }
        else{
            return false;
        }
        //return (top = -1);
    }
    public boolean Full(){
        return (top==max-1);
    }
    public void push(Object x){
        if(Full()){
            System.out.println("Stack is full.");
            return;
        }
        top++;
        data[top] = x; //Dua phan tu vao Stack
    }
    public void traverse(){
        int m = size() -1;
        while(m>=0){
            int x = (int)data(m);
            System.out.println(x +", ");
            m--;
        }
    }
    public Object pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return null;
        }
        
    }
    public Object top(){
        
    }
}
