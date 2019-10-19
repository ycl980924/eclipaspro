package test.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import test.pojo.user.UserPojo;
import test.service.user.IUserService;

@Controller
public class UserController {
	
	@Autowired
	private IUserService  userService;
	
	@ResponseBody
	@RequestMapping(value = "/checkUser")
	public UserPojo checkUser(@RequestParam String username , @RequestParam Integer password){
//		UserPojo user = new UserPojo(map.get("username"),Integer.parseInt(map.get("password")));
		UserPojo user = new UserPojo(username,password);
		return userService.CheakUserService(user);
	}
	
	@ResponseBody
	@RequestMapping(value = "/editUser")
	public String editUser(@RequestBody Map<String , String> map){
		
		UserPojo user = new UserPojo(map.get("username"),Integer.parseInt(map.get("opassword")));
		if(userService.CheakUserService(user) != null){
			user.setPassword(Integer.parseInt(map.get("npassword")));
			if(userService.EditPwdByNameService(user)){
				return "1";
			}
		}
		return "-1";
	}	
	
	@ResponseBody
	@RequestMapping(value = "/registerUser")
	public String registerUser(@RequestBody Map<String , String> map){	
		UserPojo user = new UserPojo(map.get("username"),Integer.parseInt(map.get("password")));
		if(userService.RegisterUserService(user)){
			return "1";
		}
		return "-1";
	}
	
	@ResponseBody
	@RequestMapping(value = "/delUser")
	public Integer delUser(@RequestParam Integer id){	
		return userService.delUser(id);	
	}
}
