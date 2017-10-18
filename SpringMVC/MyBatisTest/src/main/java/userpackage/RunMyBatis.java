package userpackage;

public class RunMyBatis {

	public static void main(String[] args) {
		
		UserDAO udao=new UserDAO();
		UserBean user=new UserBean();
		user=udao.selectdata(1);
		System.out.println("id:"+user.getId()+", Name:"+user.getName()+", District:"+user.getCity());
	}

}
