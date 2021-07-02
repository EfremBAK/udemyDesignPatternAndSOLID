
/**
 * Provides implementation for creating Text messages
 */
public class TextMessageCreator extends MessageCreator {


    public Messages messageFactory() {
        return new TextMessage();
    }
}
