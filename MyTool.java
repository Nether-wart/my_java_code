import javax.swing.*;
import java.awt.*;
import java.util.regex.Pattern;

public class MyTool {
    public static int getScreenHeight() {
        return Toolkit.getDefaultToolkit().getScreenSize().height;
    }

    public static int getScreenWidth() {
        return Toolkit.getDefaultToolkit().getScreenSize().width;
    }


    private static final String IPV4_PATTERN = "^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";
    private static final String IPV6_PATTERN = "^(([0-9a-fA-F]{1,4}:){7,7}[0-9a-fA-F]{1,4}|([0-9a-fA-F]{1,4}:){1,7}:|([0-9a-fA-F]{1,4}:){1,6}:[0-9a-fA-F]{1,4}|([0-9a-fA-F]{1,4}:){1,5}(:[0-9a-fA-F]{1,4}){1,2}|([0-9a-fA-F]{1,4}:){1,4}(:[0-9a-fA-F]{1,4}){1,3}|([0-9a-fA-F]{1,4}:){1,3}(:[0-9a-fA-F]{1,4}){1,4}|([0-9a-fA-F]{1,4}:){1,2}(:[0-9a-fA-F]{1,4}){1,5}|[0-9a-fA-F]{1,4}:((:[0-9a-fA-F]{1,4}){1,6})|:((:[0-9a-fA-F]{1,4}){1,7}|:)|fe80:(:[0-9a-fA-F]{0,4}){0,4}%[0-9a-zA-Z]{1,}|::(ffff(:0{1,4}){0,1}:){0,1}((25[0-5]|(2[0-4]|1{0,1}[0-9]){0,1}[0-9])\\.){3}(25[0-5]|(2[0-4]|1{0,1}[0-9]){0,1}[0-9])|([0-9a-fA-F]{1,4}:){1,4}:((25[0-5]|(2[0-4]|1{0,1}[0-9]){0,1}[0-9])\\.){3}(25[0-5]|(2[0-4]|1{0,1}[0-9]){0,1}[0-9]))$";

    /**
     * 判断给定的字符串是否是有效的IPv4或IPv6地址
     *
     * @param ip 待检查的字符串
     * @return 如果是有效的IPv4或IPv6地址返回true，否则返回false
     */
    public static boolean isIPAddress(String ip) {
        if (ip == null || ip.isEmpty()) {
            return false;
        }
        return Pattern.matches(IPV4_PATTERN, ip) || Pattern.matches(IPV6_PATTERN, ip);
    }


    public static void sendMessege(String messege) {
        JFrame frame = new JFrame("new messege");
        JLabel label = new JLabel(messege);
        label.setFont(new Font("name", Font.PLAIN, 22));
        frame.getContentPane().add(label);
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setLocation(MyTool.getScreenWidth(), MyTool.getScreenHeight() - 240);
        frame.setAlwaysOnTop(true);
        frame.setVisible(true);
        for (int i = 0; i < 400; i++) {
            frame.setLocation(MyTool.getScreenWidth() - i, MyTool.getScreenHeight() - 240);
        }
    }
}