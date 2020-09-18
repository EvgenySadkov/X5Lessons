package Lesson6.Task1;

public class Main {
    public static void main(String[] args) {
        MyTypedCollectionsArray<String> myArrayCollection = new MyTypedCollectionsArray();

        myArrayCollection.add("1");
        myArrayCollection.add("2");
        myArrayCollection.add("3");
        myArrayCollection.add("4");
        myArrayCollection.print();
        System.out.println(myArrayCollection.get(2));
        System.out.println(myArrayCollection.size());
        myArrayCollection.clear();
        myArrayCollection.print();

        MyTypedCollectionsLinkedList<String> link = new MyTypedCollectionsLinkedList<>();
        link.add("111");
        link.add("222");
        link.add("333");
        link.add("444");
        link.print();
        System.out.println(link.size());
        link.remove(2);
        link.remove("111");
        link.print();
        System.out.println(link.get(1));
        link.clear();
        link.print();

    }
}
