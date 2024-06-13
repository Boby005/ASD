import java.util.Scanner;
import java.util.LinkedList;

class Point {
    String question;
    String answer;
    Point next;

    public Point(String question, String answer) {
        this.question = question;
        this.answer = answer;
        this.next = null;
    }
}

public class ScavengerHunt {
    private LinkedList<Point> points;
    public ScavengerHunt() {
        points = new LinkedList<>();
    }
    public void addPoint(String question, String answer) {
        Point newPoint = new Point(question, answer);
        points.add(newPoint);
    }
    public void playGame() {
        Scanner scanner = new Scanner(System.in);
        for (Point point : points) {
            System.out.println("Pertanyaan: " + point.question);
            System.out.print("Masukan Jawaban : ");
            String userAnswer = scanner.nextLine();
            if (userAnswer.equalsIgnoreCase(point.answer)) {
                System.out.println("Benar! Lanjuttt.");
            } else {
                System.out.println("Salahh. Game over.");
                return;
            }
        }
        System.out.println("Congratulations! You've reached the treasure!");
    }
    public static void main(String[] args) {
        ScavengerHunt game = new ScavengerHunt();
        game.addPoint("Ibukota Negara indonesia?", "Jakarta");
        game.addPoint("Planet apa yang terbesar di tata surya kita ?", "Jupiter");
        game.addPoint("Siapa Ketua Umum PKI pertama?", "Semaoen");
        game.playGame();
    }
}