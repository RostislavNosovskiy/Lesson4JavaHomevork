import java.util.LinkedList;
import java.util.ListIterator;

public class main1 {
//    Пусть дан LinkedList с несколькими элементами.
//    Реализуйте метод, который вернет “перевернутый” список. Постараться не обращаться к листу по индексам.
public static void main(String[] args) {
    LinkedList<String> list = new LinkedList<>();
    list.add("1");
    list.add("2");
    list.add("3");
    list.add("4");
    System.out.println(list);
    LinkedList<String> list1 = listRevers(list);
    System.out.println(list1);

}
static LinkedList<String> listRevers (LinkedList<String> list){
    LinkedList<String> res = new LinkedList<>();
    ListIterator<String> listIterator = list.listIterator(list.size());
    while (listIterator.hasPrevious()){
        res.add(listIterator.previous());
    }
   return res;
}

}
