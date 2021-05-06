package spring5_autowired_study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import spring5_autowired_study.di.MemberDao;
import spring5_autowired_study.di.MemberPrinter;

@Configuration
public class AppConf1 {
	@Bean
	public MemberDao memberDao() {
		return new MemberDao();
	}
	
	@Bean 
	public MemberPrinter memberprinter() {
		return new MemberPrinter();
	}
}
