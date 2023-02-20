package lessons.lesson3;

import java.util.Iterator;

public class Coffee {

    Iterator<Ingredient> iterator = new Iterator<Ingredient>() {
        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public Ingredient next() {
            return null;
        }
    };

}
