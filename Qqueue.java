import java.util.LinkedList;

public class Qqueue {
    LinkedList<String> list = new LinkedList<>();

    void enqueue(String el){
        list.add(el);
    }

    String dequeue(){
        String s = list.get(0);
        list.remove(0);
        return s;
    }
    String first(){
        return list.get(0);
    }

}
