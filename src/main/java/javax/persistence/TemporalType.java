//$Id$
//EJB3 Specification Copyright 2004-2006 Sun Microsystems, Inc.
package javax.persistence;

/**
 * Type used to indicate a specific mapping of {@link java.util.Date} or {@link java.util.Calendar).
 */
public enum TemporalType {
	/**
	 * Map as java.sql.Date
	 */
	DATE,
	/**
	 * Map as java.sql.Time
	 */
	TIME,
	/**
	 * Map as java.sql.Timestamp
	 */
	TIMESTAMP
}