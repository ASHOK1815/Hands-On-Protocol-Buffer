
import com.example.protobufexamplejava.Customer;
import com.example.protobufexamplejava.Date;
import com.example.protobufexamplejava.Money;
import com.google.protobuf.Timestamp;


import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class CustomerMain {

    protected static Timestamp toGoogleTimestampUTC(final LocalDateTime localDateTime) {
        return Timestamp.newBuilder()
                .setSeconds(localDateTime.toEpochSecond(ZoneOffset.UTC))
                .setNanos(localDateTime.getNano())
                .build();
    }




    public static void main(String[] args) {

        Timestamp createdUpdateAt = toGoogleTimestampUTC(LocalDateTime.now());


        Customer.Builder builder = Customer.newBuilder();
        builder.setName("ASHOK")
                .setBirthdate(Date.newBuilder().setDay(18).setMonth(8).setYear(1998))
                .setBalance(Money.newBuilder().setCurrencyCode("IIFC").setNanos(20).setUnits(2))
                .setCreatedAt(createdUpdateAt)
                ;


        Customer message =  builder.build();

        System.out.println(message);

    }
}
