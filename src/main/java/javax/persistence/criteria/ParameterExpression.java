// $Id:$
// EJB3 Specification Copyright 2004-2009 Sun Microsystems, Inc.
package javax.persistence.criteria;

import javax.persistence.Parameter;


/**
 * Type of criteria query parameter expressions.
 * @param <T> the type of the parameter expression
 */
public interface ParameterExpression<T> extends Parameter<T>, Expression<T> {
}

