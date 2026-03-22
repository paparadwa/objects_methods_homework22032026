public class Main {
    public static void main(String[] args) {
        Product iPhone1 = new Product(123, "iPhone 17", 80_000, "Смартфон");
        Product iPhone2 = new Product(123, "iPhone 17", 75_000, "Смартфон");
        Product iPhone3 = new Product(124, "iPhone 17", 80_000, "Смартфон");
        Product iPhone4 = new Product(123, "iPhone 17", 90_000, "Телефон");
        System.out.println(iPhone1.toString());
        System.out.println(iPhone2.toString());
        System.out.println(iPhone3.toString());
        System.out.println(iPhone4.toString());
        System.out.println("iPhone1.equals(iPhone2) = " + iPhone1.equals(iPhone2));
        System.out.println("iPhone1.equals(iPhone3) = " + iPhone1.equals(iPhone3));
        System.out.println("iPhone1.equals(iPhone4) = " + iPhone1.equals(iPhone4));
        Order order1 = new Order("Иванов Иван", new Product[]{iPhone1, iPhone2});
        System.out.println(order1.toString());
        Order order2 = new Order("Иванов Иван", new Product[]{iPhone1, iPhone2});
        Order order3 = new Order("Петров Иван", new Product[]{iPhone1, iPhone2});
        Order order4 = new Order("Иванов Иван", new Product[]{iPhone1});
        Order order5 = new Order("Иванов Иван", new Product[]{iPhone3, iPhone1});
        Order order6 = new Order("Иванов Иван", new Product[]{iPhone1, iPhone3});
        Order order7 = new Order("Иванов Виктор", new Product[]{iPhone1, iPhone3});
        System.out.println(order2.toString());
        System.out.println(order3.toString());
        System.out.println(order4.toString());
        System.out.println(order5.toString());
        System.out.println(order6.toString());
        System.out.println(order7.toString());
        System.out.println("order1.equals(order2) = " + order1.equals(order2));
        System.out.println("order1.equals(order3) = " + order1.equals(order3));
        System.out.println("order1.equals(order4) = " + order1.equals(order4));
        System.out.println("order5.equals(order6) = " + order5.equals(order6));
        System.out.println("order7.equals(order6) = " + order7.equals(order6));
    }
}