package com.ibe;

import com.ibe.common.envInfo.EnvInfoGet;
import com.ibe.common.envInfo.JavaEnvInfo;
import com.ibe.common.envInfo.OsInfo;

import java.net.NetworkInterface;
import java.util.Enumeration;

public class IbeApplication {
    public static void main(String[] args) throws Exception {
        JavaEnvInfo javaEnvInfo = EnvInfoGet.getJavaEnvInfo();
        System.out.println(javaEnvInfo);
       /* Test envSingleton = Test.EnvSingleton;
        envSingleton.testEnvSing();

        Constructor<Test> constructor = Test.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Test test = constructor.newInstance();*/
        OsInfo osInfo = EnvInfoGet.getOsInfo();
//        String address = InetAddress.getLocalHost().getHostAddress().toString();
        Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
        System.out.println(networkInterfaces);

    }

}




