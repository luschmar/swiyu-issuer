package ch.admin.bit.swiyu.issuer.management.exception;

/**
 * Exception indicating that an error was made during the configuration phase of the service
 */
public class ConfigurationException extends RuntimeException {

    public ConfigurationException(String message) {
        super(message);
    }

    public ConfigurationException(String message, Throwable cause) {
        super(message, cause);
    }
}
