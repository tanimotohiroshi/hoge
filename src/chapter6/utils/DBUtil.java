package chapter6.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import chapter6.exception.SQLRuntimeException;

// DB(コネクション関係)のユーティリティ

public class DBUtil {

	private static final String driver = "com.mysql.jdbc.Driver";
	private static final String url = "jdbc:mysql://localhost:3306/simpletwitter";
	private static final String user = "root";
	private static final String password = "aT17830207";

	static{
		try{
			Class.forName(driver);
		}catch (ClassNotFoundException e){
			throw new RuntimeException(e);
		}
	}
//	コネクションを取得
	public static Connection getConnection() {
		try {
			Connection connection = DriverManager.getConnection(url, user, password);
			connection.setAutoCommit(false);
			return connection;
		}catch(SQLException e){
			throw new SQLRuntimeException(e);
		}
	}

//	ここからコミット

	public static void commit(Connection connection){
		try{
			connection.commit();
		}catch(SQLException e){
			throw new SQLRuntimeException(e);
		}
	}

//	ロールバック

	public static void rollback(Connection connection){
		try{
			connection.rollback();
		}catch(SQLException e){
			throw new SQLRuntimeException(e);
		}
	}
}
