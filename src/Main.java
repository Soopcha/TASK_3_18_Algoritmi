import util.SwingUtils;

import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.ROOT);
        //UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        SwingUtils.setDefaultFont("Times New Roman", 18);

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameMain().setVisible(true);
            }
        });
    }
}