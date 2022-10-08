package dehtiar.homeworks.homework_9.resources;

import dehtiar.homeworks.homework_9.api.Configurable;
import dehtiar.homeworks.homework_9.enums.LoggingLevel;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.Properties;

public class FileLoggerConfiguration implements Configurable {

  private String file;
  private LoggingLevel level;
  private long maxSize;
  private String format;

  public FileLoggerConfiguration(String file, LoggingLevel level, long maxSize, String format) {
    this.file = file;
    this.level = level;
    this.maxSize = maxSize;
    this.format = format;
  }

  public FileLoggerConfiguration() {
    load();
  }

  public void load() {
    try (InputStream input = Files.newInputStream(
        Paths.get("resources/loggerConfig.properties"))) {
      Properties prop = new Properties();
      prop.load(input);

      file = prop.getProperty("logger.file");
      level = levelConfig(prop.getProperty("logger.level"));
      maxSize = Long.parseLong(prop.getProperty("logger.max_size"));
      format = prop.getProperty("logger.format");

    } catch (NoSuchFileException ex) {
      System.out.println("*File [loggerConfig.properties] is empty");
    } catch (IOException ex) {
      ex.printStackTrace();
    }

    new FileLoggerConfiguration(file, level, maxSize, format);
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

  public String getFile() {
    return file;
  }

  public long getMaxSize() {
    return maxSize;
  }
}
