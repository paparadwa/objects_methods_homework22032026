import java.util.Arrays;
import java.util.Objects;
// класс заказа
public class Order {
    private String customer;
    private Product[] basket;

    public Order(String customer, Product[] basket) {
        this.customer = customer;
        this.basket = basket;
    }

    @Override
    public String toString() {
        return "Заказчик: " + this.customer + " | " + "Корзина: " + Arrays.toString(this.basket);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Order order = (Order) o;
        boolean arrAreSimilar = true;
        if (basket.length == order.basket.length) {
            for (int i = 0; i < basket.length; i++) {
                if (Objects.equals(basket[i], order.basket[i])) {
                    arrAreSimilar = true;
                } else {
                    arrAreSimilar = false;
                    break;
                }
            }
        } else {
            return false;
        }
        return customer.equals(order.customer) && arrAreSimilar;
    }
}
