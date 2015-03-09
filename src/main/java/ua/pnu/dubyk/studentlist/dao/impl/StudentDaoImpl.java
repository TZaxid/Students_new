package ua.pnu.dubyk.studentlist.dao.impl;

import java.util.List;

import ua.pnu.dubyk.studentlist.dao.StudentDao;
import ua.pnu.dubyk.studentlist.model.Student;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDaoImpl implements StudentDao {

	@Autowired
	private SessionFactory sessionFactory;

	public void saveBook(Student student) {
		getSession().merge(student);

	}

	@SuppressWarnings("unchecked")
	public List<Student> listBooks() {

		return getSession().createCriteria(Student.class).list();
	}

	public Student getBook(Long id) {
		return (Student) getSession().get(Student.class, id);
	}

	public void deleteBook(Long id) {

		Student student = getBook(id);

		if (null != student) {
			getSession().delete(student);
		}

	}

	private Session getSession() {
		Session sess = getSessionFactory().getCurrentSession();
		if (sess == null) {
			sess = getSessionFactory().openSession();
		}
		return sess;
	}

	private SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}
