package de.herrmanno.jdbcorm.typehelper;

public abstract class TypeHelper {

	public abstract String getSQLType(Class<?> type) throws Exception;
	
	public abstract String getSQLValue(Class<?> type, Object value) throws Exception;
	
	public abstract <T> T getJavaValue(Class<?> targetClass, Object value) throws Exception;
}
