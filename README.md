<p align="center">
    <img src="https://raw.githubusercontent.com/xuxueli/xxl-job/master/doc/images/xxl-logo.jpg" width="150">
    <h3 align="center">XXL-REGISTRY</h3>
    <p align="center">
        XXL-REGISTRY, A lightweight distributed service registry and discovery platform.
        <br>
        <a href="http://www.xuxueli.com/xxl-registry/"><strong>-- Home Page --</strong></a>
        <br>
        <br>
        <a href="https://travis-ci.org/xuxueli/xxl-registry">
            <img src="https://travis-ci.org/xuxueli/xxl-registry.svg?branch=master" >
        </a>
        <a href="https://hub.docker.com/r/xuxueli/xxl-registry-admin/">
            <img src="https://img.shields.io/badge/docker-passing-brightgreen.svg" >
        </a>
        <a href="https://maven-badges.herokuapp.com/maven-central/com.xuxueli/xxl-registry/">
            <img src="https://maven-badges.herokuapp.com/maven-central/com.xuxueli/xxl-registry/badge.svg" >
        </a>
        <a href="https://github.com/xuxueli/xxl-registry/releases">
            <img src="https://img.shields.io/github/release/xuxueli/xxl-registry.svg" >
        </a>
         <a href="http://www.gnu.org/licenses/gpl-3.0.html">
            <img src="https://img.shields.io/badge/license-GPLv3-blue.svg" >
         </a>
         <a href="http://www.xuxueli.com/page/donate.html">
            <img src="https://img.shields.io/badge/%24-donate-ff69b4.svg?style=flat-square" >
         </a>
    </p>    
</p>

## 引用
这个主要是想参考如何实现一个注册中心，具体的项目地址：https://github.com/xuxueli/xxl-registry

## Introduction

请查看`doc`目录下的介绍

要点：
1.在`xxl-registry-client` 子项目中，最重要的类是: `XxlRegistryClient.java`
2.在`xxl-registry-admin` 子项目中，最重要的类是：`XxlRegistryServiceImpl.java`

这两块都涉及了多线程的一些东西。
在`xxl-registry-client`中，启动了两个线程：一个是registryThread，一个是discoveryThread
在`xxl-registry-admin`中，通过ExecutorService，来启动10个线程。进行注册，发现，清除操作。