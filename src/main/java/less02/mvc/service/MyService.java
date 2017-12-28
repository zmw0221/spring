package less02.mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import less02.mvc.dao.Mydao;

@Service
public class MyService {
	@Autowired
	private Mydao mydao;
	public String query(String sql){
		return mydao.queryMyResult(sql).toString();
	}
}
