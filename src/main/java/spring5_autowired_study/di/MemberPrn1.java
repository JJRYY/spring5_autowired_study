package spring5_autowired_study.di;

public class MemberPrn1 extends MemberPrinter {

	@Override
	public void print(Member member) {
		System.out.printf("회원 정보 : 아이디=%d, 이메일=%s%n",
				member.getId(), member.getEmail());
	}

}
