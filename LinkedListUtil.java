public class LinkedListUtil{


    public static int length(LinkedList value){
        int count=0;
        Node temp=value.getFront();
        if(temp==null){
            return 0;
        }
        while(temp.getNext()!=null){
            count++;
            temp=temp.getNext();
        }
        count++;
        return count;
    }
    public static int search(LinkedList value, int data){
        Node temp=value.getFront();
        int count=0;
        while(temp.getNext()!=null){
            if(temp.getData()==data){
                return count;
            }else{
                temp=temp.getNext();
                count++;
            }
        }
        return -1;
    }
    public static Node getNode(LinkedList value, int index){
        Node temp=value.getFront();
        for(int i =0; i<index;i++){
            if(temp.getNext()==null){
                return null;
            }else{
                temp=temp.getNext();
            }
        }
        return temp;
    }
    public static int count(LinkedList value, int data){
        Node temp=value.getFront();
        int count=0;
        while(temp.getNext()!=null){
            if(temp.getData()==data){
                count++;
            }
            temp=temp.getNext();
        }
        if(temp.getData()==data){
            count++;
        }
        return count;
    }
    public static boolean compare(LinkedList value1, LinkedList value2){
        Node temp1=value1.getFront();
        Node temp2=value2.getFront();
        if(length(value1)!=length(value2)){
            return false;
        }
        while(temp1.getNext()!=null && temp2.getNext()!=null){
            if(temp1.getData()==temp2.getData()){
                temp1=temp1.getNext();
                temp2=temp2.getNext();
            }else{
                return false;
            }
        }
        return true;
    }
    public static LinkedList reverse(LinkedList value){
        // LinkedList reverse=new LinkedList();
        // int count=0;
        // Node temp=value.getFront();
        // for(int i =length(value)-1;i>=0;i--){
        //     temp=value.getFront();
        //     // System.out.println(i);
        //     while(count<i){
        //         temp=temp.getNext();
        //         // System.out.println(count);
        //         count++;
                
        //     }
        //     // System.out.println(temp.getData());
        //     reverse.append(temp);
        //     // System.out.println(i);
        //     count=0;
        // }
        // return reverse;

        // LinkedList reverse=new LinkedList();
        // Node temp=value.getFront();
        // for(int i =0;i<length(value)-1;i++){
        //     temp=value.getFront();
        //     for(int j=0;j<length(value)-i;j++){
        //         temp=temp.getNext();
        //     }
        //     System.out.println(i);
        //     reverse.append(temp);
        // }
        // return reverse;


    
        LinkedList reversedList = new LinkedList();
        Node current = value.getFront();
        while (current != null) {
        Node newNode = new Node(current.getData());
        newNode.setNext(reversedList.getFront());
        reversedList.setFront(newNode);
        current = current.getNext();
      }
      return reversedList;
    }

    

}