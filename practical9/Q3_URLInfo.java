import java.net.URL;

public class Q3_URLInfo {
    public static void main(String[] args) throws Exception {
        // create a URL object
        URL u = new URL("https://www.example.com:8080/docs/index.html?id=5#top");

        // print information using URL methods
        System.out.println("Protocol : " + u.getProtocol());
        System.out.println("Host     : " + u.getHost());
        System.out.println("Port     : " + u.getPort());
        System.out.println("Path     : " + u.getPath());
        System.out.println("File     : " + u.getFile());
        System.out.println("Query    : " + u.getQuery());
        System.out.println("Ref      : " + u.getRef());
    }
}
