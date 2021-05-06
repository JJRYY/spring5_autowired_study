package spring5_autowired_study.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import spring5_autowired_study.di.ChangePasswordService;
import spring5_autowired_study.di.MemberDao;
import spring5_autowired_study.di.MemberInfoPrinter;
import spring5_autowired_study.di.MemberListPrinter;
import spring5_autowired_study.di.MemberPrinter;
import spring5_autowired_study.di.MemberPrn1;
import spring5_autowired_study.di.MemberPrn2;
import spring5_autowired_study.di.MemberRegisterService;
import spring5_autowired_study.di.VersionPrinter;

@Configuration
public class AppCtx {
	
	@Bean
	public MemberDao memberDao() {
		return new MemberDao();
	}
	
	@Bean
	public MemberRegisterService memberRegSvc() {
		return new MemberRegisterService();
	}
	
	@Bean
	public ChangePasswordService changePwdSvc() {
		ChangePasswordService pwdSvc = new ChangePasswordService();
		// 의존을 주입하지 않아도 스프링이 @Autowired가 붙인 필드에 해당 타입의 빈 객체를 찾아서 주입.
//		pwdSvc.setMemberDao(memberDao());
		return pwdSvc;
	}
	
//	@Bean
//	public MemberSelectAllService selectAllSvc() {
//		return new MemberSelectAllService(memberDao());
//	}
	
	@Bean
	public MemberPrinter memberPrinter() {
		return new MemberPrinter();
	}
	
	@Bean
	@Qualifier("printer1")
	public MemberPrinter memberPrinter1() {
		return new MemberPrn1();
	}
	
	@Bean
	@Qualifier("printer2")
	public MemberPrinter memberPrinter2() {
		return new MemberPrn2();
	}
	
	@Bean
	public MemberListPrinter listPrinter() {
		return new MemberListPrinter();
	}
	
	@Bean
	public MemberInfoPrinter infoPrinter() {
		MemberInfoPrinter infoPrinter = new MemberInfoPrinter();
//		infoPrinter.setMemberDao(memberDao());
//		infoPrinter.setPrinter(memberPrinter());
		return infoPrinter;
	}
	
	@Bean
	public VersionPrinter versionPrinter() {
		VersionPrinter versionPrinter = new VersionPrinter();
		versionPrinter.setMajorVersion(5);
		versionPrinter.setMinorVersion(0);
		return versionPrinter;
	}
}
