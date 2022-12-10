package dehtiar.homeworks.homework_9;

import dehtiar.homeworks.homework_9.exceptions.FileMaxSizeReachedException;
import dehtiar.homeworks.homework_9.models.FileLogger;
import dehtiar.homeworks.homework_9.models.FileLoggerConfigurationLoader;
import java.io.IOException;

/**
 * @author Yaroslav Dehtiar on 10.12.2022
 */
public class Main {

  public static void main(String[] args) {
    FileLoggerConfigurationLoader flcl = new FileLoggerConfigurationLoader();
    FileLogger fl = new FileLogger(
        flcl.load("src\\dehtiar\\homeworks\\homework_9\\resources\\my_custom_configuration.properties"));

    try {
      fl.info("Hello.Testing text was written from info.");
      fl.debug("Hello.Testing text was written from debug.");
    } catch (IOException e) {
      throw new RuntimeException(e);
    } catch (FileMaxSizeReachedException e) {
      throw new RuntimeException(e);
    }
  }

}
