package com.yc.clw.biz;

import java.util.Date;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yc.clw.bean.ClwNews;
import com.yc.clw.bean.ClwNewsExample;
import com.yc.clw.dao.ClwNewsMapper;

@Service
public class NewsBiz {

	@Resource
	ClwNewsMapper cnm;
	
	public void create(ClwNews clwnews) throws BizException{
		ClwNewsExample cNewsExample = new ClwNewsExample();
		cNewsExample.createCriteria().andTitleEqualTo(clwnews.getTitle());
		if(cnm.countByExample(cNewsExample) > 0)
		{
			throw new BizException("该文章已经被创建");
		}
		
		cnm.insert(clwnews);
	}
	
}
