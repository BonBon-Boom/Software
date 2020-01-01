package com.vanceinfo.school.untils;

import java.sql.*;
/**
 * @author 作者 :cody
 * @version 创建时间：Jan 8, 2010 10:22:58 AM
 * @explanation 类说明：
 */
public class DBCon  {

	/**
	 *@说明：如果使用那个数据库连接，请直接将该连接是方法名更改为getConnection即可
	 */
	
	
	//连接sqlserver数据库
	public Connection getConnection() {

		Connection con = null;
		try {
			Class.forName( "com.microsoft.jdbc.sqlserver.SQLServerDriver");
			con = DriverManager.getConnection("jdbc:microsoft:sqlserver://localhost:1433;DatabaseName=scms_project", "sa", "");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
	
	//连接Mysql数据库
	public Connection getConnection2() {

		Connection con = null;
		try {
			Class.forName( "com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost/scms_project", "root", "mysql");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
	
	
	//连接Oracle数据库
	public Connection getConnection3() {

		Connection con = null;
		try {
			Class.forName( "oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:pxjc", "pxjc", "123");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
	
	
	
	
	public static void main(String[] args) {
		Connection con = new DBCon().getConnection( );
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from T_Admin");
			System.out.println("---------Sql Server2000数据库连接测试----------");
			while (rs.next()) {
				System.out.println(rs.getString(2));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
