package conn;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import vo.DeptVO;

public class ConnTest {
	public static void main(String[] args) {
		SqlSessionFactory factory = ConnectionManager.getInstance().getFactory();
		
		System.out.println("factory : "+ factory);
		
		SqlSession ss = factory.openSession(true);
		
		List<DeptVO> list = ss.selectList("selectAllData");
		
		for(DeptVO vo : list) {
			System.out.println(vo.getDeptno()+"\t"+vo.getDname()+"\t"+vo.getLoc());
		}
		
		
		System.out.println("------------------------------");
		DeptVO vo2 = ss.selectOne("selectOneByDept", 10);
		System.out.println(vo2.getDeptno()+"\t"+vo2.getDname()+"\t"+vo2.getLoc());
		
		System.out.println("=================================");
		DeptVO vo3 = ss.selectOne("selectOnebyloc", "DALLAS");
		System.out.println(vo3.getDeptno()+"\t"+vo3.getDname()+"\t"+vo3.getLoc());
		
		
		
	}
}














