import java.util.Collection;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Element element = new Element(10, 200L);
        Collection customLinkedList = new CustomLinkedList(element);
        for (int i = 1; i < 10; i++) {
            customLinkedList.add(new Element(100 + i, 200L + i * 10));
        }
        Iterator iterator = customLinkedList.iterator();
        while (iterator.hasNext()) {
            CustomLinkedList.Node node = (CustomLinkedList.Node) iterator.next();
            if (node != null) {
                System.out.println(node.getValue());
            }
        }
        int i = 0;
        iterator = customLinkedList.iterator();
        CustomLinkedList.Node node = null;
        while (iterator.hasNext() && i < 2) {
            node = (CustomLinkedList.Node) iterator.next();
            i++;
        }
        ;
        System.out.println("удаляем " + node.getValue());
        customLinkedList.remove(node);
        System.out.println(customLinkedList);
    }
}
