import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        LinkedListContainer<String> stringLinkedNames = new LinkedListContainer<>();
        stringLinkedNames.addLast("Nikita");
        stringLinkedNames.addFirst("Denis");
        stringLinkedNames.addLast("Vova");
        stringLinkedNames.addLast("Anna");
        System.out.println(stringLinkedNames.size());
        System.out.println("Первое имя в списке: " + stringLinkedNames.getElementByIndex(0));
        System.out.println("--------------- Итерируем с начала списка-----------");

        for (String item: stringLinkedNames) {
            System.out.println(item);
        }
        LinkedListContainer<Integer> integerLinkedGrades = new LinkedListContainer<>();
        integerLinkedGrades.addLast(9);
        integerLinkedGrades.addFirst(7);
        integerLinkedGrades.addLast(2);
        integerLinkedGrades.addLast(10);
        System.out.println("--------------- Итерируем с конца списка-----------");
        Iterator iterator = integerLinkedGrades.descendingIteratror();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        }
    }