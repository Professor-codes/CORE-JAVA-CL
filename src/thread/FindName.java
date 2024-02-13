package thread;

public class FindName {
    public static void main(String[] args) {
        System.out.println("start...\n");

        // DEFAULT THREAD NAME
        Thread name = Thread.currentThread();
        System.out.println("Thread name : " + "{ " + name.getName() + " }");

        // GET ID
        System.out.println("Thread id : " + "{ " + name.getId() + " }");
        // SET NAME
        name.setName("new Main");
        // GET NAME
        System.out.println("Thread name : " + "{ " + name.getName() + " }");

        System.out.println("\nend...");
    }
}
