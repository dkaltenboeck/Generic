package src;

/**
 * The main class to test the GenericList stack functionality.
 */
public class main {
    /**
     * The main method to test the stack operations.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        var elementList = new GenericList<String>(10); // Create a stack with capacity 10
        String answer = "";

        try {
            // Push elements onto the stack
            elementList.push("BMW");
            elementList.push("AUDI");
            elementList.push("VW");
            elementList.push("Mercedes");
            elementList.push("Porsche");
            elementList.push("Skoda");
            elementList.push("Tesla");
            elementList.push("BYD");
            elementList.push("Ferrari");

            // Show the last added element without removing it
            String s = elementList.peek();
            System.out.println("Top element (peek): " + s);

            // Show the last added element and remove it
            String u = elementList.pop();
            System.out.println("Pop element: " + u);
        } catch (StackFullException e) {
            System.out.print("ERR: " + e.getMessage() + "---> ");
        } catch (StackEmptyException e) {
            System.out.print("ERR: " + e.getMessage() + "---> ");
        }

        // Print out the list of all elements in the stack
        answer = elementList.list();
        System.out.print("List: " + answer);
    }
}
