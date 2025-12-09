# Configuration Management Refactoring Task

This task challenges you to refactor a basic configuration management system to improve its design, making it more robust and scalable.

### Summary of the `ConfigManager` Flow

The `ConfigManager` should be designed to:
1.  Scan a specified `sciencetech.season25.designpatterns.p1.task1.config` directory when the application starts
2.  Load all `.properties` files found within that directory
3.  Parse the key-value pairs from each file
4.  Store these configurations in a `Map`, using the filename (without the extension) as the key to access the settings for a specific class

## Your Task

Refactor the existing code to implement a more extensible configuration management system
Apply appropriate design patterns to solve the challenges of ensuring a single instance and ready to add new sciencetech.season25.designpatterns.p1.task1.config file formats


## Note
Ensure the the `CONFIG_FOLDER_PATH` is set to the correct location of the `sciencetech.season25.designpatterns.p1.task1.config` directory

### Refactoring this code done by using only one instance of ConfigManager to get properties of both database and server using this instance, so we can extend this configuration in the future by using this instance only 