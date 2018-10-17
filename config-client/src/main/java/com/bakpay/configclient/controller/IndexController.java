package com.bakpay.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class IndexController {

    @Value("${project.name}")
    private String projectName;

    @RequestMapping("getProjectName")
    public String getProjectName() {
      return   "this project name is :"+projectName;
    }
}
