package src;

/**
 * Exception thrown when an attempt is made to push an element onto a full stack.
 */
public class StackFullException extends Exception {
    /**
     * Constructs a new StackFullException with the specified detail message.
     *
     * @param message The error message describing the exception.
     */
    public StackFullException(String message) {
        super(message);
    }
}
