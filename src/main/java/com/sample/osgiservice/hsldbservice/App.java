package com.sample.osgiservice.hsldbservice;

import javax.sql.DataSource;
import org.hsqldb.jdbc.JDBCDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	DataSource ds=null;
    	JDBCDriver jds=null;
        System.out.println( "Hello World!"+ds );
        System.out.println( "Hello World!"+jds );
    }
}
