class Node{
    int data;
    Node next;
}

class LinkedList{
    Node head;

    public void insert(int data){
        Node node = new Node();
        node.data = data;
        node.next = null;
        if(head==null){
            head = node;
        }else{
            Node n = head;
            while(n.next!=null){
                n=n.next;
            }
            n.next = node;
        }
    }

    public void insertAt(int index,int data){
        Node node = head;
        Node indexNode = node;
        int ind = 0;
        while(ind<=index){
            System.out.println("index"+ind);
            indexNode = node;
            node = node.next;
            ind++;
        }
        System.out.println("data iat "+indexNode.data);
        Node tempNode = indexNode;
        Node tempNodeData = new Node();
        tempNodeData.data = data;
        if(tempNode.next!=null){
            tempNodeData.next = tempNode.next;
        }else{
            tempNodeData.next = null;
        }
        tempNode.next = tempNodeData;
    }

    public void show(){
        Node n = head;
        while(n.next!=null){
            System.out.println("data "+n.data);
            n=n.next;
        }
        System.out.println("data "+n.data);
    }
}

public class Main{   
    public static void main(String[] args) {
        LinkedList linkListObj = new LinkedList();
        linkListObj.insert(1);
        linkListObj.insert(2);
        linkListObj.show();
        System.out.println("test");
        linkListObj.insertAt(1, 3);
        linkListObj.show();
    }
}