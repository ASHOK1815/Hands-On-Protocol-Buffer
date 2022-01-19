import example.complex.Complex;
import example.complex.Complex.DummyMessage;

public class ComplexMain {
    public static void main(String[] args) {

        DummyMessage oneDummy= newDummyMessage(123,"wow");
        Complex.ComplexMessage.Builder builder = Complex.ComplexMessage.newBuilder();

        builder.setOneDummy(oneDummy);
        System.out.println(builder.toString());



    }


    public static DummyMessage newDummyMessage(Integer Id,String name)
    {
       DummyMessage.Builder builder = DummyMessage.newBuilder();
       builder.setId(Id)
               .setName(name);

       DummyMessage message =builder.build();

       return message;

    }
}
