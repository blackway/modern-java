package modernjavainaction.chap01;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;


public class FilteringApples2 {
    public static void main(String...args) {
        List<Apple> inventory = Arrays.asList(
                new Apple(80, "green"),
                new Apple(80, "green"),
                new Apple(80, "green")
        );

        List<Apple> greenApples = filterApples(inventory, FilteringApples2::isGreenApple);
    }

    private static List<Apple> filterApples(List<Apple> inventory, Predicate<Apple> p) {
        return null;
    }

    public static boolean isGreenApple(Apple apple) {

        return Boolean.TRUE;
    }
    public static class Apple {

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        private int weight = 0;

        @SuppressWarnings("boxing")
        @Override
        public String toString() {
            return "Apple{" +
                    "weight=" + weight +
                    ", color='" + color + '\'' +
                    '}';
        }

        private String color = "";

        public Apple(int weight, String color) {
            this.weight = weight;
            this.color = color;
        }
    }
}
