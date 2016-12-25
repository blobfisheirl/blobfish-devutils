package pe.blobfish.devutils;

// TODO provide some logging if required, everytime one of this methods is called
// TODO include some philosophy on this class and its usage
// TODO evaluate to create a method isDevMode(devModeNumber:int), like a generic one
// TODO include isUnitTestMode() when required, and do a best effort to detect a unit test environment, falling back to requiring a JVM arg
public final class Environment {

    /**
     * Looks for <code>Boolean.getBoolean("devmode")</code>, application are free to define more devmode<b>x</b> variables and use them during development time.
     *
     * @return
     */
    public static boolean isDevMode() {
        return is("devmode");
    }

    public static boolean isDemoMode() {
        return is("demomode");
    }

    public static boolean is(String mode) {
        return Boolean.getBoolean(mode);
    }

}
