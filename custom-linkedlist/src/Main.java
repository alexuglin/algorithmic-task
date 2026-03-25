import java.io.IOException;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Element element = new Element(10, 200L);
        CustomLinkedList customLinkedList = new CustomLinkedList(element);
        for (int i = 1; i < 10; i++) {
            customLinkedList.add(new Element(10 + i, 200L + i * 10));
        }
        System.out.println(customLinkedList.size());
        System.out.println(customLinkedList);
        CustomLinkedList customLinkedListClone = (CustomLinkedList) customLinkedList.clone();
        element.setIntValue(10000);
        System.out.println(customLinkedListClone);

        element.setIntValue(10);
        SerializableService serializableService = new SerializableService();
        try {
            byte[] bytes = serializableService.serialize(element);
            Element elementCopy = (Element) serializableService.deserialize(bytes);
            element.setIntValue(1000);
            System.out.println(elementCopy);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
