import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Read extends JFrame {
    public JPanel Main;
    private JPanel left;
    private JPanel Right;
    private JPanel Bottom;
    private JLabel lblBefore;
    private JLabel lblGet;
    private JLabel lblID;
    private JLabel lblRev;
    private JLabel lblIsSold;
    private JLabel lblRegistration;
    private JTextField tfBefore;
    private JTextField tfGetById;
    private JTextField tfCarId;
    private JTextField tfCarRev;
    private JTextField tfIsSold;
    private JTextField tfCarRegistration;
    private JButton btnFind;
    private JLabel lblCarMake;
    private JLabel lblModel;
    private JLabel lblYear;
    private JLabel lblPrice;
    private JLabel lblFuelType;
    private JLabel lblEngineSizeCC;
    private JLabel lblTransmission;
    private JLabel lblColor;
    private JLabel lblNumberOfDoors;
    private JTextField tfCarMake;
    private JTextField tfModel;
    private JTextField tfYear;
    private JTextField tfPrice;
    private JTextField tfFuelType;
    private JTextField tfEngineSizeCC;
    private JTextField tfTransmission;
    private JTextField tfColor;
    private JTextField tfNumberOfDoors;

    public Read() {

        tfBefore.setText(String.valueOf(CouchCRUD.listAllCars()));

        btnFind.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Car data = CouchCRUD.getCarFromId(tfGetById.getText());
                tfCarId.setText(data.get_id()); //result.setText(String.valueOf(data));
                tfCarRev.setText(data.get_rev());
                tfIsSold.setText(String.valueOf(data.getSold()));
                tfCarRegistration.setText(data.getRegistration());
                tfCarMake.setText(data.getCarMake());
                tfModel.setText(data.getCarModel());
                tfYear.setText(data.getYear());
                tfPrice.setText(data.getPrice());
                tfFuelType.setText(data.getFuelType());
                tfEngineSizeCC.setText(data.getEngineSizeCC());
                tfTransmission.setText(data.getTransmission());
                tfColor.setText(data.getColor());
                tfNumberOfDoors.setText(data.getNumberOfDoors());
            }
        });
    }

    public static void main(String args[])
    {
        JFrame frame = new JFrame("Read");
        frame.setContentPane(new Read().Main); //
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
//        frame.setSize(300, 1000);
        frame.setVisible(true);
    }

}
