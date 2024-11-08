package colllection.set;

import colllection.set.member.Member;

public class MyHashSetV2Main2 {

    public static void main(String[] args) {
        MyHashSetV2 set = new MyHashSetV2(10);
        Member hi = new Member("hi");
        Member jpa = new Member("JPA");
        Member java = new Member("java");
        Member spring = new Member("spring");

        System.out.println("hi.hashCode() = " + hi.hashCode());
        System.out.println("jpa.hashCode() = " + jpa.hashCode());
        System.out.println("java.hashCode() = " + java.hashCode());
        System.out.println("spring.hashCode() = " + spring.hashCode());

        set.add(hi);
        set.add(jpa);
        set.add(java);
        set.add(spring);
        System.out.println(set);

        // 검색
        Member searchValue = new Member("JPA");
        final var result = set.contains(searchValue);
        System.out.println("set.contains("+searchValue+") = " + result);

        // 삭제
        String removeValue = "SET";
        final var removeResult = set.remove(removeValue);
        System.out.println("set.remove("+removeValue+") = " + removeResult);
    }
}
