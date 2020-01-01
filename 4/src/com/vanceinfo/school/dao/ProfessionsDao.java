package com.vanceinfo.school.dao;

import java.util.List;
import java.util.Set; 

import com.vanceinfo.school.hibernate.pojo.Classes;
import com.vanceinfo.school.hibernate.pojo.Collage;
import com.vanceinfo.school.hibernate.pojo.Professions;

public interface ProfessionsDao {

	public boolean addProfessions(Professions professions,Collage collage) throws Exception; // 添加专业

	public boolean delProfessions(Professions professions) throws Exception; // 删除专业

	public boolean updateProfessions(Professions professions,Collage collage) throws Exception; // 更新专业信息

	public List<Professions> Query_all() throws Exception; // 遍历查询

	public Set<Classes> hasClasses(Professions professions)
			throws Exception; // 条件查询

	public List<Professions> Query_one(String sql) throws Exception; // sql查询
	public void Add(Professions professions);
	

	public Professions findProfessions(Integer id) throws Exception; // 根据Id找到对象
	
	// 删除专业
	public boolean del(Integer id) throws Exception ;

}
