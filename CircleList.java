package Sofa;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class CircleList {
    private Participant head;
    private Participant tail;
    public int count = 0;

    CircleList(String fileName) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader(fileName));
        String line = in.readLine();

        while (line != null){
            StringTokenizer st = new StringTokenizer(line);
            Participant p = new Participant(st.nextToken(),st.nextToken());
            insert(p);
            line = in.readLine();
        }
    }

    public Participant getHead() {
        return head;
    }
    public void setHead(Participant head) {
        this.head = head;
    }
    public Participant getTail() {
        return tail;
    }
    public void setTail(Participant tail) {
        this.tail = tail;
    }

    public void show() throws Exception {
        Participant node = head;
        if(isEmpty()){
            throw new Exception("Null list");
        }
        while(node.getNext() != head ){
            System.out.println(node.getName()+" "+node.getGender());
            node = node.getNext();
        }
        System.out.println(tail.getName() +" "+ tail.getGender());
    }

    public void insert(Participant p){
        if (head == null) {
            head = p;
            tail = p;
            tail.setNext(head);
        }
        else
        {
            p.setNext(head);
            tail.setNext(p);
            tail = p;
        }
        count++;
    }

    public void delete(String name) throws Exception {
        Participant previous = null;
        Participant current = head;
        int count = this.count;
        while (count == this.count)
        {
            if (current.getName().equals(name))
            {
                if (previous != null)
                {
                    previous.setNext(current.getNext());

                    // Если в конце, то меняем _tail.
                    if (current.getNext() == head) {
                        tail = previous;
                        previous.setNext(head);
                    }
                }
                else
                {
                    if (this.count == 1) {
                        head = null;
                        tail = null;
                    }
                    else {
                        head = head.getNext();
                        tail.setNext(head);
                    }
                }
                this.count--;
            }
            previous = current;
            current = current.getNext();
            if (previous == tail) {
                throw new Exception("no name");
            }
        }
    }

    public void sort(String name) throws Exception {
        if(isEmpty()){
            throw new Exception("Null list");
        }
        Participant node = head;
        Participant lastNode = tail;

    }
    //  public Participant last(int k){}
    // public CircleList [] gender(){}
    private boolean isEmpty(){
        return count == 0;
    }
}
