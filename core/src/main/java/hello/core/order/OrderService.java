package hello.core.order;

public interface OrderService {
    Order createrOrder(Long memberId, String itemName, int itemPrice);
}
