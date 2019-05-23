package com.zhuyc.service;

import com.zhuyc.dao.UserRepository;
import com.zhuyc.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Title:<br>
 * Description:<br>
 * Copyright: Copyright (c) 2019<br>
 * Company: 北京云杉世界信息技术有限公司<br>
 *
 * @author zhuyongchang
 * @date 2019年05月22日
 */
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User findUserByName(String name) {
        User user = null;
        try {
            user = userRepository.findByUserName(name);
        } catch (Exception e) {

        }
        return user;
    }
}
