package com.jaceksysiak.tests;

import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.jaceksysiak.App;
import com.jaceksysiak.model.SiteUser;
import com.jaceksysiak.service.InterestService;
import com.jaceksysiak.service.ProfileService;
import com.jaceksysiak.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(App.class)
@WebAppConfiguration
@Transactional
public class ProfileTest {

	@Autowired 
	private UserService userService;
	
	@Autowired 
	private ProfileService profileService;
	
	@Autowired
	private InterestService interestService;
	
	private SiteUser[] users = {
		new SiteUser("ljlkj@jaceksysiak.com", "lkjlkjlk"),
		new SiteUser("dafdf@jaceksysiak.com", "gfhgfh"),
		new SiteUser("ghdgfhg@jaceksysiak.com", "wereretr")
	};
	
	private String[][] interests = {
			{"music", "guitar_xxxxxx", "plants"},
			{"music", "music", "philosophy_lkjlkjlk"},
			{"philosophy_lkjlkjlk", "football"}
};
	
	@Test
	public void testInterests() {
		
	}
}
