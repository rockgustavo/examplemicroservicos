package com.rockgustavo.product_api.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api")
@Slf4j
public class StatusController {

    @GetMapping("status")
    public String status() {
        log.info("Obtendo o status do microservice de products");
        return "MicroServiços de Produtos";
    }

}
