
public class ButtonInterface {

    public static void main(String[] args) throws Exception {
        System.out.println(SimpleObject.NAME);
        System.out.println(Button.NAME);
    }

    interface SimpleObject {
        String NAME = "SimpleObject";

        void onPress();
    }

    interface Button extends SimpleObject {

        final String NAME = "Submit";

        //public void onPress();

        //protected void onPress();

        //void onPress();

        //private void onPress();

        public String onPress(Object o);

        //String onPress(Object o);

    }
}
