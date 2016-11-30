package kr.ac.hansung.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.ac.hansung.model.Sjlist2;
import kr.ac.hansung.service.SjlistsService;

@Controller
public class ListsController {

	private SjlistsService listsService;
	@Autowired
	public void setListsService(SjlistsService listsService) {
		this.listsService = listsService;
	}

	@RequestMapping("/list")
	public String showLists(Model model){
		
		List<Sjlist2> sjlist2 = listsService.getCurrent();
		model.addAttribute("sjlist2",sjlist2);
		
		return "list";
	}
	
	@RequestMapping("/list2")
	public String list2(Model model){
		List<Sjlist2> sjlist2 = listsService.getCurrent();
		model.addAttribute("sjlist2",sjlist2);
		return "list2";
	}
	
	@RequestMapping("/listin")
	public String listInsert(Model model){
		return "listin";
	}
	
	@RequestMapping("/listcheck")
	public String listCheck(Model model){
		List<Sjlist2> sjlist2 = listsService.getSubjectup();
		model.addAttribute("sjlist2",sjlist2);
		return "listcheck";
	}
	
	//2017년 수강신청
	@RequestMapping("/addlist")
	public String Addlist(Model model ,Sjlist2 list){
		listsService.insert(list);

		return "addok";
	}
	
}
