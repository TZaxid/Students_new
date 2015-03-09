package ua.pnu.dubyk.studentlist.service.impl;

import java.util.List;

import ua.pnu.dubyk.studentlist.dao.StudentDao;
import ua.pnu.dubyk.studentlist.model.Student;
import ua.pnu.dubyk.studentlist.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDao studentDao;

	@Transactional
	public void saveBook(Student student) {
		studentDao.saveBook(student);
	}

	@Transactional(readOnly = true)
	public List<Student> listBooks() {
		return studentDao.listBooks();
	}

	@Transactional(readOnly = true)
	public Student getBook(Long id) {
		return studentDao.getBook(id);
	}

	@Transactional
	public void deleteBook(Long id) {
		studentDao.deleteBook(id);

	}

}
