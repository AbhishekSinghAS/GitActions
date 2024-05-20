package com.Abhishek;
import org.junit.Before;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.*;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@ContextConfiguration(locations= {"file:src/main/webapp/WEB-INF/Abhishek-servlet.xml"})
@WebAppConfiguration()
public class ControllerTest {
	@Autowired
	private WebApplicationContext wac;
	private MockMvc mockMvc;
	
	@Before
	public void setUp() {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
	}

	@Test
	public void testAdd() throws Exception{
		for(int i=0 ; i < 100 ; i++)
			for(int j=0 ; j< 100; j++)
				mockMvc.perform(get("/Calculate?val1="+i+"&val2="+j+"&add=%2B"))
				.andExpect(status().isOk())
				.andExpect(view().name("AfterAddition.jsp"))
				.andExpect(model().attribute("Answer",i+j));
				
	}
	
	@Test
	public void testSubstraction() throws Exception{
		for(int i=0 ; i < 100 ; i++)
			for(int j=0 ; j< 100; j++)
				mockMvc.perform(get("/Calculate?val1="+i+"&val2="+j+"&difference=-"))
				.andExpect(status().isOk())
				.andExpect(view().name("AfterSubtraction.jsp"))
				.andExpect(model().attribute("Answer",i-j));
				
	}
	
	@Test
	public void testMultiplication() throws Exception{
		for(int i=0 ; i < 100 ; i++)
			for(int j=0 ; j< 100; j++)
				mockMvc.perform(get("/Calculate?val1="+i+"&val2="+j+"&multiply=X"))
				.andExpect(status().isOk())
				.andExpect(view().name("AfterMultiplication.jsp"))
				.andExpect(model().attribute("Answer",i*j));
	
	}
	
	@Test
	public void testDivision() throws Exception{
		for(int i=1 ; i < 100 ; i++)
			for(int j=1 ; j< 100; j++)
				mockMvc.perform(get("/Calculate?val1="+i+"&val2="+j+"&divide=%F7"))
				.andExpect(status().isOk())
				.andExpect(view().name("AfterDivision.jsp"))
				.andExpect(model().attribute("Answer",i/j));
	
	}
	
	
}
