import org.springframework.stereotype.Service;

@Service
public class InventoryServiceImpl implements InventoryService {
    @Override
    public boolean isAvailable(String itemId) {
        return !itemId.equals("OUT_OF_STOCK"); // Simple check for demo
    }
}