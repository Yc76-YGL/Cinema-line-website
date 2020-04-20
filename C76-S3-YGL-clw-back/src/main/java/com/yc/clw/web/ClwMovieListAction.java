package com.yc.clw.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageHelper;
import com.yc.clw.bean.ClwMovielist;
import com.yc.clw.bean.ClwMovielistExample;
import com.yc.clw.dao.ClwMovielistMapper;

@RestController
public class ClwMovieListAction {

	@Resource
	private ClwMovielistMapper cmlm;
	
	@GetMapping("getClwMovielist")
	public List<ClwMovielist> getClwMovielist(){
		ClwMovielistExample cmle =new ClwMovielistExample();
		cmle.createCriteria().andIdIsNotNull();
		List<ClwMovielist> list = cmlm.selectByExample(cmle);
		return list;
	}
	
	/**
	 * 查询最近的六部电影
	 * @return
	 */
	@GetMapping("getnewmovie")
	public List<ClwMovielist> getnewmovie(){
		ClwMovielistExample cmle =new ClwMovielistExample();
		cmle.setOrderByClause("id desc");
		PageHelper.startPage(1,6);
		List<ClwMovielist> list = cmlm.selectByExample(cmle);
		return list;
	}
	
	@GetMapping("getgenresmovie")
	public List<ClwMovielist> getgenresmovie(@RequestParam("id")Integer id){
		ClwMovielistExample cmle =new ClwMovielistExample();
		cmle.createCriteria().andGenersLike(id.toString());
		List<ClwMovielist> list = cmlm.selectByExample(cmle);
		return list;
	}
	
	@GetMapping("getcountrmovie")
	public List<ClwMovielist> getcountrmovie(@RequestParam("id")Integer id){
		ClwMovielistExample cmle =new ClwMovielistExample();
		cmle.createCriteria().andCountryEqualTo(id);
		List<ClwMovielist> list = cmlm.selectByExample(cmle);
		return list;
	}
	
	@GetMapping("seachmovie")
	public List<ClwMovielist> getseachmovie(@RequestParam("name")String name){
		ClwMovielistExample cmle =new ClwMovielistExample();
		cmle.createCriteria().andNameLike(name);
		List<ClwMovielist> list = cmlm.selectByExample(cmle);
		return list;
	}
	
	@GetMapping("getidmovie")
	public List<ClwMovielist> getnamemovie(@RequestParam("id")Integer id){
		ClwMovielistExample cmle =new ClwMovielistExample();
		cmle.createCriteria().andIdEqualTo(id);
		List<ClwMovielist> list = cmlm.selectByExample(cmle);
		return list;
	}
}