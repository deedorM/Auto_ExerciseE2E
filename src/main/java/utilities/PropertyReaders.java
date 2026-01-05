package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyReaders {
    File file = new File("src/main/resources/configuration.properties");
    FileInputStream fs = new FileInputStream(file);
    public Properties property;

    public PropertyReaders() throws IOException {
        property = new Properties();
        property.load(fs);
    }
    public String getSwagLab_Url(){
        return property.getProperty("SwagLab_Url");
    }

    public String getMortgageCal_Url(){
        return property.getProperty("MortgageCal_Url");
    }

    public String getAutoExercise_Url(){
        return property.getProperty("AutoExercise_Url");
    }

    public String getFirstName(){
        return property.getProperty("Rebecca");
    }

    public String getLastName(){
        return property.getProperty("Rain");
    }
}