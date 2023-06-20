package patterns;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public class Person {

  private final UUID uuid;
  private final String name;
  private final String username;
  private final String email;
  private final String password;
  private final LocalDate dateOfBirth;
  private final List<String> favouriteMovies;

  public Person(UUID uuid, String name, String username, String email, String password, LocalDate dateOfBirth, List<String> favouriteMovies) {
    this.uuid = uuid;
    this.name = name;
    this.username = username;
    this.email = email;
    this.password = password;
    this.dateOfBirth = dateOfBirth;
    this.favouriteMovies = favouriteMovies;
  }

  public Person(Builder builder) {
    this.uuid = builder.uuid;
    this.name = builder.name;
    this.username = builder.username;
    this.email = builder.email;
    this.password = builder.password;
    this.dateOfBirth = builder.dateOfBirth;
    this. favouriteMovies = builder.favouriteMovies;
  }

  @Override
  public String toString() {
    return "Person{" +
        "uuid=" + uuid +
        ", name='" + name + '\'' +
        ", username='" + username + '\'' +
        ", email='" + email + '\'' +
        ", password='" + password + '\'' +
        ", dateOfBirth=" + dateOfBirth +
        ", favouriteMovies=" + favouriteMovies +
        '}';
  }

  public static class Builder {

    private UUID uuid;
    private String name;
    private String username;
    private String email;
    private String password;
    private LocalDate dateOfBirth;
    private List<String> favouriteMovies;

    public Builder uuid(UUID uuid) {
      this.uuid = uuid;
      return this;
    }

    public Builder name(String name) {
      this.name = name;
      return this;
    }

    public Builder username(String username) {
      this.username = username;
      return this;
    }

    public Builder email(String email) {
      this.email = email;
      return this;
    }

    public Builder password(String password) {
      this.password = password;
      return this;
    }

    public Builder dateOfBirth(LocalDate dateOfBirth) {
      this.dateOfBirth = dateOfBirth;
      return this;
    }

    public Builder favouriteMovies(List<String> favouriteMovies) {
      this.favouriteMovies = favouriteMovies;
      return this;
    }

    public Person build() {
      return new Person(this);
    }
  }
}
