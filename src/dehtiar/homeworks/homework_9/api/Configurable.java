package dehtiar.homeworks.homework_9.api;

import dehtiar.homeworks.homework_9.enums.LoggingLevel;

public interface Configurable {

  LoggingLevel getLevel();

  String getFormat();

}
