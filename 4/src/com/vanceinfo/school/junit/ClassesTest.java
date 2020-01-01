package com.vanceinfo.school.junit;




import junit.framework.TestCase;

public class ClassesTest extends TestCase {

	// 向专业里面 添加班级

	// public void testAddClasses() {
	// Session session = HibernateUtils.getSession();
	// try {
	// session.beginTransaction();
	// Classes classes = new Classes();
	// classes.setId(1);
	// classes.setClassesNo("电子3班");
	// classes.setProfessions((Professions) session.get(Professions.class,
	// 6)); // 讲4B051113班级 添加到 计算机系里
	// // classes.setTeacher((Teacher) session.get(Teacher.class, 3));
	// session.save(classes);
	// session.getTransaction().commit();
	// } catch (Exception e) {
	// e.printStackTrace();
	// session.getTransaction().rollback();
	// } finally {
	// HibernateUtils.closeSession(session);
	// }
	// }

	// 查询班级信息
//	public void testQueryClasses() {
//		Session session = HibernateUtils.getSession();
//		try {
//			session.beginTransaction();
//			Classes classes = (Classes) session.get(Classes.class, 5);
//			System.out.println("班级编号：" + classes.getClassesNo());
//
//			// 向上查询 该班级属于那个专业
//			System.out.println("所属专业：" + classes.getProfessions().getName());
//
//			// 向下查询 班级下多少个学生
//			Set<Student> student = classes.getStudents();
//			Iterator<Student> iterator = student.iterator();
//			System.out.print(classes.getClassesNo() + "班级有如下学生：");
//			while (iterator.hasNext()) {
//				Student studentAll = iterator.next();
//				System.out.print(studentAll.getName() + " ");
//			}
//
//			session.getTransaction().commit();
//		} catch (Exception e) {
//			e.printStackTrace();
//			session.getTransaction().rollback();
//		} finally {
//			HibernateUtils.closeSession(session);
//		}
//	}

}
