package gbfsoslo.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ResourceUtil {
    private String propertyFileName;

    public ResourceUtil(String propertyFileName){
        this.propertyFileName = propertyFileName;
    }

    public String getPropertyFromPropertyFile(String property) {

        ClassLoader classLoader = getClass().getClassLoader();

        InputStream inputStream = classLoader.getResourceAsStream(this.propertyFileName);
        Properties prop = new Properties();
        try{
            prop.load(inputStream);
        }catch (IOException ioEx){
            return null;
        }

        return prop.getProperty(property);
    }

}
