import java.util.ArrayList;
import java.util.Date;

public class User {
  private Date birthday;
  private int size;
  private ArrayList<Photo> photos;
  private Address address;

  public User(Date birthday, int size, ArrayList<Photo> photos, Address address) {
    this.birthday = birthday;
    this.size = size;
    this.photos = photos;
    this.address = address;
  }
}