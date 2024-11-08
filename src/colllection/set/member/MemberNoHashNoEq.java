package colllection.set.member;

import java.util.Objects;

public class MemberNoHashNoEq {

    String id;

    public MemberNoHashNoEq(final String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "MemberNoHashNoEq{" +
            "id='" + id + '\'' +
            '}';
    }
}
