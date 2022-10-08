package dehtiar.homeworks.homework_9.resources;

import dehtiar.homeworks.homework_9.api.Loggable;
import dehtiar.homeworks.homework_9.enums.LoggingLevel;
import dehtiar.homeworks.homework_9.exceptions.FileIsMaxSizeReachedException;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileLogger implements Loggable {

  private long fileSize;
  private int loggerCounter;

  private final FileLoggerConfiguration config;

  public FileLogger(FileLoggerConfiguration config) {
    this.config = config;
  }


  private String getFileName() {
    String fileName = loggerCounter + " " + currentDate("d.M.y-HH:mm");
    return config.getFile().replace(".", fileName + ".");
  }

  private void createLoggerFile() {
    try {
      File loggerFile = new File(getFileName());
      if (loggerFile.createNewFile()) {
        System.out.println("LoggerFile created.");
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  private String loggerMessage(String level, String message) {
    String loggerFormat = config.getFormat();
    String date = currentDate("d.M.y-HH:mm:ss");

    return String.format(loggerFormat, date, level, message) + "\n";

  }

  private void writeToLogger(String level, String message) {
    fileSize += loggerMessage(level, message).length();
    if (fileSize >= config.getMaxSize()) {
      try {
        throw new FileIsMaxSizeReachedException(config.getMaxSize(), fileSize, config.getFile());
      } catch (FileIsMaxSizeReachedException e) {
        System.out.println("LoggerFile size is reached!\nCreate NEW LOGGER FILE!");
      }
      loggerCounter++;
      createLoggerFile();
      fileSize = 0;
    }
    try (Writer fileWriter = new FileWriter(getFileName(), true)) {
      fileWriter.write(loggerMessage(level, message));
      fileWriter.flush();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }


  private String currentDate(String pattern) {

    DateFormat dateFormat = new SimpleDateFormat(pattern);
    Date date = new Date();

    return dateFormat.format(date);
  }


  @Override
  public void debug(String message) {
    String levelName = LoggingLevel.DEBUG.name();
    if (config.getLevel() == LoggingLevel.DEBUG) {
      writeToLogger(levelName, message);
    }
  }

  @Override
  public void info(String message) {
    String levelName = LoggingLevel.INFO.name();
    writeToLogger(levelName, message);
  }

}
