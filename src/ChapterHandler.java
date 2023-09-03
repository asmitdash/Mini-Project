import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import java.io.IOException;
import java.io.OutputStream;

public class ChapterHandler implements HttpHandler {
    @Override
    public void handle(HttpExchange exchange) throws IOException {
        String response = readFile("web/chapters.html");
        sendResponse(exchange, response);
    }

    private void sendResponse(HttpExchange exchange, String response) throws IOException {
        OutputStream os = exchange.getResponseBody();
        os.write(response.getBytes());
        os.close();
    }

    private String readFile(String filePath) throws IOException {
        // Your code for reading the file and returning its content as a string
        // Make sure to handle exceptions appropriately here
        return "Your chapters.html content goes here.";
    }
}

