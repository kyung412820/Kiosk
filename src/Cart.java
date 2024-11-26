import java.util.*;

public class Cart {
    private List<CartItem> cartItems;

    public Cart() {
        cartItems = new ArrayList<>();
    }

    public void addItem(MenuItem item) {
        cartItems.add(new CartItem(item));
    }

    public void displayCart() {
        if (cartItems.isEmpty()) {
            System.out.println("장바구니가 비어 있습니다.");
            return;
        }

        System.out.println("[ Orders ]");
        cartItems.forEach(cartItem ->
                System.out.printf("%s | W %.1f | %s\n", cartItem.getMenuItem().getName(), cartItem.getMenuItem().getPrice(), cartItem.getMenuItem().getDescription())
        );
    }

    public double getTotalPrice(UserType userType) {
        return cartItems.stream()
                .mapToDouble(cartItem -> cartItem.getMenuItem().getPrice())
                .sum();
    }

    public void clear() {
        cartItems.clear();
    }

    public boolean isEmpty() {
        return cartItems.isEmpty();
    }

    public void removeItem(String itemName) {
        cartItems.removeIf(cartItem -> cartItem.getMenuItem().getName().equals(itemName));
    }
}
