package colllection.set;

public class MyHashSetV1Main {

    public static void main(String[] args) {
        MyHashSetV1 set = new MyHashSetV1(10);
        set.add(1);
        set.add(2);
        set.add(5);
        set.add(8);
        set.add(14);
        set.add(99);
        set.add(9);

        System.out.println("set = " + set);

        // 검색
        int searchValue = 9;
        final var result = set.contains(searchValue);
        System.out.println("set.contains("+searchValue+") = " + result);

        // 삭제
        int removeValue = 9;
        final var removeResult = set.remove(removeValue);
        System.out.println("set.remove("+removeValue+") = " + removeResult);
    }
}
