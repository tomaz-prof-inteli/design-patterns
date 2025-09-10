package estrutural.facade;

public class _Main {

	public static void main(String[] args) {
	    NotificationService notificationService = new NotificationService();
	    notificationService.send("Hello world", "user");
	}

}
