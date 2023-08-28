package exception;



public class ProductNotFoundException extends RuntimeException {
    
    public ProductNotFoundException(Long id) {
        super("Did not find product with ID: " + id);
    }
}
