package com.sunday.opt.business;

import java.util.List;

import com.sunday.opt.vo.CourseSectionVO;

public interface ICourseBusiness {

	/**
	 * 获取课程章节
	 */
	List<CourseSectionVO> queryCourseSection(Long courseId);
	
}
