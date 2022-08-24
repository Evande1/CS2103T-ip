import java.util.Scanner;

//deals with interactions with the user
public class Ui {
    // printmessage, print list, delete msg, add success,

    private Scanner sc;

    public void showWelcome() {
        System.out.println("Hello! I'm Milk");
        System.out.println("What can I do for you?");
        sc = new Scanner(System.in);
    }

    public String readCommand() {
        return sc.nextLine();
    }

    public void printList(TaskList tasks) throws DukeException {
        System.out.println("Here are the tasks in your list:");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println(i + 1 + "." + tasks.get(i + 1));
        }
    }

    public void showLoadingError() {
        System.out.println("error in loading file!");
    };

    public void showError(String error) {
        System.out.println(error);
    };

    public void addSuccess(Task task, TaskList tasks) {
        System.out.println("Got it. I've added this task:");
        System.out.println(task);
        System.out.println("Now you have " + tasks.size() + " tasks in the list.");
    };

    public void deleteSuccess(Task task, TaskList tasks) {
        System.out.println("Noted. I've removed this task:");
        System.out.println(task);
        System.out.println("Now you have " + tasks.size() + " tasks in the list.");
    };

    public void showBye() {
        System.out.println("Bye. Hope to see you again soon!");
    }

    public void showMark(Task task) {
        System.out.println("Nice! I've marked this task as done:");
        System.out.println(task);
    }

    public void showUnmark(Task task) {
        System.out.println("OK, I've marked this task as not done yet:");
        System.out.println(task);
    }

    public void printMessage(String message) {
        System.out.println(message);
    };
}
