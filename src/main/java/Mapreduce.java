import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Mapreduce extends JFrame {
    public JPanel Main;
    private JButton mapreduceButton;
    private JLabel mapreduceLabel;
    private JPanel left;
    private JPanel right;
    private JPanel bottom;
    private JButton btnUpdate;
    private JTextField tfBefore;
    private JTextField tfCarId;
    private JTextField tfCarRev;
    private JTextField tfIsSold;
    private JTextField tfCarRegistration;
    private JLabel lblBefore;
    private JLabel lblCarId;
    private JLabel lblAfter;
    private JLabel lblCarRegistration;
    private JLabel lblCarIsSold;
    private JLabel lblCarRev;
    private JTextField tfAfter;

    public Mapreduce() {

        mapreduceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mapreduceLabel.setText(String.valueOf(CouchCRUD.numCarsByMake("couchdb.properties")));
            }
        });
    }

    public static void main(String args[])
    {
        JFrame frame = new JFrame("Mapreduce");
        frame.setContentPane(new Mapreduce().Main); //
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}
