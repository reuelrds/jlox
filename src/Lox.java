import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Lox {

    static boolean hadError = false;

    private static void report(int line, String where, String message) {
        System.err.println("[line " + line + "] Error" + where + ": " + message);
        hadError = true;
    }

    static void error(int line, String message) {

        // The book has a very basic error reporting mechanism.
        // TODO: Find a better way to implement error reporting.

        report(line, "", message);
    }

    private static void run(String source) throws IOException {}

    private static void runFile(String filePath) throws IOException {

        // TODO: Find if there's any other way to efficiently handle reading
        // the source from a file alongside running the interpreter in
        // REPL mode.
        //
        // Because we currently read the file, decode it into a string,
        // and then the Scanner class reads the string again from the
        // start character by character.
        byte[] bytes = Files.readAllBytes(Paths.get(filePath));
        run(new String(bytes, Charset.defaultCharset()));
        
        if (hadError) System.exit(65);
    }

    private static void runPrompt() throws IOException {

        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader inputBufferedReader = new BufferedReader(inputStreamReader);

        // TODO: Similar to the comment in the runFile method, find a way to efficiently
        // handle reading the source code directly from the file alongside the
        // REPL mode.
        while (true) {
            System.out.print("lox> ");
            String line = inputBufferedReader.readLine();
            if (line == null)
                break;
            run(line);

            hadError = false;
        }
    }

    public static void main(String[] args) throws Exception {

        if (args.length > 1) {
            // Only one argument (the script name) is currently allowed
            // (supported?). If more than one argument is passed, exit with
            // error code 64 which is EX_USAGE as defined in sysexits.h
            //
            // TODO: Lox does not handle arguments to scripts (yet...?)
            System.out.println("Usage: lox [script_name]");
            System.exit(64);
        } else if (args.length == 1) {
            // Execute a Script
            runFile(args[0]);
        } else {
            // Run in REPL mode
            runPrompt();
        }
    }
}
