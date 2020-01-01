package com.vanceinfo.school.untils;

import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

public class CreateTables {

	/**
	 * @创建数据表
	 */
	public static void main(String[] args) {
		
		//读取配置文件
		Configuration cfg = new Configuration().configure();
		
		//创建SchemaExport对象
		SchemaExport export = new SchemaExport(cfg);
		
		//创建数据库表
		export.create(true,true);
		
		//创建初始化数据   
        new InitData();
	}

}
