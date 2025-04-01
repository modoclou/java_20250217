package com.company.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository	//1. 스프링이 관리하는 부품객체 - dao	- @Component
public class TestDaoImpl implements TestDao {
	@Autowired private SqlSession sqlSession;
	//2. crud(insert, update, delete, select)
	private static final String namespace="com.company.dao.TestDao";
	
	//<select id="readTime" resultType="string">
	@Override
	public String readTime() { return sqlSession.selectOne(namespace + ".readTime"); }
	
	// sqlSession.insert(경로의 메서드명, dto)
	// sqlSession.update(경로의 메서드명, dto)
	// sqlSession.delete(경로의 메서드명, no)
	// sqlSession.selectOne(경로의 메서드명, no) - 필요하면 파라미터 입력
	// sqlSession.selectList(경로의 메서드명, no)
}
