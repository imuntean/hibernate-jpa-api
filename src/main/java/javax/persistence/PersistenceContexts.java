/* $Id$
 * JBoss Inc
 *
 * Distributable under LGPL license.
 * See terms of license at gnu.org.
 */
package javax.persistence;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Declares one or more PersistenceContext annotations. It is used to express a dependency on
 * container-managed entity manager persistence contexts.
 *
 * @author <a href="mailto:bill@jboss.org">Bill Burke</a>
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface PersistenceContexts {
	/**
	 * One or more persistence context
	 */
	PersistenceContext[] value();
}