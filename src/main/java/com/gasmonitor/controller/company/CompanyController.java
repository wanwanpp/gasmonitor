package com.gasmonitor.controller.company;import org.springframework.stereotype.Controller;import org.springframework.web.bind.annotation.RequestMapping;/** * Created by Pandaroid on 2017/6/25. */@Controller@RequestMapping(value = "company")public class CompanyController {    @RequestMapping(value = "tenant")    public String setting() {        return "company/tenant";    }    }