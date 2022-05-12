import java.util.Scanner;

public class Main {

    //Add mysql-connector jar-file as external library beforehand

    //Make database beforehand
    //CREATE SCHEMA simplelogin;

    //Remember to write username and password in the DBConnection class!!!

    //Make a users table beforehand
    /*
    CREATE TABLE users (
        id int primary key auto_increment,
        username VARCHAR(50),
        password VARCHAR(50)
    );
    */

    //Make users beforehand
    //INSERT INTO users (username, password) VALUES ('Thor', '1234');

    static Scanner input = new Scanner(System.in);
    static String username;

    public static void main(String[] args) {
        DBConnection.getConnection();
        login();
    }

    static void login(){
        boolean loggedIn = false;

        while(!loggedIn) {
            System.out.println("LOG IN");

            System.out.print("Username: ");
            String usernameInput = input.next();

            System.out.print("Password: ");
            String passwordInput = input.next();

            User user = UserRepo.getUserByUsername(usernameInput);

            loggedIn = validateLogin(user, passwordInput);

        }

        System.out.println("Logged in as " + username);

    }

    static boolean validateLogin(User user, String passwordInput){
        if(user != null){
            if(user.password.equals(passwordInput)){
                username = user.username;
                return true;
            }else{
                System.out.println("Wrong password");
            }
        }else{
            System.out.println("Wrong username");
        }
        System.out.println();
        return false;
    }

}
