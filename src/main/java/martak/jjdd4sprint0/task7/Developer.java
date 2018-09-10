package martak.jjdd4sprint0.task7;

public class Developer implements User {

    private final String role = "dev";

    @Override
    public void showInfo() {
        System.out.println(name + " - " + role);
    }
}
