package general_utility;

import static io.restassured.RestAssured.*;

import java.sql.SQLClientInfoException;
import java.sql.SQLException;

import org.junit.After;
import org.junit.Before;
import org.testng.Reporter;

public class Baseclass_test {


	 private database_utility_test dLib = new database_utility_test();
		public java_utility_test jLib = new java_utility_test();
		public Restassured_library rLib = new Restassured_library();
		
		@Before
		public void bsConfig() throws SQLException
		{
			getdLib().connectToDB();
			Reporter.log("====Connection successful=====", true);
			baseURI = "http://localhost";
			port = 8084;
		}
		
		@After
		public void asConfig() throws SQLException
		{
			getdLib().closeDB();
			Reporter.log("=====connection closed====",true);
		}

		public database_utility_test getdLib() {
			return dLib;
		}

		public void setdLib(database_utility_test dLib) {
			this.dLib = dLib;
		}

	}
	