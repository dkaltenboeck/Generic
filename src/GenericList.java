package src;

/**
 * Generic stack implementation using an array.
 *
 * @param <T> The type of elements stored in the stack.
 */
public class GenericList<T> {
    private T[] elements; // Array to store stack elements
    private int currentEl; // Current number of elements in the stack
    private int overallEl; // Maximum capacity of the stack

    /**
     * Default constructor that initializes the stack with a default capacity of 10.
     */
    public GenericList() {
        this.overallEl = 10;
        this.currentEl = 0;
        this.elements = (T[]) new Object[overallEl]; // Initialize the array with size 10
    }

    /**
     * Constructor that initializes the stack with a specified capacity.
     *
     * @param size The maximum size of the stack.
     */
    public GenericList(int size) {
        this.overallEl = size;
        this.currentEl = 0;
        this.elements = (T[]) new Object[overallEl]; // Initialize the array with the given size
    }

    /**
     * Pushes an element onto the stack.
     *
     * @param element The element to be pushed onto the stack.
     * @throws StackFullException If the stack is already full.
     */
    public void push(T element) throws StackFullException {
        if (currentEl >= overallEl) {
            throw new StackFullException("Stack is full! Cannot push element.");
        }
        elements[currentEl] = element; // Insert at the correct position and increment rStack
        currentEl ++;
    }

    /**
     * Removes and returns the top element of the stack.
     *
     * @return The top element of the stack.
     * @throws StackEmptyException If the stack is empty.
     */
    public T pop() throws StackEmptyException {
        if (currentEl == 0) {
            throw new StackEmptyException("Stack is empty");
        }
        T topElement = (T) elements[currentEl - 1]; // Retrieve the last inserted element
        elements[currentEl - 1] = null; // Remove the element
        currentEl--; // Decrease the stack size
        return topElement; // Return the removed element
    }

    /**
     * Returns the top element of the stack without removing it.
     *
     * @return The top element of the stack.
     * @throws StackEmptyException If the stack is empty.
     */
    public T peek() throws StackEmptyException {
        if (currentEl == 0) {
            throw new StackEmptyException("Stack is empty");
        }
        return (T) elements[currentEl - 1]; // Retrieve the top element without removing it
    }

    /**
     * Returns a string representation of all elements in the stack, separated by "; ".
     *
     * @return A string containing all stack elements.
     */
    public String list() {
        String list = "";
        for (int zaehler = 0; zaehler < currentEl; zaehler++) {
            if (elements[zaehler] != null) {
                list = list + elements[zaehler] + "; ";
            }
        }
        return list;
    }
}
