package site.zhangsun.springcloud.repository;

import site.zhangsun.springcloud.dataobject.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by 廖师兄
 * 2018-03-04 21:42
 */
public interface UserInfoRepostory extends JpaRepository<UserInfo, String> {

	UserInfo findByOpenid(String openid);
}
