package martak.jjdd4sprint0.task7;

public class Admin implements User {

    private final String role = "admin";

    @Override
    public void showInfo() {
        System.out.println(name + " - " + role);
    }
}
