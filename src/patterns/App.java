package patterns;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public class App {

  public static void main(String[] args) {
    Person person = new Person.Builder()
        .uuid(UUID.randomUUID())
        .name("Alex")
        .username("alexPc")
        .email("alex@gmail.com")
        .password("as2di3fn33nr")
        .dateOfBirth(LocalDate.ofYearDay(1995, 42))
        .favouriteMovies(List.of("Homero", "Troy", "Stranding senses"))
        .build();
    System.out.println(person);
  }
}
