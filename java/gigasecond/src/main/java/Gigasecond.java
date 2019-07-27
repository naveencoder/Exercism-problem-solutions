import java.time.LocalDate;
import java.time.LocalDateTime;

class Gigasecond {
   public static final Integer GIGASECOND=1000000000;
    private LocalDateTime moment;
    Gigasecond(LocalDate moment) {
          this(moment.atStartOfDay());
    }

    Gigasecond(LocalDateTime moment) {
           Gigasecond gigasecond=new Gigasecond(moment);
              }

    LocalDateTime getDateTime() {
            return moment.plusSeconds(GIGASECOND);
    }

}
