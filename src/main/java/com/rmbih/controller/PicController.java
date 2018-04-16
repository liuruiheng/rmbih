/**   
* @Title: PicController.java 
* @Package com.rmbih.controller 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Rex   
* @date Jun 1, 2016 4:06:39 PM 
* @version V1.0   
*/
package com.rmbih.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rmbih.dao.RmbihPicTMapper;
import com.rmbih.model.RmbihPicT;
import com.rmbih.model.RmbihPicTExample;

/** 
* @ClassName: PicController 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author Rex 
* @date Jun 1, 2016 4:06:39 PM 
*  
*/
@Controller
@RequestMapping("/pic")
public class PicController {

	@Resource
	private RmbihPicTMapper rmbihPicTMapper;
	
	@RequestMapping(value="/getPicList", method=RequestMethod.GET)
	@ResponseBody
	public Map<String, List<RmbihPicT>> getPicList(int userId) {
		RmbihPicTExample rmbihPicTExample = new RmbihPicTExample();
		rmbihPicTExample.createCriteria().andDelsignEqualTo(0).andUserIdEqualTo(userId);
		List<RmbihPicT> list = rmbihPicTMapper.selectByExample(rmbihPicTExample);
		Map<String, List<RmbihPicT>> map = new HashMap<String, List<RmbihPicT>>();
		map.put("list", list);
		
		return map;
	}
	
	@RequestMapping(value="/getPicList1", method=RequestMethod.GET)
	@ResponseBody
	public List<Map<String, Object>> getPicList1(int userId) {
		List<Map<String, Object>> list = rmbihPicTMapper.getPicListAndUser(userId);
		return list;
	}
}
