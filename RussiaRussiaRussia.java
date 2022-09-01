

public class RussiaRussiaRussia {

    public static void main(String[] args) {
        RussianTranslator russianTranslator = new RussianTranslator();
        System.out.println(russianTranslator.translate());
    }

    public static abstract class Translator {
        public abstract String getLanguage();

        public String translate() {
            return "I translate from " + getLanguage();
        }
    }

    public static class RussianTranslator extends Translator {
        public  String getLanguage() {
            return "Russian";
        }

        public String translate() {
            return "I translate from " + getLanguage();
        }

    }
}
