import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int volume = 7;
        int numOfRequests = -1;

        Scanner input = new Scanner(System.in);
        while (numOfRequests < 0) {
            System.out.print("Enter number of volume change requests: ");
            numOfRequests = input.nextInt();
            try {
                requestCheck(numOfRequests);
            }
            catch (IOException e) {
                System.out.println(e);
            }
        }

        ArrayList<String> change = new ArrayList<>();

        for (int i = 0; i < numOfRequests; i++) {
            System.out.println("enter 'up' or 'down' to change volume(volume starts at 7, min=0, max = 10): ");
            change.add(input.next());
        }

        for (int i = 0; i < numOfRequests; i++) {
            String test = change.get(i);
            if (test.equals("up")) {
                if (volume != 10) {
                    volume = volume +1;
                }
            }
            if (test.equals("down")) {
                if (volume != 0) {
                    volume = volume -1;
                }
            }
        }


        System.out.println("After all volume request changes, the volume is at : " +volume);
    }

    static boolean requestCheck(int n) throws IOException {
        if (n < 0) {
            System.out.println("Can't have negative volume change requests!");
            return false;
        }
        return true;
    }
    
}
