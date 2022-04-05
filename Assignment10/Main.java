package java_Assignment.Assignment10;

class Node{
    String data;
    Node next;
    Node(String data, Node next){
        this.data=data;
        this.next=next;
    }
    Node(String data){
        this(data, null);
    }
    public String toString() {
        if (data == null)
            return "null";
        return data;
    }
}
class SList{
    Node head = new Node(null);
    //two methods one is toString and other is listIterator
    public SListIterator iterateList(){
        return  new SListIterator(head);
    }
    public String toString(){
        if(head ==null){
            return "List is empty";
        }
        SListIterator iterator =this.iterateList();
        StringBuilder sb = new StringBuilder();
        while(iterator.hasNext()){
            sb.append(iterator.next()+(iterator.hasNext()? "," : ""));
        }
        return sb+"";//change string builder to string
    }
}
class SListIterator{
    Node temp;
    SListIterator(Node node){
        this.temp =node;
    }
    public Node next(){
        temp=temp.next;
        return temp;
    }
    public boolean hasNext(){
        if(temp.next !=null){
            return true;
        }
        return false;
    }
    public void insertNode(String data){
        temp.next= new Node(data,temp.next);
        temp=temp.next;
    }
    public void removeNode(){
        if(temp.next !=null)
            temp.next = temp.next.next;
    }
}
public class Main {
    public static void main(String[] args) {
        SList obj1 = new SList();
        SListIterator obj2 = obj1.iterateList();
        System.out.print(obj1);
        obj2.insertNode("99");
        obj2.insertNode("9");
        System.out.println(obj1);
        SListIterator obj3 = obj1.iterateList();
        obj3.removeNode();
        System.out.println(obj1);
    }
}