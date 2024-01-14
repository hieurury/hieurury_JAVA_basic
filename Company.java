import java.util.Scanner;


class Data {
    private String mail;
    private int age;
    private String address;
    private String gender;
    private String office;

    Scanner setData = new Scanner(System.in);

    void setData() {
        System.out.print("email: ");
        this.mail = setData.nextLine();
        System.out.print("age: ");
        this.age = setData.nextInt();
        setData.nextLine();
        System.out.print("address: ");
        this.address = setData.nextLine();
        System.out.print("gender: ");
        this.gender = setData.nextLine();
        System.out.print("office of company: ");
        this.office = setData.nextLine();
    }

    void display() {
        System.out.println("email: " + this.mail);
        System.out.println("age: " + this.age);
        System.out.println("address: " + this.address);
        System.out.println("gender: " + this.gender);
        System.out.println("office of company: " + this.office);
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
    public static void main(String[] args) {
        // Staff first = new Staff();
        Data newData = new Data();
        newData.setData();
        newData.display();
    }
}
