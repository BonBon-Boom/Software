package com.vanceinfo.school.dao;

import java.util.List;

import com.vanceinfo.school.hibernate.pojo.Score;

;

public interface ScoreDao {

	public boolean delCourse(Score course) throws Exception; // 删除分数

	public boolean updateScore(Score course) throws Exception; // 给学生打分

	public List<Score> Query_all() throws Exception; // 遍历查询

	public List<Score> Query_one(Score course) throws Exception; // 条件查询

	public List<Score> Query_one(String sql) throws Exception; // sql查询
	
	public void delCourse(Integer stuid) ; //通过学员ID找到已选择的课程
	
	public Score getScore(Integer stuId, Integer courseId,Integer state,Integer score);   //对学生成绩进行评分
	
	public Score getScore(Integer stuId, Integer courseId, Integer state,
			Integer score,String enScore);//教师成绩签名
}
