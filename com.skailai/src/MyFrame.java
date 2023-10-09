import javax.swing.*;

public class MyFrame {
    private JFrame frame;
    private JTextArea textArea;
    private JScrollPane scrollPane;
    private JMenuBar menuBar;
    private JMenu fileMenu, fileEdit;
    private JMenuItem iNew, iOpen, iSave, iSaveAs, iExit;

    public MyFrame (){
        createFrame();
        createTextArea();
        createMenuBar();
        createFileMenu();
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
    private void createMenuBar(){
        menuBar = new JMenuBar();
        frame.setJMenuBar(menuBar);

        fileMenu = new JMenu("File");
        menuBar.add(fileMenu);

        fileEdit = new JMenu("Edit");
        menuBar.add(fileEdit);
    }
    private void createFileMenu(){
        iNew = new JMenuItem("New");
        fileMenu.add(iNew);

        iOpen = new JMenuItem("Open");
        fileMenu.add(iOpen);

        iSave = new JMenuItem("Save");
        fileMenu.add(iSave);

        iSaveAs = new JMenuItem("Save As");
        fileMenu.add(iSaveAs);

        iExit = new JMenuItem("Exit");
        fileMenu.add(iExit);
    }


}
