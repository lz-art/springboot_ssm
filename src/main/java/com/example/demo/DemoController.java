package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private static final Logger log= LoggerFactory.getLogger(DemoController.class);
  @RequestMapping("test")
    public String  test(){
      log.trace("跟踪级别--");
      log.debug("==Bug级别--");
      log.info("Info");
      log.warn("warn..");
      log.error("error..级别");
        return "欢迎来到spring boot  我是要成为海贼王的男人";
    }
}
