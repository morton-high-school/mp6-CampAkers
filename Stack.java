public class Stack{
    private Node head;
    public Stack(){
        head=null;
    }
    public void push(Node item){
        Node temp=head;
        if(head==null){
            head=item;
        }else if(head.getNext()==null){
            head=item;
            item.setNext(temp);
        }
        else{
            head=item;
            item.setNext(temp);
            
            
            
        }
    }
    public Node pop(){
         Node temp=head;
          Node mo=temp.getNext();
        if(head==null){
            return temp;
        }else if(head.getNext()==null){
           //need to make this so that its .getnext.getnext because you will need to remove the last part of the list and it is out of bounds
            head=null;
            return temp;
        }
        else{
        head=head.getNext();
        return temp;
        
        }
        
    }
    public Node peek(){
        return head;
    }
    public boolean empty(){
        return (head==null);
    }
    public int search(Node item){
        Node temp=head;
        int count=0;
        if(head==null){
            return -1;
        }else if(head.getNext()==null){
            if(head==item){
                return 0;
            }
            return -1;
        }else{
        while(temp.getNext()!=null){
            
            if(temp.equals(item)){
                return count;
            }
            temp=temp.getNext();
            count++;
        }
        if(temp.equals(item)){
            return count;
        }
        }
        return -1;//only problem is here. should return 2 but returns 0 idk why
    }

    //first in last out, last in first out. think stacking pancakes

}