/**   
* @Title: UserController.java 
* @Package com.rmbih.controller 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Rex   
* @date 2016年5月28日 上午11:01:03 
* @version V1.0   
*/
package com.rmbih.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rmbih.model.RmbihUserT;
import com.rmbih.service.IUserService;

/**
 * @ClassName: UserController
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Rex
 * @date 2016年5月28日 上午11:01:03
 * 
 */

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private IUserService userService;

	@RequestMapping("/showUser")
	public String toIndex(HttpServletRequest request, Model model) {
		int userId = Integer.parseInt(request.getParameter("id"));
		RmbihUserT user = this.userService.getUserById(userId);
		model.addAttribute("user", user);
		return "showUser";
	}
}
