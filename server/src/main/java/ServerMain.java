public class ServerMain {

    private static ServerConnection connection = new ServerConnection();
    private static String[] arguments;

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Please specify the port as program argument.");
            return;
        }
        arguments = args;
        System.out.println("Hello World!");
        System.out.println("Port: " + args[0]);

        int port;
        try {
            port = Integer.parseInt(args[0]);
        } catch (NumberFormatException nfe) {
            System.out.println("Port provided was not valid. Message: " + nfe.getMessage());
            return;
        }

        connection.connect(port);
    }

}
