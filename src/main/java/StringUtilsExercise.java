import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;



public class StringUtilsExercise{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Something Here: ");
        String answer = scanner.nextLine();
        System.out.println("Is it a number ? " + StringUtils.isNumeric(answer));
        System.out.println("Your cases flipped: " + StringUtils.swapCase(answer));
        System.out.println("Your answer in reverse: " + StringUtils.reverse(answer));






    }



}
