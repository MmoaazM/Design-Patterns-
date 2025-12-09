package sciencetech.season25.designpatterns.p1.task1;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class ConfigManager {
    private static ConfigManager Manager; /// lazy singleton pattern

    private static final String CONFIG_FOLDER_PATH = Paths.get("src", "sciencetech", "season25", "designpatterns", "p1", "task1", "config").toFile().getAbsolutePath();
    private final Map<String, Map<String, Object>> configurations;

    private ConfigManager() {
        configurations = new HashMap<>();
    }

    public static ConfigManager getInstance() {
        if (Manager == null) {
            synchronized (ConfigManager.class) {
                if (Manager == null)
                    Manager = new ConfigManager();
            }
        }
        return Manager;
    }

    public Map<String, Object> getConfigurations(String className) {
        File file = new File(new StringBuilder(CONFIG_FOLDER_PATH)
                .append(File.separator)
                .append(className)
                .append(".properties")
                .toString());

        try (FileReader reader = new FileReader(file)) {
            Properties properties = new Properties();
            properties.load(reader);
            Map<String, Object> propertiesMap = new HashMap<>();
            for (String key : properties.stringPropertyNames())
                propertiesMap.put(key, properties.getProperty(key));

            configurations.put(className, propertiesMap);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return configurations.getOrDefault(className, new HashMap<>());
    }
}
