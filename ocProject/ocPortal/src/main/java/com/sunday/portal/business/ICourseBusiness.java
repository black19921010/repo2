package com.sunday.portal.business;

import java.util.List;

import com.online.college.portal.vo.CourseSectionVO;
import com.sunday.portal.vo.CourseSectionVO;

public interface ICourseBusiness {

	/**
	 * 获取课程章节
	 */
	List<CourseSectionVO> queryCourseSection(Long courseId);
	
}
