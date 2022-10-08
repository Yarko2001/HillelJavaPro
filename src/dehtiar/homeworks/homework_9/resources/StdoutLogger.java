package dehtiar.homeworks.homework_9.resources;

import dehtiar.homeworks.homework_9.api.Configurable;
import dehtiar.homeworks.homework_9.api.Loggable;
import dehtiar.homeworks.homework_9.enums.LoggingLevel;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StdoutLogger implements Loggable {

  private final Configurable config;

  public StdoutLogger(Configurable config) {
    this.config = config;
  }

  private String loggerMessage(String level, String message) {

    String logFormat = config.getFormat();
    String date = currentDate();
    return String.format(logFormat, date, level, message);

  }

  @Override
  public void debug(String message) {

    String levelName = LoggingLevel.DEBUG.name();
    if (config.getLevel() == LoggingLevel.DEBUG) {
      System.out.print(loggerMessage(levelName, message));
    }

  }

  @Override
  public void info(String message) {

    String levelName = LoggingLevel.INFO.name();
    System.out.print(loggerMessage(levelName, message));

  }

  private String currentDate() {

    DateFormat dateFormat = new SimpleDateFormat("d.M.y-HH:mm:ss");
    Date date = new Date();
    return dateFormat.format(date);

  }

}
