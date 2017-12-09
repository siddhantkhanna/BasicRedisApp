package com.siddhant.basicRedisApp.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;

import java.io.File;
import java.io.FileInputStream;

@Service
public class DataService {

    @Value("${redis.host}")
    private String redisHost;

    private Jedis jedis;

    public String getData() {
        initJedisDataIfNotAvailable();

        return jedis.get("data");
    }

    private void initJedisDataIfNotAvailable() {
        if (jedis == null) {
            int jedisTimeout = 30 * 60 * 1000; //30 minutes
            jedis = new Jedis(redisHost, 6379, jedisTimeout);
        }

        if (jedis.get("data") == null) {
            try {
                File file = new File(getClass().getClassLoader().getResource("data.json").getFile());
                FileInputStream fileInputStream = new FileInputStream(file);
                byte[] data = new byte[(int) file.length()];
                fileInputStream.read(data);
                fileInputStream.close();

                String str = new String(data, "UTF-8");

                jedis.set("data", str);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
