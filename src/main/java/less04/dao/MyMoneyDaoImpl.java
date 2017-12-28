package less04.dao;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import less04.MyMoneyDao;
/**
 * save*
 * update*
 * delete*
 * @author Administrator
 *
 */
@Repository
public class MyMoneyDaoImpl implements MyMoneyDao  {
	@Autowired
	JdbcTemplate jdbc;
	
	public  void updateAminus(int money) throws SQLException{
		String sql="update mymoney set lostedmoney=lostedmoney-"+money+" where userName='A'";
		jdbc.execute(sql);
	}
	
	public  void updateBadd(int money) throws SQLException{
		String sql="update mymoney set lostedmoney=lostedmoney+"+money+" where userName='B'";
		jdbc.execute(sql);
	}
}
