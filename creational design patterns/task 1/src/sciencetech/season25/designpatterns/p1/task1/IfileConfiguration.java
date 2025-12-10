package sciencetech.season25.designpatterns.p1.task1;

import java.io.File;
import java.nio.file.Paths;
import java.util.Map;

public interface IfileConfiguration {

    String CONFIG_FOLDER_PATH = Paths.get("src", "sciencetech",
              "season25", "designpatterns",
              "p1", "task1", "config").toFile().getAbsolutePath();

    File CreatePath(String className);

    Map<String, Object>getConfigurationsFromFile(File file);
}
