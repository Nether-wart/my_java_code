import java.io.IOException;
import java.net.ServerSocket;

public class ListenerThread{
    public void run()throws IOException{
        boolean b_正在对局 =false;
        ServerSocket s =new ServerSocket(25560);
        while (true){
            s.accept();

        }
    }
}
