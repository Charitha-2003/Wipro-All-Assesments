import org.springframework.stereotype.Component;

@Component
public class CartValidatorImpl implements CartValidator {
    @Override
    public boolean validateCart(String cartId) {
        return cartId.startsWith("CART"); // Basic validation
    }
}