package com.zhuyc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Title:<br>
 * Description:<br>
 * Copyright: Copyright (c) 2019<br>
 * Company: 北京云杉世界信息技术有限公司<br>
 *
 * @author zhuyongchang
 * @date 2019年05月22日
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.zhuyc")
public class Entry {
    public static void main(String[] args) {
        SpringApplication.run(Entry.class, args);
    }
}
