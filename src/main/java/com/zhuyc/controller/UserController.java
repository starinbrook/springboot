package com.zhuyc.controller;

import com.zhuyc.entity.User;
import com.zhuyc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Title:<br>
 * Description:<br>
 * Copyright: Copyright (c) 2019<br>
 * Company: 北京云杉世界信息技术有限公司<br>
 *
 * @author zhuyongchang
 * @date 2019年05月22日
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/index")
    public String index() {
        return "/user/index";
    }

    @RequestMapping(value = "/show")
    @ResponseBody
    public String show(@RequestParam(value = "name") String name) {
        User user = userService.findUserByName(name);
        if (null != user) {
            return user.getId() + "/" + user.getName() + "/" + user.getPassword();
        } else {
            return "null";
        }
    }
}
