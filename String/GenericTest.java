import java.util.*;

class GenericTest{

    public static <T,K,V> void printItem(T item){
        System.out.println("Item: " + item);
    }

    public static <T> void printList(List<T> list){
        System.out.println("List: " + list);
    }

    public static void printWithGenericWildcard(List<?> list){
        System.out.println("List:: " + list);
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,5,1,3);
        printList(list);
        printWithGenericWildcard(list);
        printItem("HELLO WORLD");
    }
}