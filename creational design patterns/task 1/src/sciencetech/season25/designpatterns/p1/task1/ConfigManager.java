package sciencetech.season25.designpatterns.p1.task1;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public abstract class ConfigManager {
    private IfileConfiguration config;

    private final Map<String, Map<String, Object>> configurations;

    protected ConfigManager(IfileConfiguration config) {
        this.config=config;
        configurations = new HashMap<>();
    }

    public Map<String, Object> getConfigurations(String className) {

        Map<String, Object> FileConfiguration = new HashMap<>();

        FileConfiguration= config.getConfigurationsFromFile(config.CreatePath(className));

        configurations.put(className, FileConfiguration);

        return configurations.getOrDefault(className, new HashMap<>());
    }
}
