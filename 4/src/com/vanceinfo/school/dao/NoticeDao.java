package com.vanceinfo.school.dao;

import java.util.List;

import com.vanceinfo.school.hibernate.pojo.Notice; 

public interface NoticeDao {

	public boolean addNotice(Notice notice) throws Exception; // 增加公告

	public boolean delNotice(int id) throws Exception; //根据公告id删除公告
	
	public Notice findNotice(int id) throws Exception; // 根据学院Id找到notice对象

	public boolean updateNotice(Notice notice) throws Exception; // 修改公告信息 

	public List<Notice> queryAllNotice() throws Exception; // 列出全部的公告  
	
	
}
