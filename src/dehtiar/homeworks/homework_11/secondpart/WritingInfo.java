package dehtiar.homeworks.homework_11.secondpart;

import java.util.Objects;

public class WritingInfo {

  private final String name;
  private final String phone;

  public WritingInfo(String name, String phone) {
    this.name = name;
    this.phone = phone;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    WritingInfo writing = (WritingInfo) o;

    if (!Objects.equals(name, writing.name)) {
      return false;
    }
    return Objects.equals(phone, writing.phone);
  }

  @Override
  public int hashCode() {
    int result = name != null ? name.hashCode() : 0;
    result = 31 * result + (phone != null ? phone.hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "{" +
        "name='" + name + '\'' +
        ", phone='" + phone + '\'' +
        '}';
  }

  public String getName() {
    return name;
  }

}
