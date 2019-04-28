public class ServerMain {

    private static String[] arguments;

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Please specify the port as program argument.");
            return;
        }
        arguments = args;
        System.out.println("Hello World!");
        System.out.println("Port: " + args[0]);
    }

}
