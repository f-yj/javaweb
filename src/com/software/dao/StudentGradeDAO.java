package com.software.dao;

import java.util.List;

import com.software.entity.StudentGrade;

public interface StudentGradeDAO {
	public StudentGrade get(Long studentId, String courseName);
	
	public List<StudentGrade> getAll();
	
	public List<StudentGrade> getAllCourseGrade(Long studentId);
	
	public void insert(StudentGrade  studentGrade);
	
	public void update(StudentGrade  studentGrade);
	
	public void delete(Long studentId);
	
	/**
	 * ���غ�studentId��ȵļ�¼��
	 * @param name
	 * @return
	 */
	public Integer getCountWithStudentId(Long studentId);

	public List<StudentGrade> getAllWithYearTerm(Long studentId,
			String yearTerm);

	public void updateByStudentIdAndCourseName(StudentGrade studentGrade);

	

}