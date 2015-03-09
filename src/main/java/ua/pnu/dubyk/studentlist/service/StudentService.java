package ua.pnu.dubyk.studentlist.service;

import java.util.List;

import ua.pnu.dubyk.studentlist.model.Student;

public interface StudentService {

	/*
	 * CREATE and UPDATE 
	 */
	public void saveBook(Student student);

	/*
	 * READ
	 */
	public List<Student> listBooks();
	public Student getBook(Long id);

	/*
	 * DELETE
	 */
	public void deleteBook(Long id);

}
