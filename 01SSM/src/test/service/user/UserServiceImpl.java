package test.service.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import test.mapper.user.UserMapper;
import test.pojo.user.UserPojo;

@Service
public class UserServiceImpl implements IUserService{
	
	@Autowired
	private UserMapper userMapper;

	@Transactional
	public UserPojo CheakUserService(UserPojo user) {	
		return userMapper.CheckUserDao(user) ;
	}

	public Boolean EditPwdByNameService(UserPojo user) {
		if(userMapper.EditPwdByNameDao(user) > 0){
			return true;
		}else{
			return false;
		}	
	}

	public Boolean RegisterUserService(UserPojo user) {
		if(userMapper.RegisterUserDao(user) > 0){
			return true;
		}else{
			return false;
		}
	}

	@Transactional(rollbackFor = Exception.class)
	public Integer delUser(Integer id) {
		userMapper.RegisterUserDao(new UserPojo("zs",123));
		return userMapper.delUser(id);
	}

}
