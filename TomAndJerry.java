
public class TomAndJerry {
    public static void main(String[] args) {

    }

    // Can move
    public interface CanMove {
        void move();
    }

    // Can be eaten
    public interface Edible {
        void beEaten();
    }

    // Can eat
    public interface CanEat {
        void eat();
    }

    public class Dog implements CanEat,CanMove{
        public void eat(){

        }
        public void move(){

        }
    }
    public class Cat implements CanEat,CanMove,Edible{
        public void eat(){

        }
        public void move(){

        }
        public void beEaten(){

        }
    }
    public class Mouse implements CanMove, Edible{
        public void move(){

        }
        public void beEaten(){

        }
    }
}
