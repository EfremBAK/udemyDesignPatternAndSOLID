/**
 * This is our abstract "creator".
 * The abstract method createMessage() has to be implemented by
 * its subclasses.
 */
public abstract class MessageCreator {

    public Messages getMessage() {
        Messages msg = messageFactory();
        msg.addDefaultHeaders();
        msg.encrypt();
        return msg;
        //can add any functionailty likr encrypt or adding more methods
    }

    public abstract Messages messageFactory();

}
