import java.util.Queue;

public class main2 {
//    Реализуйте очередь с помощью LinkedList со следующими методами: enqueue() - помещает элемент в конец очереди,
//    dequeue() - возвращает первый элемент из очереди и удаляет его,
//    first() - возвращает первый элемент из очереди, не удаляя.
public static void main(String[] args) {
    Qqueue queue = new Qqueue();
    queue.enqueue("12");
    queue.enqueue("23");
    queue.enqueue("34");
    System.out.println(queue.first());
    System.out.println(queue.dequeue());
    System.out.println(queue.first());
    System.out.println(queue.dequeue());
    System.out.println(queue.first());
    queue.enqueue("Вот и всё");
    System.out.println(queue.dequeue());
    System.out.println(queue.first());



}
}
