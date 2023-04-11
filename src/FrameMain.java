import util.SwingUtils;

import javax.swing.*;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FrameMain extends JFrame {
    private JPanel panelMain;
    private JButton buttonJavaQueue;
    private JButton buttonQueueSelf;
    private JTextField textField;
    private JTextField textFieldN;
    private JButton loadButton;
    private JButton saveButton;
    private JPanel resultPanel;
    private JLabel resultLabel;
    private JFileChooser fileChooserOpen;
    private JFileChooser fileChooserSave;

    public FrameMain() {
        this.setTitle("Queue");
        this.setContentPane(panelMain);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();

        fileChooserOpen = new JFileChooser();
        fileChooserSave = new JFileChooser();
        fileChooserOpen.setCurrentDirectory(new File("."));
        fileChooserSave.setCurrentDirectory(new File("."));
        FileFilter filter = new FileNameExtensionFilter("Text files", "txt");
        fileChooserOpen.addChoosableFileFilter(filter);
        fileChooserSave.addChoosableFileFilter(filter);

        fileChooserSave.setAcceptAllFileFilterUsed(false);
        fileChooserSave.setDialogType(JFileChooser.SAVE_DIALOG);
        fileChooserSave.setApproveButtonText("Save");
        buttonJavaQueue.addActionListener(new ActionListener() {


            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int n = Integer.parseInt(textFieldN.getText());
                LinkedList<Queue<Integer>> list = new LinkedList<>();
                list = QueueJava.Testing(n);
                resultLabel.setText(list.toString());

            }
        });
        loadButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                fileChooserOpen.showOpenDialog(panelMain);

                File file = fileChooserOpen.getSelectedFile();
                try {
                    Scanner scanner = new Scanner(file);
                    int number = scanner.nextInt();
                    textFieldN.setText(String.valueOf(number));
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                }

            }
        });
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                fileChooserSave.showSaveDialog(panelMain);

                File file = fileChooserSave.getSelectedFile();
                try {
                    FileWriter fw = new FileWriter(file);
                    String text = resultLabel.getText();
                    fw.write(text);
                    fw.close();
                } catch (IOException e) {
                    SwingUtils.showErrorMessageBox(e);
                }
            }
        });
        buttonQueueSelf.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int n = Integer.parseInt(textFieldN.getText());
                LinkedList<String> list = new LinkedList<>();
                try {
                    list = QueueSelf.Testing(n);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
                resultLabel.setText(list.toString());
            }
        });
    }

}
