import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DatabaseRunner {
    public static void main(String[] args) {

        List<String> personData1 = new ArrayList<>();
        personData1.add("Ivan");
        List<String> carData1 = new ArrayList<>();
        carData1.add("Opel");

        List<String> personData2 = new ArrayList<>();
        personData1.add("Petr");
        List<String> carData2 = new ArrayList<>();
        carData1.add("BMW");

        List<String> personData3 = new ArrayList<>();
        personData1.add("Egor");
        List<String> carData3 = new ArrayList<>();
        carData1.add("Kia");

        Map<Integer, List<String>> personField1 = new HashMap<>();
        personField1.put(1, personData1);
        Map<Integer, List<String>> carField1 = new HashMap<>();
        personField1.put(1, personData1);

        Map<Integer, List<String>> personField2 = new HashMap<>();
        personField1.put(1, personData1);
        Map<Integer, List<String>> carField2 = new HashMap<>();
        personField1.put(1, personData1);

        Map<Integer, List<String>> personField3 = new HashMap<>();
        personField1.put(1, personData1);
        Map<Integer, List<String>> carField3 = new HashMap<>();
        personField1.put(1, personData1);

        Entity person1 = new Person(personData1, personField1);
        Entity car1 = new Car(carData1, carField1);

        Entity person2 = new Person(personData2, personField2);
        Entity car2 = new Car(carData2, carField2);

        Entity person3 = new Person(personData3, personField3);
        Entity car3 = new Car(carData3, carField3);
    }
}
