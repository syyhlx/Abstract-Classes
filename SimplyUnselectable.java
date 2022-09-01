
public class SimplyUnselectable {

    public static void main(String[] args) throws Exception {
    }

    public class Screen implements Selectable,Updatable{

       public void onSelect(){

        }
        public void refresh(){

        }

    }
    interface Selectable {
        void onSelect();
    }

    interface Updatable {
        void refresh();
    }
}
