package User;
import java.util.*;

public class User {
    private Long id;
    private String name;
    private String surname;
    private List<User> friends;

    public User(String name) { this.name = name; }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   @Override
    public int hashCode() {
        return Objects.hash(getName());
    }

    @Override
    public String toString() {
        return name;
    }
}
