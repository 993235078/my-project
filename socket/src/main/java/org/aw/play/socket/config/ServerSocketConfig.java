package org.aw.play.socket.config;

import com.sun.org.apache.bcel.internal.generic.NEW;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/**
 * @author Irvin
 * @description
 * @date 2022/1/11 13:53
 */
@Component
public class ServerSocketConfig {

    Map<String, Socket> map = new ConcurrentHashMap<>();

    public void init() {
        System.out.println("ServerSocketConfig开始初始化");
        try {
            ServerSocket serverSocket = new ServerSocket(9999);
            int count = 0;
            while (true) {
                System.out.println("ServerSocketConfig等待新的链接");
                Socket socket = serverSocket.accept();
                count++;
                System.out.println(count);
                Runnable runnable = () -> {
                    BufferedReader bufferedReader;
                    try {
                        bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream(), StandardCharsets.UTF_8));
                        String str;
                        while ((str = bufferedReader.readLine()) != null) {
                            System.out.println("客户端说：" + str);
                            if (str.contains("首次登录")) {
                                String deviceId = str.substring(str.lastIndexOf("deviceId"));
                                map.put(deviceId, socket);
                            }
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                };
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void sendMessage(String deviceId) {
        Socket socket = map.get(deviceId);
        //发送消息
    }

}
