import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AllDocs extends JFrame {
    public JPanel Main;
    private JButton allDocsButton;
    private JLabel allDocsLabel;

    public AllDocs() {

        allDocsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                allDocsLabel.setText(String.valueOf(CouchCRUD.listAllCars()));
            }
        });
    }

    public static void main(String args[])
    {
        JFrame frame = new JFrame("All Docs");
        frame.setContentPane(new AllDocs().Main); //
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

}
