package sciencetech.season25.designpatterns.p1.task1;

public class ProperitiesConfigManager extends ConfigManager{

    private static ProperitiesConfigManager Manager=null;

    private  ProperitiesConfigManager() {
        super(new properitiesFiles());
    }

    public static ProperitiesConfigManager getInstance() {
        if (Manager == null) {
            synchronized (ConfigManager.class) {
                if (Manager == null)
                    Manager = new ProperitiesConfigManager();
            }
        }
        return Manager;
    }
}
