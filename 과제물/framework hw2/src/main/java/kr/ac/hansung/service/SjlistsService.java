package kr.ac.hansung.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.hansung.dao.SjlistDAO;
import kr.ac.hansung.model.Sjlist2;

@Service
public class SjlistsService {

	private SjlistDAO sjlistDao;
	
	@Autowired
	public void setSjlistDao(SjlistDAO sjlistDao) {
		this.sjlistDao = sjlistDao;
	}
	
	public List<Sjlist2> getCurrent(){
		return sjlistDao.getSubjects();
	}
	
	public List<Sjlist2> getSjectweights1(String year){
		return sjlistDao.getSubjectweights1(year);
	}
	public List<Sjlist2> getSjectweights2(String year){
		return sjlistDao.getSubjectweights2(year);
	}
	public List<Sjlist2> getSubjectup(){
		return sjlistDao.getSubjectup();
	}
	public void insert(Sjlist2 list1){
		sjlistDao.insert(list1);
	}
	
}
