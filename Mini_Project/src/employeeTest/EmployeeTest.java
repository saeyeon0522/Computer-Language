package employeeTest;
import menus.Menu;
import menus.MainMenuEnum;
import menus.RegisterMenuEnum;
import menus.SearchMenuEnum;
import java.util.Scanner;
public class EmployeeTest {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            MainMenuEnum mm = menu.MainMenu(scanner);

            if (mm == MainMenuEnum.REGISTER) {
                System.out.println("Register");
                while (true) {
                    RegisterMenuEnum rm = menu.RegisterMenu(scanner);
                    if (rm == RegisterMenuEnum.FULLTIME)
                        System.out.println(">>> Fulltime Registration <<<");
                    else if (rm == RegisterMenuEnum.PARTTIME)
                        System.out.println(">>> Parttime Registration <<<");
                    else break;
                }
            } else if (mm == MainMenuEnum.SEARCH) {
                System.out.println("Search");
                while (true) {
                    SearchMenuEnum sm = menu.SearchMenu(scanner);
                    if (sm == SearchMenuEnum.FULLSEARCH)
                        System.out.println(">>> Full Search <<<");
                    else break;
                }
            } else if (mm == MainMenuEnum.EXIT) {
                System.out.print("Good BYE!");
                scanner.close();
                break;
            }
        }

        scanner.close();
    }
}
