public class App {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.err.println("Usage: <program> <command> [args...]");
            System.exit(1);
        }

        String command = args[0];

        switch (command) {
            case "parse":
                if (args.length < 2) {
                    System.err.println("Usage: parse <folder>");
                    System.exit(1);
                }
                ParseCommand.run(args[1]);
                break;
            default:
                System.err.println("Unknown command: " + command);
                System.exit(1);
        }
    }
}
