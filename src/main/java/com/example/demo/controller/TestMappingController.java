package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("test")
public class TestMappingController {
  
  @GetMapping
  public String testRequestController() {
    return "Hello first testRequest Mapping";
  }

  @GetMapping("/testGetMapping")
  public String testGetController() {
    return "Hello second testGet Mapping";
  }

  @GetMapping("/{id}")
  public String testPathController(@PathVariable(required = false) int id) {
      return "Hello PathVariable " + id;
  }

  @GetMapping("/testRequestParam")
  public String testParamController(@RequestParam(required = false) int id) {
      return "Hello PathVariable " + id;
  }
  
}
