package dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import conn.ConnectionManager;
import vo.DeptVO;

public class DeptDAO {
	// connection ====== SqlSession
	private SqlSession ss = null;
	
	public DeptDAO() {
		SqlSessionFactory factory = ConnectionManager.getInstance().getFactory();
		ss = factory.openSession(true);
	}
	
	// 전체 조회
	public List<DeptVO> selectAll(){
		return ss.selectList("selectAllData");		
	}
	
	// 개별 조회
	public DeptVO selectOne(int deptno) {
		return ss.selectOne("selectOneByDept", deptno);
	}
	
	
	
}











