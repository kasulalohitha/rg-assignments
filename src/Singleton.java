public class Singleton {

    // Private static instance variable initialized during class loading
    private static final Singleton INSTANCE = new Singleton();

    // Private constructor to prevent instantiation outside this class
    private Singleton() {

    }

    // Static method to get the singleton instance
    public static Singleton getInstance() {
        return INSTANCE;
    }

    // Example method of the singleton instance
    public void sampleFunction() {
        System.out.println("Singleton instance is called...");
    }

    // Example main method to demonstrate usage
    public static void main(String[] args) {
        Singleton singletonInstance = Singleton.getInstance();

        // Using the singleton instance
        singletonInstance.sampleFunction();
    }
}
