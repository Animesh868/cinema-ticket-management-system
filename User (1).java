import java.time.format.DateTimeFormatter;
import java.util.*;
class username_id
{
    public void usernamepassword()
    {
        Scanner input = new Scanner(System.in);
        String str1, str2;
        System.out.println("Enter your user name");
        str1 = input.nextLine();
        System.out.println("Enter your password");
        str2 = input.nextLine();
        do {
            if (str1.equals("animesh") && str2.equals("12345")) {
                return;
            } else {
                System.out.println("Your username and password is wrong so try again!");
                System.out.println("Enter your user name");
                str1 = input.nextLine();
                System.out.println("Enter your password");
                str2 = input.nextLine();
            }
        } while (true);
    }
}
class user extends username_id {
    static Scanner input = new Scanner(System.in);
    static String name;
    static String[] movielist = {"1) the avanger", "2) Saw iv", "3) the simpson"};
    static int number;
    void selectDate()
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the date");
        do{
            String date = input.nextLine();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            try {
                formatter.parse(date);
                break;
            } catch (Exception e) {
                System.out.print("Invalid date ");
                System.out.println("-> Enter the valid date");
            }
        }while(true);
        getName();
    }
    public void getName() {
        System.out.println("Please input your name ");
        name = input.nextLine();
        System.out.println("hello" + name);
        getMovie();

    }

    public void getMovie() {
        System.out.println("Please select a movie  ");
        for (int i = 0; i < movielist.length; i++) {
            System.out.println(movielist[i]);
        }
        number = input.nextInt();
        System.out.println("you selected the movie " + movielist[number - 1].substring(3, movielist[number - 1].length()));
        getSeats();
    }

    public void getSeats()
    {
        System.out.println("Ticket price = Rs.150/ticket");
        System.out.println("Please choose how many seats would you like  ");
        String seats = input.next();
        Integer s = Integer.parseInt(seats);

        int price = 150;
        System.out.println("Your total amount = "+ price*s);
        System.out.println("Thank you,\nYou have selected" + seats + "seat(s) for the movie " + movielist[number - 1].substring(3, movielist[number - 1].length()));
    }

    public static void main(String[] args) {
        user object= new user();
        object.usernamepassword();
        object.selectDate();
    }
}
