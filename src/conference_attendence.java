import java.util.*;

class conference_attendance {
    private static HashSet<Integer> attendees = new HashSet<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. CHECK-IN \n2. DISPLAY ATTENDANCE \n3. REMOVE CHECK-IN \n4. EXIT");
            System.out.print("Choose an option: ");
            int option = sc.nextInt();

            if (option == 4) {
                System.out.println("Shutting Down!!");
                break;
            }

            switch (option) {
                case 1:
                    System.out.print("Enter your ID to check in: ");
                    int checkInId = sc.nextInt();
                    checkIn(checkInId);
                    break;
                case 2:
                    displayAllCheckedIn();
                    break;
                case 3:
                    System.out.print("Enter your ID to remove check-in: ");
                    int removeId = sc.nextInt();
                    removeCheckIn(removeId);
                    break;
                default:
                    System.out.println("Invalid option!!");
            }
            System.out.println();
        }
        sc.close();
    }

    public static void checkIn(int id) {
        if (attendees.add(id)) {
            System.out.println(id + " - Checked In");
        } else {
            System.out.println(id + " - Already Checked In");
        }
    }

    public static boolean isCheckedIn(int id) {
        return attendees.contains(id);
    }

    public static void removeCheckIn(int id) {
        if (attendees.remove(id)) {
            System.out.println(id + " - Check-In Removed");
        } else {
            System.out.println(id + " - Not Checked In");
        }
    }

    public static void displayAllCheckedIn() {
        System.out.println("Checked-In Attendees: " + attendees);
    }
}
