//$Id$
//EJB3 Specification Copyright 2004, 2005 Sun Microsystems, Inc.
package javax.persistence;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.RetentionPolicy.*;
import static java.lang.annotation.ElementType.*;


/**
 * @author Emmanuel Bernard
 */
@Target({TYPE, METHOD, FIELD}) @Retention(RUNTIME)
public @interface AttributeOverride {
	String name();
	Column column();
}