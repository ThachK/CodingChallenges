import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.print("Please enter minutes to convert: ");
		int minutes = sc.nextInt();
		sc.close();
		System.out.println("The seconds are: " + minutesToSeconds(minutes));
    }
    public static int minutesToSeconds(int m){
        int seconds = m * 60;
        return seconds;
    }
}
