import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Delete extends JFrame {
    public JPanel Main;
    private JPanel left;
    private JPanel right;
    private JPanel botttom;
    private JLabel lblBefore;
    private JLabel lblGetText;
    private JLabel lblAfter;
    private JTextField tfBefore;
    private JTextField tfEnter;
    private JTextField tfAfter;
    private JButton btnDelete;

    public Delete() {
        tfBefore.setText(String.valueOf(CouchCRUD.listAllCars()));
        btnDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                CouchCRUD.deleteCar(tfEnter.getText());
                tfAfter.setText(String.valueOf(CouchCRUD.listAllCars()));
            }
        });
    }

    public static void main (String args[])
    {
        JFrame frame = new JFrame("Delete");
        frame.setContentPane(new Delete().Main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
//        frame.setSize(300, 300);
        frame.setVisible(true);

    }
}
