public class GetChild {

    public static void main(String[] args) {

    }

    public static abstract class Pet {
        public abstract String getName();

        public abstract Pet getChild();
    }

    public class Cat extends Pet {

        public String getName() {
            return this.getName();
        }

        public Pet getChild() {
            return this;
        }
    }

    public class Dog extends Pet {
        public String getName() {
            return this.getName();
        }

        public Pet getChild() {
            return this;
        }
    }
}
