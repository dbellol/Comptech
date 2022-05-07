import java.io.*;
import java.util.*;

class Node <T extends Comparable<T>>{
    T data;
    Node next;
    Node (T d){
        data = d;
        next = null;
    }

}

class Main <T extends Comparable<T>>{
    public Node add(Node head,T data, int position){
    Node start = head;
    Node copia = head;
    for(int i=0;i<position;i++){
        start = start.next;
    }
    copia =start.next;
    start.next= null;
    start = insertBack(start,data);
    start.next = copia;

    return start;
    }



    public int getSize(Node head){
        int tamano = 0;
        Node start = head;
        while(start != null){
            tamano++;
            start = start.next;
        }


        return tamano;
    }


    public Node makeEmpty(Node head){
        return head = null;
    }
    public boolean isEmpty(Node head){
        if(head==null){
            return true;
        }
        return false;
    }

    public Node insertTop (Node head,T data){
        Node start = new Node(data);
        start.next = head;
        return start;
    }
    public Node insertBack(Node head, T data){
        if(head==null){
            return new Node(data);
        }
        else if(head.next==null){
            head.next = new Node(data);
        }
        else{
            insertBack(head.next,data);
        }
        return head;

    }
    public static void display(Node head){
        Node start = head;
        while(start != null){
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public void main(String[] args) {
        //insert data
    }
}
