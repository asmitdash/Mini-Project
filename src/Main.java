import java.io.IOException;
import java.io.OutputStream;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import java.net.InetSocketAddress;

public class Main {
    public static void main(String[] args) throws IOException {
        int port = 8081; // Choose a port for your server
        HttpServer server = HttpServer.create(new InetSocketAddress(port), 0);

        // Map paths to handlers
        server.createContext("/", new HomeHandler());
        server.createContext("/subject", new SubjectHandler());
        server.createContext("/chapter", new ChapterHandler());
        server.createContext("/quiz", new QuizHandler());

        server.setExecutor(null); // Use the default executor
        server.start();

        System.out.println("Server started on port " + port);
    }
}



