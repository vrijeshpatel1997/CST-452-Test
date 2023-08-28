package exception;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ProductNotFoundExceptionTest {

    @Test
    public void testProductNotFoundExceptionMessage() {
        Long productId = 1L;
        ProductNotFoundException exception = new ProductNotFoundException(productId);

        String expectedMessage = "Did not find product with ID: " + productId;
        String actualMessage = exception.getMessage();

        assertEquals(expectedMessage, actualMessage);
    }
}
