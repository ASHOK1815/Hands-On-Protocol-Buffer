import example.simple.Simple.SimpleMessage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class SimpleMain {
    public static void main(String[] args) {
        System.out.println("Hello World");

        SimpleMessage.Builder builder = SimpleMessage.newBuilder();
        builder.setId(6735)
                .setIsSimple(false)
                .setName("Rohan")
                .addSampleList(10)
                .addSampleList(20);

        System.out.println(builder);

        SimpleMessage message =builder.build();
        System.out.println(message);

        try {

            FileOutputStream outputStream = new FileOutputStream("simple_message.bin");
            message.writeTo(outputStream);
            System.out.println("WRITING SUCCESSFULLY");
            outputStream.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        try {
            System.out.println("Reading file");
            FileInputStream inputStream = new FileInputStream("simple_message.bin");
            SimpleMessage message1 =SimpleMessage.parseFrom(inputStream);
            System.out.println(message1);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
