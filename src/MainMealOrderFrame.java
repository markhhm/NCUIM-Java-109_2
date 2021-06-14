import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class MainMealOrderFrame extends JFrame implements ActionListener {

    static int singleCountIndex;
    static int setCountIndex;
    JButton singleReduceBtn;
    JButton setAReduceBtn;
    JButton setBReduceBtn;
    JButton setCReduceBtn;
    JButton Cancel;
    JButton Confirm;
    JButton singleBtn;
    JButton setABtn;
    JButton setBBtn;
    JButton setCBtn;
    JFrame frame;
    JLabel singleQuantity;
    JLabel setAQuantity;
    JLabel setBQuantity;
    JLabel setCQuantity;
    String mealName;
    ArrayList<singleType> Single_Menu = new ArrayList<singleType>();
    static ImageIcon MainMealIcon;

    public MainMealOrderFrame(ImageIcon image) {
        setImage(image);
    }

    public void setImage(ImageIcon image) {
        MainMealIcon = image;
    }

    public ImageIcon getImage() {
        return MainMealIcon;
    }

    public void OrderFrame(int i) {
        new MenuData(Single_Menu);
        singleCountIndex = i;
        mealName = Single_Menu.get(i).getName();
        frame = new JFrame("Order");
        Container contentPane = frame.getContentPane();

        // 設定圖示
        frame.setIconImage(frame.getToolkit().getImage("image/logo.jpg"));
        frame.setSize(800, 500);

        // 設定開啟的位置和某個物件相同，帶入null則會在畫面中間開啟
        frame.setLocationRelativeTo(null);

        // 建立一個JPanel的例項
        JPanel panel = new JPanel();

        // 設定容器不使用佈局管理員
        panel.setLayout(null);

        // 建立標籤
        JLabel MainMealLab = new JLabel();

        singleQuantity = new JLabel(OrderData.Singlecount[singleCountIndex] + "");
        setAQuantity = new JLabel(OrderData.Setcount[setCountIndex] + "");
        setBQuantity = new JLabel(OrderData.Setcount[setCountIndex + 1] + "");
        setCQuantity = new JLabel(OrderData.Setcount[setCountIndex + 2] + "");

        //改數字大小
        singleQuantity.setFont(singleQuantity.getFont().deriveFont(24.0f));
        setAQuantity.setFont(setAQuantity.getFont().deriveFont(24.0f));
        setBQuantity.setFont(setBQuantity.getFont().deriveFont(24.0f));
        setCQuantity.setFont(setCQuantity.getFont().deriveFont(24.0f));

        // 建立圖片物件
        MainMealLab.setIcon(MainMealIcon);
        ImageIcon smallReduceBtnIcon = new ImageIcon("image/smallReduceBtn.jpg");

        // 建立按鈕
        singleReduceBtn = new JButton(smallReduceBtnIcon);
        setAReduceBtn = new JButton(smallReduceBtnIcon);
        setBReduceBtn = new JButton(smallReduceBtnIcon);
        setCReduceBtn = new JButton(smallReduceBtnIcon);
        Cancel = new JButton("Cancel");
        Confirm = new JButton("Confirm");

        singleBtn = new JButton("Only " + mealName);
        setABtn = new JButton("With Set A");
        setBBtn = new JButton("With Set B");
        setCBtn = new JButton("With Set C");

        // 設定位置大小
        MainMealLab.setBounds(50, 50, 260, 230);
        singleBtn.setBounds(350, 20, 260, 60);
        setABtn.setBounds(350, 100, 260, 60);
        setBBtn.setBounds(350, 180, 260, 60);
        setCBtn.setBounds(350, 260, 260, 60);

        singleReduceBtn.setBounds(710, 30, 40, 40);
        setAReduceBtn.setBounds(710, 110, 40, 40);
        setBReduceBtn.setBounds(710, 190, 40, 40);
        setCReduceBtn.setBounds(710, 270, 40, 40);

        singleQuantity.setBounds(650, 20, 60, 60);
        setAQuantity.setBounds(650, 100, 60, 60);
        setBQuantity.setBounds(650, 180, 60, 60);
        setCQuantity.setBounds(650, 260, 60, 60);

        Cancel.setBounds(500, 360, 100, 60);
        Confirm.setBounds(650, 360, 100, 60);

        // 將物件添加到panel
        panel.add(singleReduceBtn);
        panel.add(setAReduceBtn);
        panel.add(setBReduceBtn);
        panel.add(setCReduceBtn);
        panel.add(MainMealLab);
        panel.add(singleBtn);
        panel.add(setABtn);
        panel.add(setBBtn);
        panel.add(setCBtn);

        panel.add(singleQuantity);
        panel.add(setAQuantity);
        panel.add(setBQuantity);
        panel.add(setCQuantity);

        panel.add(Cancel);
        panel.add(Confirm);

        singleReduceBtn.addActionListener(this);
        setAReduceBtn.addActionListener(this);
        setBReduceBtn.addActionListener(this);
        setCReduceBtn.addActionListener(this);
        Cancel.addActionListener(this);
        Confirm.addActionListener(this);
        singleBtn.addActionListener(this);
        setABtn.addActionListener(this);
        setBBtn.addActionListener(this);
        setCBtn.addActionListener(this);

        // 將JPanel例項新增到JFrame
        contentPane.add(panel);
        frame.setVisible(true);
    }

    public void Indextrans(int singleCountIndex) {
        if (singleCountIndex == 1) {
            setCountIndex = 0;
        } else if (singleCountIndex == 6) {
            setCountIndex = 3;
        } else if (singleCountIndex == 8) {
            setCountIndex = 6;
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int total = 0;
        Indextrans(singleCountIndex);
        if (e.getSource() == singleBtn) {
            OrderData.Singlecount[singleCountIndex]++;
        } else if (e.getSource() == singleReduceBtn) {
            if (OrderData.Singlecount[singleCountIndex] > 0) {
                OrderData.Singlecount[singleCountIndex]--;
            }
        } else if (e.getSource() == setABtn) {
            OrderData.Setcount[setCountIndex]++;
        } else if (e.getSource() == setAReduceBtn) {
            OrderData.Setcount[setCountIndex]--;
        } else if (e.getSource() == setBBtn) {
            OrderData.Setcount[setCountIndex + 1]++;
        } else if (e.getSource() == setBReduceBtn) {
            OrderData.Setcount[setCountIndex + 1]--;
        } else if (e.getSource() == setCBtn) {
            OrderData.Setcount[setCountIndex + 2]++;
        } else if (e.getSource() == setCReduceBtn) {
            OrderData.Setcount[setCountIndex + 2]--;
        } else if (e.getSource() == Confirm || e.getSource() == Cancel) {
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
        singleQuantity.setText(OrderData.Singlecount[singleCountIndex] + "");
        setAQuantity.setText(OrderData.Setcount[setCountIndex] + "");
        setBQuantity.setText(OrderData.Setcount[setCountIndex + 1] + "");
        setCQuantity.setText(OrderData.Setcount[setCountIndex + 2] + "");
    }
}