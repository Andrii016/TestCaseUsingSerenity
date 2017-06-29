package andreii.configuration;

import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.util.SystemEnvironmentVariables;


//@PropertyFile("config.properties")
public class Properties {

    private static Properties instance = new Properties ();

    private Properties () {
        EnvironmentVariables variables = SystemEnvironmentVariables.createEnvironmentVariables ();
        userPhone = variables.getProperty ("user.phone");
        userPassword = variables.getProperty ("user.password");
        userPost = variables.getProperty ("user.post");
    }

    public String userPhone;
    public String userPassword;
    public String userPost;

    public static Properties getInstance () {
        return instance;
    }
}
