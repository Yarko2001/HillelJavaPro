package dehtiar.homeworks.homework_9;

import dehtiar.homeworks.homework_9.api.Loggable;
import dehtiar.homeworks.homework_9.resources.FileLogger;
import dehtiar.homeworks.homework_9.resources.FileLoggerConfiguration;
import dehtiar.homeworks.homework_9.resources.StdoutLogger;
import dehtiar.homeworks.homework_9.resources.StdoutLoggerConfiguration;

public class Main {

  public static void main(String[] args) {

    Loggable fileLogger = new FileLogger(new FileLoggerConfiguration());
    Loggable stdoutLogger = new StdoutLogger(new StdoutLoggerConfiguration());

    for (int i = 0; i < 30; i++) {

      stdoutLogger.info("Test Log!");
      stdoutLogger.debug("Test Debug!");

    }

  }

}
