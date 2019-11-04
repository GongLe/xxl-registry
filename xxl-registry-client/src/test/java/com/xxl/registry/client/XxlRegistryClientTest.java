package com.xxl.registry.client;

import com.xxl.registry.client.XxlRegistryClient;
import com.xxl.registry.client.model.XxlRegistryParam;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

/**
 * @Auther: viagra
 * @Date: 2019/11/4 10:29
 * @Description:
 */
public class XxlRegistryClientTest {

    public static void main(String[] args) throws InterruptedException {
//        XxlRegistryClient registryClient = new XxlRegistryClient("http://localhost:8080/xxl-registry-admin/", "xxl-rpc", "test");
        XxlRegistryClient registryClient = null;

        // registry test
        List<XxlRegistryParam> registryParamList = new ArrayList<>();
        registryParamList.add(new XxlRegistryParam("service01", "address01"));
        registryParamList.add(new XxlRegistryParam("service02", "address02"));
        System.out.println("registry:" + registryClient.registry(registryParamList));
        TimeUnit.SECONDS.sleep(2);

        // discovery test
        Set<String> keys = new TreeSet<>();
        keys.add("service01");
        keys.add("service02");
        System.out.println("discovery:" + registryClient.discovery(keys));

        while (true) {
            TimeUnit.SECONDS.sleep(1);
        }

    }
    @Test
    public void registryTest(){
        XxlRegistryClient client = new XxlRegistryClient();
        List<XxlRegistryParam> registryParamList = null;
        boolean flag = client.registry(registryParamList);
        Assert.assertTrue("it is true", flag);
    }








}
