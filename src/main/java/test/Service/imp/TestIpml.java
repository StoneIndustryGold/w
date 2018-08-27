package test.Service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import test.Service.TestService;
import test.mapper.TestMapper;
import test.model.TestModel;
@Service
public class TestIpml implements TestService {
	private TestMapper testMapper;
	
	@Autowired
	public TestIpml(TestMapper testMapper) {
		this.testMapper = testMapper;
	}


	@Override
	public List<TestModel> FinAll() {
		
		return testMapper.FinAll();
	}

}
