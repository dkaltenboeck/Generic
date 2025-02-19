package src;

/**
 * Exception thrown when an attempt is made to pop or peek an element from an empty stack.
 */
public class StackEmptyException extends Exception {
    /**
     * Constructs a new StackEmptyException with the specified detail message.
     *
     * @param message The error message describing the exception.
     */
    public StackEmptyException(String message) {
        super(message);
    }
}
