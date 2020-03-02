package gbfsoslo.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ResourceUtil {
    private String propertyFileName;

    public ResourceUtil(String propertyFileName){
        this.propertyFileName = propertyFileName;
    }

    public String getPropertyFromPropertyFile(String property) throws IOException {

        ClassLoader classLoader = getClass().getClassLoader();

        InputStream inputStream = classLoader.getResourceAsStream(this.propertyFileName);
        Properties prop = new Properties();
        prop.load(inputStream);
        return prop.getProperty(property);
    }

}
