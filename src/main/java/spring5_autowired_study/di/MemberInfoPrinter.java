package spring5_autowired_study.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class MemberInfoPrinter {
	private MemberDao memDao;
	private MemberPrinter printer;

	public void MemberInfoPrinter(String email) {
		Member member = memDao.selectByEmail(email);
		if (member == null) {
			System.out.println("데이터 없음\n");
			return;
		}
		printer.print(member);
		System.out.println();
	}

	@Autowired
	public void setMemberDao(MemberDao memDao) {
		this.memDao = memDao;
	}

	@Autowired
	@Qualifier("printer1")
	public void setPrinter(MemberPrinter printer) {
		this.printer = printer;
	}

}
