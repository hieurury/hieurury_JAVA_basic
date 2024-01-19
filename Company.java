import java.util.Scanner;
import java.util.ArrayList;


 class Data {
    private String mail;
    private int age;
    private String address;
    private String gender;
    private String office;

    Scanner createData = new Scanner(System.in);

    void setData() {
        System.out.print("email: ");
        this.mail = createData.nextLine();
        System.out.print("age: ");
        this.age = createData.nextInt();
        createData.nextLine();
        System.out.print("address: ");
        this.address = createData.nextLine();
        System.out.print("gender: ");
        this.gender = createData.nextLine();
        System.out.print("office of company: ");
        this.office = createData.nextLine();
    }

    void display() {
        System.out.print("email: " + this.mail);
        System.out.print(" | age: " + this.age);
        System.out.print(" | address: " + this.address);
        System.out.print(" | gender: " + this.gender);
        System.out.print(" | office of company: " + this.office);
    }
}

class Staff {
    public String name;
    private String password;
    private Data data;
    private boolean isLogin = false;

    public Staff(String name, String password, Data data) {
        this.name = name;
        this.password = password;
        this.data = data;
    }

    public Staff() {
    }

    public boolean login(String password) {
        if(this.password.equals(password)) {
            System.err.println("login successful!");
             this.isLogin = true;
             return true;
        } else {
            System.out.println("password invalid!");
            return false;
        }
    }

    public void logout() {
        System.err.println("logout successful!");
        this.isLogin = false;
    }

    public Data getData() {
        if(this.isLogin) {
            return this.data;
        } else {
            System.err.println("login require!");
            return null;
        }
    }
    
}






public class Company {
    //chưa có sài database nên xây admin chay z luôn cho nó choắt.
    public static final String admin_account = "admin_company";
    public static final String admin_password = "admin_password";

    public static void clearTerminal() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    public static Scanner input = new Scanner(System.in);

    public static int menu() {
        clearTerminal();
        System.out.println("===== MENU =====");
        System.out.println("1. Login");
        System.out.println("2. Register");
        System.out.println("3. ADMIN");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
        int number = input.nextInt();
        input.nextLine();
        return number;
    }

    public static int option() {
        clearTerminal();
        System.out.println("===== OPTION =====");
        System.out.println("1. Thong tin cua toi.");
        System.out.println("2. Han muc luong.");
        System.out.println("3. Thong tin bo sung.");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
        int number = input.nextInt();
        input.nextLine();
        return number;
    }
    public static int adminOption() {
        clearTerminal();
        System.out.println("===== ADMIN OPTION =====");
        System.out.println("1. Danh sach cac nhan vien.");
        System.out.println("2. Chinh sua nhan vien");
        System.out.println("3. Xoa khoi danh sach");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
        int number = input.nextInt();
        input.nextLine();
        return number;
    }

    public static boolean login(ArrayList<Staff> list) {
        System.out.print("User name: ");
        String userName = input.nextLine();


        Staff findUser = null;
        //tìm đối tượng trong list
        for(Staff user : list) {
            if(user.name.equals(userName)) {
                findUser = user;
            }
        }
        //xử lí đối tượng được yêu cầu đăng nhập
        if(findUser == null) {
            System.out.println("can't found user in company!");
            return false;
        } else {
            System.out.print("Password: ");
            String userPassword = input.nextLine();
            boolean loginResult = findUser.login(userPassword);         
            return loginResult;
        }

        
    }
    public static boolean adminLogin() {
        System.out.print("Admin name: ");
        String adminName = input.nextLine();

        if(admin_account.equals(adminName)) {
            System.out.print("Admin password: ");
            String password = input.nextLine();
            if(admin_password.equals(password)) {
                System.out.println("Login successful!");
                return true;
            } else {
                System.out.println("admin password invalid!");
                return false;
            }
        } else {
            System.out.println("admin name invalid!");
            return false;
        }
    }
    public static void register(ArrayList<Staff> list) {
        System.out.print("Name: ");
        String name = input.nextLine();
        System.out.print("Password: ");
        String password = input.nextLine();
        Data newData = new Data();
        newData.setData();
        Staff newStaff = new Staff(name, password, newData);
        list.add(newStaff);
        System.out.println("Register successful!");
    }
    public static void main(String[] args) {
        //thêm mảng động company
        ArrayList<Staff> company = new ArrayList<>();

        boolean isRunning = true;
        while(isRunning) {
            int valueMenu = menu();
            switch(valueMenu) {
                case 1:
                    clearTerminal();
                    System.out.println("---- login ----");
                    boolean loginResult = login(company);
                    while (loginResult) {
                        int valueOption = option();
                        switch(valueOption) {
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 0:
                                loginResult = false;
                                break;
                            default:
                        }
                    }
                    break;
                case 2:
                    clearTerminal();
                    System.out.println("---- Register ----");
                    register(company);
                    break;
                case 3:
                    clearTerminal();
                    System.out.println("---- ADMIN ----");
                    boolean adminLoginRs = adminLogin();
                    while(adminLoginRs) {
                        int adminOptionValue = adminOption();
                        switch(adminOptionValue) {
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 0:
                                adminLoginRs = false;
                                break;
                            default:
                        }
                    }
                    
                    break;
                case 0:
                    System.out.println("Exit successful!");
                    isRunning = false;
                    break;
                default:
                    System.out.println("invalid, please choice again!");
            }
        }
        input.close();
        //gọi thử 
        // insert(company);
        // Staff tmp = company.get(0);
        // tmp.login("1111");
        // Data test = tmp.getData();
        // test.display();
        
    }
}
