package com.createiq.sms.queries;

public interface Queries {

	String STU_INSERT = "INSERT INTO STUDENT VALUES(?,?,?)";
	String STU_FIND_ALL = "SELECT * FROM STUDENT";
	String STU_FIND_BY_ID = "SELECT * FROM STUDENT WHERE SID = ?";
	String STU_UPDATE = "UPDATE STUDENT SET SNAME = ?, SFEE = ? WHERE SID = ?";
	String STU_DELETE_BY_ID = "DELETE FROM STUDENT WHERE SID  = ?";

}
