
public class LinkedList{

    private Node head;

    public LinkedList(){
        this.head=null;
    }
    public Node getFront(){
        return this.head;
    }
    public void setFront(Node no){
        this.head=no;
    }
    public void append(Node node){
        Node temp=head;
        if(head==null){
            head=node;
        }else if(head.getNext()==null){
            head.setNext(node);
        }
        else{
            while(temp.getNext()!=null){
                temp=temp.getNext();
            }
            temp.setNext(node);
        }
    }
    public void insert(Node node, int index){
        Node temp=head;
        boolean t=false;
        if(index==0){
            node.setNext(head);
            head=node;
      

        }
        else if(head==null){
            head=node;
      
        }
        else if(head.getNext()==null){
            head.setNext(node);
  
        }
        else{ 
            for(int i =0; i<index-1;i++){
                if(temp.getNext()==null){
                    temp.setNext(node);
                     t=true;
                     break;
                }else{
                    temp=temp.getNext();
                }
            }
            if(t==false){
            node.setNext(temp.getNext());
            temp.setNext(node);
            }
        }
        
            
        
        
    }
    public Node remove(int index){
        Node temp=head;
        if(index==0){
            head=head.getNext();
            return head;
        }else if(head==null){
            return null;
        }else{
            for(int i =0;i<index-1;i++){
                if(temp.getNext()==null){
                    return null;
                }else{
                    temp=temp.getNext();
                }
            }if(temp.getNext()==null){
                temp.setNext(null);
            }
            
            else if(temp.getNext().getNext()==null){
                temp.setNext(null);
            }else{
            temp.setNext(temp.getNext().getNext());
            }
            return temp.getNext();
        }
    }
    public String toString(){//something wrong here
        String list="";
        Node temp=head;
        int count=0;
        String message="There are no items in this list.";
        if(head==null){
            return message;
        }else if(head.getNext()==null){
            return "Index: 0 Data: "+head.getData()+"\n";
        }
        
        else{
        while(temp.getNext()!=null){//this wont run for the second item in the list. this is what needs to be fixed
            list=list+"Index: "+count+" Data: "+temp.getData()+"\n";
            count++;
            if(temp.getNext()==null){
                break;
            }
            temp=temp.getNext();
        }}
        list=list+"Index: "+count+" Data: "+temp.getData()+"\n";
        return list;
    }
} 