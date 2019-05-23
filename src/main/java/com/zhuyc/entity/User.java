package com.zhuyc.entity;

import javax.persistence.*;

/**
 * Title:<br>
 * Description:<br>
 * Copyright: Copyright (c) 2019<br>
 * Company: 北京云杉世界信息技术有限公司<br>
 *
 * @author zhuyongchang
 * @date 2019年05月22日
 */
@Entity
@Table(name = "tbl_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private String password;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
