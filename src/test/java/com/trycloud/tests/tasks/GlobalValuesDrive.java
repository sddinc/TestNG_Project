package com.trycloud.tests.tasks;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class GlobalValuesDrive {
    private static Properties properties;
    private static FileInputStream file;

    static {
        properties = new Properties();
        try {
            file = new FileInputStream("configuration.properties");
            properties.load(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static String getProperties(String key) {
      return   properties.getProperty(key);

    }

    @Test
    public void test(){
        System.out.println(GlobalValuesDrive.getProperties("browser"));

    }

}
