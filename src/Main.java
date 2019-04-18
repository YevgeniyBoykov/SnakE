import javax.swing.*;

/*Create on 1.04.2019*/
class MainWindow extends JFrame {
    public MainWindow() {
        setTitle("Змейка");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(320, 320);
        setLocation(400, 400);
        add(new GameField());
        setVisible(true);
    }
}

public class Main {

    public static void main(String[] args) {
        MainWindow mw = new MainWindow();
    }
}

