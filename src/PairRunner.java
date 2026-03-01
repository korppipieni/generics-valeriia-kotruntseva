public class PairRunner {
    public static void runStringIntegerExample(){
        System.out.println("Пример 1: Pair<String, Integer>");
        Pair<String, Integer> pair = new Pair<>("Возраст", 25);
        System.out.println("Создана пара: " + pair);
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
        pair.setSecond(30);
        System.out.println(pair.getSecond());
        System.out.println();
    }
    public static void runIntegerStringExample() {
        System.out.println("Пример 2: Pair<Integer, String>");
        Pair<Integer, String> pair = new Pair<>(1, "Один");
        System.out.println("Создана пара: " + pair);
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
        pair.setSecond("Единица");
        System.out.println(pair.getSecond());
        System.out.println();
    }
    public static void runIntegerDoubleExample() {
        System.out.println("Пример 3: Pair<Integer, Double>");
        Pair<Integer, Double> pair = new Pair<>(10, 3.14569);
        System.out.println("Создана пара: " + pair);
        System.out.println(pair.getFirst());
        System.out.println( pair.getSecond());
        pair.setSecond(52.0654);
        System.out.println(pair.getSecond());
        System.out.println();
    }
}
