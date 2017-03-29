package cloud.simple.service.web;

import java.util.List;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cloud.simple.service.domain.UserService;
import cloud.simple.service.model.User;

@RestController
@RequestMapping(value ="test")
//@Api(value = "springCloud")
public class UserController {

	@Autowired
	UserService userService;
	
	@RequestMapping(value="/user",method=RequestMethod.GET)
	public List<User> readUserInfo(){
		List<User> ls=userService.searchAll();		
		return ls;
	}
}
