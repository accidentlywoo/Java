package spring;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class MemberInfoPrinter {
	
	//@Autowired(required=false)
	@Resource(name="memberDao")
	private MemberDao memDao;
	private MemberPrinter printer;
	
	@Autowired
	public void injectDependency(MemberDao memberDao,
			@Qualifier("sysout") MemberPrinter printer) {
		this.memDao = memberDao;
		this.printer = printer;
	}
	
	public void setMemberDao(MemberDao memberDao) {
		this.memDao = memberDao;
	}
	
	//@Autowired
	@Resource(name="memberPrinter")
	public void setPrinter(MemberPrinter printer) {
		this.printer = printer;
	}
	
	public void printMemberInfo(String email) {
		Member member = memDao.selectByEmail(email);
		if(member == null) {
			System.out.println("데이터 없음\n");
			return;
		}
		printer.print(member);
		System.out.println();
	}
}
