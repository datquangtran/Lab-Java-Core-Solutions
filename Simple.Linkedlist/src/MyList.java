public class MyList {
    Node head, tail;
    public MyList(){
        head = tail = null; //Tao danh sach rong
    }
    public boolean isEmpty(){
        return (head ==null);
    }
    public void add(int x){
        if(isEmpty()){
            Node p = new Node();
            p.info = x;
            head=tail=p;
            tail.next=null;
        }else{
            //Node q = new Node(x,null);
            //tail.next = q;tail=q;
            Node q = new Node();
            q.info = x;
            tail.next = q;
            tail = q;
            q.next = null;
        }
    }
    public void clear(){
        
    }
    public void traverse(){
        Node p = new Node();
        p = head;
        if(isEmpty()){
                System.out.println("DANH SACH RONG");
                return;
        }while(p!=null){
            //Lay thog tin trong nut hien tai
            int x = p.info;
            System.out.print(x + ",");
            //Tro sang phan tu ke tiep
            p = p.next;
        }
    }
    public Node search(int x){
        Node p = new Node();
        p = head;
        while(p!=null){
            if(p.info == x) return p;
            p = p.next;
        }
        return null;
    }
    
    public void DeleteFirst(){
        if(isEmpty()) return;
        if(head==tail){
            head=tail=null;
        }else{
            head = head.next;
        }
    }
    public void DeleteLast(){
        if(isEmpty()) return;
        if(head==tail){
            head=tail=null;
        }else{
            Node p = new Node();
            Node q = new Node();
            p = q = head;
            while(p.next!=null){
                q = p;
                p = p.next;
            }
            System.out.println(q.info);
        }
    }
    
    public void InsertFirst(int x){
        if(isEmpty()){
            Node p = new Node();
            p.info = x;
            head = tail = p;
            tail.next = null;
        }
    }
   public boolean Delete(int x){
       boolean kq = false;
       //Thuc hien xoa
       Node p = new Node();
       p = search(x);
       if(p==null)  kq = false;
       else{
           Node q = new Node();
           Node r = new Node();
           q = head;
           while(q!=p){
               r = q;
               q = q.next;
           }
           System.out.println(q.info);
       }
       return kq;
   }
}
