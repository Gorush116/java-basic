package access.ex;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private Item[] items = new Item[10];
    private int count;

    public void addItem(Item item) {
        if (count >= items.length) {
            System.out.println("장바구니에 최대 10개의 상품만 담을 수 있습니다.");
            return;
        }

        items[count] = item;
        count++;
    }

    public void displayItems() {
        for (int i = 0; i < count; i++) {
            System.out.println("상품명 : " + items[i].getProductName() + ", 가격 : " + items[i].getPrice() + ", 수량 : " + items[i].getQuantity());
        }
    }

}
