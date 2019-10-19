package test.service.user;

import test.pojo.user.UserPojo;

public interface IUserService {
	
	UserPojo CheakUserService(UserPojo user);
	Boolean EditPwdByNameService(UserPojo user);
	Boolean RegisterUserService(UserPojo user);
	Integer delUser(Integer id);
	
}
