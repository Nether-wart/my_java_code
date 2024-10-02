import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.IOException;

public class main_启动器 extends JFrame {
    public void run (){
        try {
            new ListenerThread().run();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Font f =new Font("name",Font.PLAIN,22);

        setSize(600,300);
        setLayout(new FlowLayout());

        Container c =getContentPane();

        JLabel 地址 =new JLabel("地址");
        JTextField 地址栏 = new JTextField(20);
        JButton start =new JButton("确定");
        start.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        setVisible(true);
    }
}
