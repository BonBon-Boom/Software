package com.vanceinfo.school.dao;

import java.util.List;
import com.vanceinfo.school.hibernate.pojo.Collage;

public interface CollageDao {

	public boolean addCollage(Collage collage) throws Exception; // 增加学院

	public boolean delCollage(int id) throws Exception; // 根据学院Id删除学院

	public Collage findCollage(int id) throws Exception; // 根据学院Id找到Collage对象
	
	public boolean updateCollage(Collage collage) throws Exception;  //更新学院信息

	public List<Collage> queryAllCollage() throws Exception; //列出所有学院

	public List<Collage> Query_one(String sql) throws Exception; // 条件查询

}
