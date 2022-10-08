package dehtiar.homeworks.homework_9.resources;

import dehtiar.homeworks.homework_9.api.Configurable;
import dehtiar.homeworks.homework_9.enums.LoggingLevel;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.Properties;

public class StdoutLoggerConfiguration implements Configurable {

  private LoggingLevel level;
  private String format;

  public StdoutLoggerConfiguration(LoggingLevel level, String format) {
    this.level = level;
    this.format = format;
  }

  public StdoutLoggerConfiguration() {
    load();
  }

  public void load() {
    try (InputStream is = Files.newInputStream(Paths.get("my_logger_config.properties"))) {
      Properties properties = new Properties();
      properties.load(is);

      level = levelConfig(properties.getProperty("logger.level"));
      format = properties.getProperty("logger.format");

    } catch (NoSuchFileException ex) {
      System.out.println("*File [my_logger_config.properties] is empty");
    } catch (IOException e) {
      e.printStackTrace();
    }
    new StdoutLoggerConfiguration(level, format);
  }

  private LoggingLevel levelConfig(String config) {

    switch (LoggingLevel.valueOf(config)) {
      case INFO:
        return LoggingLevel.INFO;
      case DEBUG:
        return LoggingLevel.DEBUG;
      default:
        return null;
    }

  }

  @Override
  public LoggingLevel getLevel() {
    return level;
  }

  @Override
  public String getFormat() {
    return format;
  }
}
