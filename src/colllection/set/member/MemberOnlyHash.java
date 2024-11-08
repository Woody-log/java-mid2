package colllection.set.member;

import java.util.Objects;

public class MemberOnlyHash {

    String id;

    public MemberOnlyHash(final String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "MemberOnlyHash{" +
            "id='" + id + '\'' +
            '}';
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
