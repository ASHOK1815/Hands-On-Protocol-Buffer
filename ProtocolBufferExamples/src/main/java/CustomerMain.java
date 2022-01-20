
import com.example.protobufexamplejava.Customer;
import com.example.protobufexamplejava.Date;
import com.example.protobufexamplejava.Money;

public class CustomerMain {


    public static void main(String[] args) {

        Customer.Builder builder = Customer.newBuilder();
        builder.setName("ASHOK")
                .setBirthdate(Date.newBuilder().setDay(18).setMonth(8).setYear(1998))
                .setBalance(Money.newBuilder().setCurrencyCode("IIFC").setNanos(20).setUnits(2));


        Customer message =  builder.build();

        System.out.println(message);

    }
}
