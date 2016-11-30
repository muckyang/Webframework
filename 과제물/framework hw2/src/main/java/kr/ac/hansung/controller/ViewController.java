package kr.ac.hansung.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.ac.hansung.model.Sjlist2;
import kr.ac.hansung.service.SjlistsService;

@Controller
@RequestMapping("/view")
public class ViewController {
	
	private SjlistsService listsService;
	@Autowired
	public void setListsService(SjlistsService listsService) {
		this.listsService = listsService;
	}
	
	@RequestMapping("/2012/1")
	public String Viewlist(Model model){
		List<Sjlist2> sjlist= listsService.getSjectweights1("2012");
		model.addAttribute("sjlist",sjlist);
		return "viewlist";
	}
	
	@RequestMapping("/2012/2")
	public String Viewlist2(Model model){
		List<Sjlist2> sjlist= listsService.getSjectweights2("2012");
		model.addAttribute("sjlist",sjlist);
		return "viewlist";
	}
	
	@RequestMapping("/2015/1")
	public String Viewlist3(Model model){
		List<Sjlist2> sjlist= listsService.getSjectweights1("2015");
		model.addAttribute("sjlist",sjlist);
		return "viewlist";
	}
	
	@RequestMapping("/2015/2")
	public String Viewlist4(Model model){
		List<Sjlist2> sjlist= listsService.getSjectweights2("2015");
		model.addAttribute("sjlist",sjlist);
		return "viewlist";
	}
	
	@RequestMapping("/2016/1")
	public String Viewlist5(Model model){
		List<Sjlist2> sjlist= listsService.getSjectweights1("2016");
		model.addAttribute("sjlist",sjlist);
		return "viewlist";
	}
	
	
	
}
