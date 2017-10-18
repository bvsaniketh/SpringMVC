package userpackage;

import org.apache.ibatis.session.SqlSession;

public class UserDAO {

	public static UserBean selectdata(int id)
	{
		SqlSession session=MyBatisUtility.getSqlSessionFactory().openSession();
		UserBean student=session.selectOne("com.UserDetails.Mapper.getAllUsers",id);
		session.close();
		return student;
		
	}
}
