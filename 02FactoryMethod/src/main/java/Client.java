
public class Client {

	public static void main(String[] args) {
		printMessage(new JSONMessageCreator());
		printMessage(new TextMessageCreator());
	}
	
	public static void printMessage(MessageCreator creator) {
		Messages msg = creator.getMessage();
		System.out.println(msg);
	}
}
