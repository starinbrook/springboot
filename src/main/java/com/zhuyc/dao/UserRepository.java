package com.zhuyc.dao;

import com.zhuyc.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Title:<br>
 * Description:<br>
 * Copyright: Copyright (c) 2019<br>
 * Company: 北京云杉世界信息技术有限公司<br>
 *
 * @author zhuyongchang
 * @date 2019年05月22日
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    @Query("select t from User t where t.name = :name")
    User findByUserName(@Param("name") String name);
}
