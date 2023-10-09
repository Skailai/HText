import javax.swing.*;

public class MyFrame {
    private JFrame frame;
    private JTextArea textArea;
    private JScrollPane scrollPane;

    public MyFrame (){
        createFrame();
        createTextArea();
        frame.setVisible(true);
    }
    private void createTextArea(){
        textArea = new JTextArea();
        scrollPane = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        frame.add(scrollPane); //adds scrollPane + textArea
        scrollPane.setBorder(BorderFactory.createEmptyBorder());
    }
    private void createFrame(){
        frame = new JFrame("HText");
        frame.setSize(800,600);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }


}
