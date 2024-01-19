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

    public void login(String password) {
        if(this.password.equals(password)) {
            System.err.println("login successful!");
             this.isLogin = true;
        } else {
            System.out.println("password invalid!");
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
    public static void insert(ArrayList<Staff> list) {
        Scanner input = new Scanner(System.in);
        System.out.print("Name: ");
        String name = input.nextLine();
        System.out.print("Password: ");
        String password = input.nextLine();
        Data newData = new Data();
        newData.setData();
        Staff newStaff = new Staff(name, password, newData);
        list.add(newStaff);
        System.out.println("successful!");
        input.close();
    }
    public static void main(String[] args) {
        // Staff first = new Staff();
        ArrayList<Staff> company = new ArrayList<>();
        insert(company);
        Staff tmp = company.get(0);
        tmp.login("1111");
        Data test = tmp.getData();
        test.display();
        
    }
}
