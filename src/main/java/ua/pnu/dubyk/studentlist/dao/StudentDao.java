package ua.pnu.dubyk.studentlist.dao;

import java.util.List;
import ua.pnu.dubyk.studentlist.model.Student;

public interface StudentDao {

	/*
	 * CREATE and UPDATE
	 */
	public void saveBook(Student student); // create and update

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
