package com.javalex.ex;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class MemberDao {
	public static final int MEMBER_NONEXISTENT=0;
	public static final int MEMBER_EXISTENT=1;
	public static final int MEMBER_JOIN_FAIL=0;
	public static final int MEMBER_JOIN_SUCCESS=1;
	public static final int MEMBER_LOGIN_PW_NO_GOOD=0;
	public static final int MEMBER_LOGIN_SUCCESS=1;
	public static final int MEMBER_LOGIN_IS_NOT=-1;
	
	private static MemberDao instance = new MemberDao();
	
	private MemberDao(){
	}
	public static MemberDao getInstance(){
		return instance;
	}
	public int insertMember(MemberDao dto){
		int ri=0;
		
		Connection connection=null;
		PreparedStatement pstmt=null;
		String query="insert into members values (?,?,?,?,?,?)";
		
		try{
			connection=
		}
	}
}
