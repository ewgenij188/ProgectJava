package utilities;
import com.github.javafaker.*;

public class TestDataGenerator {
    private static Faker faker = new Faker();

    public static String getFirstName(){
        return faker.name().firstName();
    }
    
}
