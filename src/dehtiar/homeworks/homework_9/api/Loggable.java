package dehtiar.homeworks.homework_9.api;

import dehtiar.homeworks.homework_9.exceptions.FileMaxSizeReachedException;
import java.io.IOException;

/**
 * @author Yaroslav Dehtiar on 10.12.2022
 */
public interface Loggable {

  public void debug(String message) throws FileMaxSizeReachedException, IOException;

  public void info(String message) throws FileMaxSizeReachedException, IOException;

}
