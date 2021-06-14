import javax.swing.*; 
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SideMealOrderFrame extends JFrame implements ActionListener{
    static int singleCountIndex;
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

        singleCountIndex = i;
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
        SideMealQuantity = new JLabel(OrderData.Singlecount[singleCountIndex]+"");

        //改數字大小
        SideMealQuantity.setFont(SideMealQuantity.getFont().deriveFont(32.0f));

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
        SideMealQuantity.setBounds(380,250,70,70);
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
        int total = 0;
        if (e.getSource() == addBtn) {
            OrderData.Singlecount[singleCountIndex] ++;
        } else if (e.getSource() == reduceBtn) {
            if(OrderData.Singlecount[singleCountIndex] > 0) {
                OrderData.Singlecount[singleCountIndex]--;
            }
        } else if(e.getSource() == Confirm || e.getSource() == Cancel) {
            frame.dispose();

            System.out.printf("\n%s%12s%8s\n\n", "品項", "數量", "價格");

            for (int i = 0; i < 9; i++) {

                if (OrderData.Setcount[i] > 0) {
                    System.out.println(OrderData.setlist[i] + "    x" + OrderData.Setcount[i] + "       "
                            + OrderData.setlist[i].getPrice() * OrderData.Setcount[i] + "元\n");
                    total += OrderData.setlist[i].getPrice() * OrderData.Setcount[i];
                }
            }

            for (int i = 0; i < 10; i++) {
                if (OrderData.Singlecount[i] > 0) {
                    System.out.println(OrderData.singlelist[i] + "  x" + OrderData.Singlecount[i] + "        "
                            + OrderData.singlelist[i].getPrice() * OrderData.Singlecount[i] + "元\n");
                    total += OrderData.singlelist[i].getPrice() * OrderData.Singlecount[i];
                }
            }
            System.out.printf("\n總金額:                 %d元", total);

        }
        SideMealQuantity.setText(OrderData.Singlecount[singleCountIndex]+"");
    }
}