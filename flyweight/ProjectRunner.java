package flyweight;

import java.util.List;
import java.util.ArrayList;

public class ProjectRunner {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = new DeveloperFactory();

        List<Developer> developers = new ArrayList<>();

        developers.add(developerFactory.getDeveloperBySpecialty("java"));
        developers.add(developerFactory.getDeveloperBySpecialty("java"));
        developers.add(developerFactory.getDeveloperBySpecialty("java"));
        developers.add(developerFactory.getDeveloperBySpecialty("c"));
        developers.add(developerFactory.getDeveloperBySpecialty("c"));

        for (Developer developer: developers){
            developer.writeCode();
        }
    }
}
