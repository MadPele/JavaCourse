package madpele;

public class Main {

    public static void main(String[] args) {
        char switchChar = 'P';

        switch(switchChar) {
            case 'A':
                System.out.println("Its A");
                break;

            case 'B':
                System.out.println("Its B");
                break;

            case 'C':
                System.out.println("Its C");
                break;

            case 'D':
                System.out.println("Its D");
                break;

            default:
                System.out.println("It was't A, B, C or D");
                break;
        }
    }
}
