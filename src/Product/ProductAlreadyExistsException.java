package Product;


public class ProductAlreadyExistsException extends Exception {

    public ProductAlreadyExistsException() {

    }

    protected ProductAlreadyExistsException(String message) {
        super(message);
    }
}