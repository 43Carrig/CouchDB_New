import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Create extends JFrame{
    public JPanel Main;
    private JPanel left;
    private JPanel right;
    private JPanel bottom;
    private JLabel lblBefore;
    private JLabel lblCarID;
    private JLabel lblCarRegistration;
    private JLabel lblSold;
    private JLabel lblAfter;
    private JTextField tfBefore;
    private JTextField tfCarId;
    private JTextField tfCarRegistration;
    private JTextField tfSold;
    private JTextField tfAfter;
    private JButton btnCreate;
    private JLabel lblModel;
    private JLabel lblMake;
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


    public Create() {
        super();

        tfBefore.setText(String.valueOf(CouchCRUD.listAllCars()));
        btnCreate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Car car = new Car();

                car.set_id(tfCarId.getText());
                car.set_rev(null);
                car.setSold(Boolean.valueOf(tfSold.getText()));
                car.setRegistration(tfCarRegistration.getText());
                car.setCarMake(tfCarMake.getText());
                car.setCarModel(tfModel.getText());
                car.setYear(tfYear.getText());
                car.setPrice(tfPrice.getText());
                car.setFuelType(tfFuelType.getText());
                car.setEngineSizeCC(tfEngineSizeCC.getText());
                car.setTransmission(tfTransmission.getText());
                car.setColor(tfColor.getText());
                car.setNumberOfDoors(tfNumberOfDoors.getText());

                CouchCRUD.addCar(car);
                tfAfter.setText(String.valueOf(CouchCRUD.listAllCars()));
            }
        });

    }
    public static void main(String args[])
    {

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame("Create");
                frame.setContentPane(new Create().Main); //
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
//                frame.setSize(350, 350);
                frame.setVisible(true);
            }
        });

    }
}
