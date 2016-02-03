package classroom;

/**
 *
 * @author ynahorna
 */
public class InsuffisientSpaceinClassroomException extends Exception {

    public InsuffisientSpaceinClassroomException(String message) {
        super(message);
    }

    public InsuffisientSpaceinClassroomException(String message, Throwable cause) {
        super(message, cause);
    }

    public InsuffisientSpaceinClassroomException(Throwable cause) {
        super(cause);
    }

}
