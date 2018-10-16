import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Update extends JFrame{
    public JPanel Main;
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

    public Update() {
        tfBefore.setText(String.valueOf(CouchCRUD.listAllCars()));

        btnUpdate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Car car = new Car();
                car.set_id(tfCarId.getText());
                car.set_rev(tfCarRev.getText());
                car.setSold(Boolean.valueOf(tfIsSold.getText()));
                car.setRegistration(tfCarRegistration.getText());
                car.setCarMake(tfCarMake.getText());
                car.setCarModel(tfModel.getText());
                car.setYear(tfModel.getText());
                car.setPrice(tfPrice.getText());
                car.setFuelType(tfFuelType.getText());
                car.setEngineSizeCC(tfEngineSizeCC.getText());
                car.setTransmission(tfTransmission.getText());
                car.setColor(tfColor.getText());
                car.setNumberOfDoors(tfNumberOfDoors.getText());

                CouchCRUD.updateCarDetails(car);

                tfAfter.setText(String.valueOf(CouchCRUD.listAllCars()));
            }
        });
    }

    public static void main(String args[])
    {
        JFrame frame = new JFrame("Update");
        frame.setContentPane(new Update().Main); //
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}
