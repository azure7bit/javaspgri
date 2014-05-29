package JavaIcon;

import java.awt.EventQueue;
import IconMakeOver.IconLabel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class FrameIcon extends JFrame 
{

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public FrameIcon() 
	{
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 342);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		IconLabel lblTruck = new IconLabel();
		lblTruck.setIconReflect(new ImageIcon("src/Gambar/iconPengiriman.png"));
		lblTruck.setBounds(40, 31, 181, 242);
		contentPane.add(lblTruck);
		
		IconLabel lblFPK = new IconLabel();
		lblFPK.setIconReflect(new ImageIcon("src/Gambar/FPK.png"));
		lblFPK.setBounds(325, 31, 181, 242);
		contentPane.add(lblFPK);
		
		JLabel lblIcon = new JLabel("");
		lblIcon.setIcon(new ImageIcon("/home/lubuntu/workspace/TesApp/src/Gambar/blurWall.jpg"));
		lblIcon.setBounds(0, 0, 548, 312);
		contentPane.add(lblIcon);
	}
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameIcon frame = new FrameIcon();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
