package 实验二.ex3;

/**
 * Created by 36249 on 2016/10/21.
 */
public class DoublelyLinkList {


    private Node head;
    private Node last;
    private int length;
    public DoublelyLinkList(){

        head = new Node(null,null);
        last = head;
        length = 0;
    }
    public void insert(int position,Object object){

        Node temp = head;
        int i = 0;
        while(head != null && i < position){

            temp = temp.next;
        }
        if(head == null){
            return;
        }

        Node tempnext  = temp.next;  // * *
        temp.next = new Node(object,temp);
        temp.next.next = tempnext;
        if(tempnext != null){

            tempnext.front = temp.next;
        }
        length++;
    }
    public void insert(Object object){

        last.next = new Node(object,last);
        last = last.next;
        length ++;
    }

    public void delete(int position){

        if(position == 0)
            return;
        Node temp = head;
        int i = 0;
        while(temp!= null &&i < position-1){

            temp = temp.next;
            ++i;
        }
        if(temp == null || temp.next == null){
            return;
        }

        Node tempNext = temp.next;
        if(tempNext.next == null){

            last = temp;
        }
        temp.next = tempNext.next;
        if(tempNext.next != null){

            tempNext.next.front = temp;
        }

        tempNext = null;
        --length;
    }

    public void delete(Object object){

        Node temp = head;
        while(temp.next != null && !temp.next.value.equals( object)){

            temp = temp.next;
        }
        if(temp.next == null){
            return;
        }

        Node tempNext = temp.next;
        if(tempNext.next == null){

            last = temp;
        }
        temp.next = tempNext.next;
        if(tempNext.next != null){

            tempNext.next.front = temp;
        }
        tempNext = null;
        --length;
    }

    public int size(){
        return length;
    }
    public boolean isEmpty(){

        return head == last;
    }

    public void triverse(){

        Node temp = head.next;

        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public Object getData(int position){

        int i = 0;
        Node temp = head;
        while(temp != null && i < position){

            temp = temp.next;
            ++i;
        }
        if(temp == null){
            return null;
        }
        return temp.value;
    }





        private class Node{

        Object value;
        Node front;
        Node next;
        public Node(Object object,Node front){

            this.value = object;
            this.front = front;
            this.next = null;
        }


    }
}
