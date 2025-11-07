package Tests;

/**
 * Full test suite to run all individual test classes. <br>
 * <br>
 * Utilizes the main methods of each test class to execute their tests sequentially. <br>
 */

public class FullTestsOutput {

    public static void main(String[] args) {
        SettingsTests.main(args);
        EquipTests.main(args);
        EntityTests.main(args);
    }
}
