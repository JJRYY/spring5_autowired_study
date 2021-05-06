package spring5_autowired_study.di;

@SuppressWarnings("serial")
public class DuplicateMemberException extends RuntimeException {

	public DuplicateMemberException(String message) {
		super(message);
	}

}
