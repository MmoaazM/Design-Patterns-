package sciencetech.season25.designpatterns.p1.task1;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class properitiesFiles implements IfileConfiguration{

    @Override
    public File CreatePath(String className) {
        return new File(new StringBuilder(CONFIG_FOLDER_PATH)
                .append(File.separator)
                .append(className)
                .append(".properties")
                .toString());
    }

    @Override
    public Map<String, Object> getConfigurationsFromFile(File file) {

        Map<String, Object> propertiesMap = null;

        try (FileReader reader = new FileReader(file)) {
            Properties properties = new Properties();
            properties.load(reader);
            propertiesMap = new HashMap<>();
            for (String key : properties.stringPropertyNames())
                propertiesMap.put(key, properties.getProperty(key));

        } catch (IOException e) {
            e.printStackTrace();
        }

        return propertiesMap;

    }
}
