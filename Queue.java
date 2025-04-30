public class Queue{

    private Node head; 
    public Queue(){
        this.head=null;
    }
    public void add(Node item){
        Node temp=head;
        if(head==null){
            head=item;
        }else if(head.getNext()==null){
            head.setNext(item);
        }
        else{
            while(temp.getNext()!=null){
                temp=temp.getNext();
            }
            temp.setNext(item);
        }
    }
    public Node remove(){
        Node front=this.head;
        head=head.getNext();
        return front;
    }
    public Node peek(){
        return this.head;
    }
    public boolean empty(){
        if(this.head==null){
            return true;
        }else{
            return false;
        }
    }
    public int search(Node item){
        Node temp=this.head;
        int count=0;
        while(temp.getNext()!=null && temp.getData()!=item.getData()){
            temp=temp.getNext();
            count++;
        }
        if(temp.getData()==item.getData()){
            count++;
            return count;
        }
        return -1;
    }
    //first in first out, last in last out, think line for movie
    //you need to make sure that the head is changed everytime for at least stack maybe queue
    //otherwise you can just use the linked list and utilities, and it should be really easy

}