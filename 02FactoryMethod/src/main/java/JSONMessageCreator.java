
/**
 * Provides implementation for creating JSON messages
 */
public class JSONMessageCreator extends MessageCreator {

    public Messages messageFactory() {
        return new JSONMessage();
    }
}
