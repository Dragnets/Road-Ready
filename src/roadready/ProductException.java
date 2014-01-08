package roadready;

/**
 *
 * @author Raitis Kupce
 * Throws exception if product data is invalid
 */
public class ProductException extends Exception {
    
    public ProductException(String msg){
        super(msg);
    }
}
