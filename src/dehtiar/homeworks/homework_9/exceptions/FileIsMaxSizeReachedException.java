package dehtiar.homeworks.homework_9.exceptions;

import java.io.IOException;

public class FileIsMaxSizeReachedException extends IOException {

  public FileIsMaxSizeReachedException(long maxSize, long fileSize, String filePath) {
    super(
        "File Size [" + fileSize + " byte] is Reached Max Size [" + maxSize + " byte]\nFile Path ["
            + filePath + "]");
  }

}
