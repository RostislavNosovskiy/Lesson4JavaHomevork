import java.util.LinkedList;
import java.util.ListIterator;

public class main3 {
//    Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. Используйте итератор
public static void main(String[] args) {
    LinkedList<Integer> list = new LinkedList<>();
    list.add(12);
    list.add(17);
    list.add(9);
    list.add(54);
    list.add(34);
    ListIterator<Integer> listIterator = list.listIterator(0);
    Integer sum = 0;
    while (listIterator.hasNext()){
        sum += listIterator.next();
    }
    System.out.println(sum);
}
}
