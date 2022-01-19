import example.enumeration.EnumExample;
import example.enumeration.EnumExample.EnumMessage;

public class EnumerationMain {
    public static void main(String[] args) {

       EnumMessage.Builder builder = EnumMessage.newBuilder();

       builder.setId(6705)
               .setDaysOfWeek(EnumExample.DayofWeek.SATURDAY);

       EnumMessage message = builder.build();

       System.out.println(message);


    }
}
