package de.herrmanno.jdbcorm.conf.sqlite;

import de.herrmanno.jdbcorm.JDBCORM;
import de.herrmanno.jdbcorm.conf.BaseConfig;
import de.herrmanno.jdbcorm.connectionsupplier.SingletonConnection;
import de.herrmanno.jdbcorm.queryhelper.QueryHelper;
import de.herrmanno.jdbcorm.queryhelper.sqlite.Sqlite_QueryHelper;
import de.herrmanno.jdbcorm.typehelper.TypeHelper;
import de.herrmanno.jdbcorm.typehelper.sqlite.Sqlite_TypeHelper;

public class Sqlite_Conf extends BaseConfig {

	private final QueryHelper queryHelper = new Sqlite_QueryHelper();
	private final TypeHelper typeHelper = new Sqlite_TypeHelper();
	private final String location;
	
	public Sqlite_Conf(String location) {
		this.location = location;
	}
	
	@Override
	public String getDriverClass() {
		return "org.sqlite.JDBC";
	}

	@Override
	public String getConnectionString() {
		return "jdbc:sqlite:" + location; 
	}
	
	@Override
	public QueryHelper getQueryHelper() {
		return queryHelper;
	}
	
	@Override
	public TypeHelper getTypeHelper() {
		return typeHelper;
	}

}
