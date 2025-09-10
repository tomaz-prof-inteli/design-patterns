package comportamental.chainOfResponsability;

public class _Main {
	public static void main(String[] args) {
        var compressor = new Compressor(null);
        var logger = new Logger(compressor);
        var authenticator = new Authenticator(logger);
        var server = new WebServer(authenticator);

        server.handle(new HttpRequest("---", "123"));
        server.handle(new HttpRequest("admin", "1234"));
	}
}
