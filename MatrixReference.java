
public class MatrixReference {

    public static void main(String[] args) throws Exception {
        System.out.println(Matrix.NEO);
        System.out.println(Matrix.TRINITY);
    }

    static class Matrix {
        public static User NEO = new User().initializeIdAndName(1, "Neo");
        public static User TRINITY = new User().initializeIdAndName(2, "Trinity");
    }

    public interface DBObject {
        DBObject initializeIdAndName(long id, String name);
    }
}

 class User implements MatrixReference.DBObject {
    long id;
    String name;
    public User initializeIdAndName(long id, String name)
    {
        this.id = id;
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return String.format("The user's name is %s, id = %d", name, id);
    }
}

