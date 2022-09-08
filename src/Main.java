public class Main {
    public static void main(String[] args) {
        MagicBox<String> magicBox1 = new MagicBox<>(5);
        MagicBox<Integer> magicBox2 = new MagicBox<>(5);
        MagicBox<Double> magicBox3 = new MagicBox<>(5);

        System.out.println(magicBox1.add("Шкаф"));
        System.out.println(magicBox1.add("Стакан"));
        System.out.println(magicBox1.add("Чай"));
        System.out.println(magicBox1.add("Автомобиль"));
        System.out.println(magicBox1.add("Собака"));
        System.out.println(magicBox1.add("Кошка"));
        for (int i = 0; i < 10; i++) {
            System.out.println(magicBox1.pick());
        }
        System.out.println();

        magicBox2.add(100);
        magicBox2.add(200);
        magicBox2.add(300);
        magicBox2.add(400);
        magicBox2.add(500);
        for (int i = 0; i < 10; i++) {
            System.out.println(magicBox2.pick());
        }
        System.out.println();

        magicBox3.add(10000D);
        magicBox3.add(20000D);
        magicBox3.pick();
    }
}