import javax.swing.*; 
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SideMealOrderFrame extends JFrame implements ActionListener{
    static int elementId;
    JButton addBtn;
    JButton reduceBtn;
    JButton Cancel;
    JButton Confirm;
    JFrame frame;
    JLabel SideMealQuantity;
    static ImageIcon SideMealIcon; 

    public SideMealOrderFrame(ImageIcon image){
        setImage(image);
    }

    public void setImage(ImageIcon image){
        SideMealIcon = image;
    }

    public ImageIcon getImage() {
        return SideMealIcon;
    }
    
    public void OrderFrame(int i){

        elementId = i;
        frame = new JFrame("Order");
		Container contentPane = frame.getContentPane();

        // 設定圖示
     	frame.setIconImage(frame.getToolkit().getImage("image/logo.jpg"));
        frame.setSize(800, 500); 
        //設定開啟的位置和某個物件相同，帶入null則會在畫面中間開啟
        frame.setLocationRelativeTo(null);

        // 建立一個JPanel的例項
        JPanel panel = new JPanel(); 
 
        //設定容器不使用佈局管理員
        panel.setLayout(null); 

        //建立標籤
        JLabel SideMealLab = new JLabel();
        SideMealQuantity = new JLabel("Quantity");

        //建立圖片物件
        ImageIcon reduceBtnIcon = new ImageIcon("image/reduceBtn.jpg");
		ImageIcon addBtnIcon = new ImageIcon("image/addBtn.jpg");

        SideMealLab.setIcon(SideMealIcon);

        //建立按鈕
        reduceBtn = new JButton(reduceBtnIcon);
        addBtn = new JButton(addBtnIcon);
        Cancel = new JButton("Cancel");
        Confirm = new JButton("Confirm");
        
        //設定位置大小 
        SideMealLab.setBounds(280,20,260,230);
        SideMealQuantity.setBounds(365,250,70,70);
        reduceBtn.setBounds(230,250,70,70);
        addBtn.setBounds(500,250,70,70);
        Cancel.setBounds(500, 360,100,60);
        Confirm.setBounds(650, 360,100,60);


        //將物件添加到panel
        panel.add(SideMealLab);
        panel.add(SideMealQuantity);
        panel.add(reduceBtn);
        panel.add(addBtn);
        panel.add(Cancel);
        panel.add(Confirm);

        reduceBtn.addActionListener(this);
        addBtn.addActionListener(this);
        Cancel.addActionListener(this);
        Confirm.addActionListener(this);

		contentPane.add(panel); // 將JPanel例項新增到JFrame
		frame.setVisible(true); 

    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addBtn) {
            OrderData.Singlecount[elementId] ++;
        } else if (e.getSource() == reduceBtn) {
            if(OrderData.Singlecount[elementId] > 0) {
                OrderData.Singlecount[elementId]--;
            }
        } else if(e.getSource() == Confirm || e.getSource() == Cancel) {
            frame.dispose();
        }
        SideMealQuantity.setText(OrderData.Singlecount[elementId]+"");
        System.out.println(OrderData.Singlecount[elementId]);
    }
}