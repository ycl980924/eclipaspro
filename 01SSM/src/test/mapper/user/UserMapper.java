package test.mapper.user;

import test.pojo.user.UserPojo;

public interface UserMapper {
	
	UserPojo CheckUserDao(UserPojo user);
	Integer EditPwdByNameDao(UserPojo user);
	Integer RegisterUserDao(UserPojo user);
	Integer delUser(Integer id);
	
}
