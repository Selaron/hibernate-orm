/*
 * Hibernate, Relational Persistence for Idiomatic Java
 *
 * License: GNU Lesser General Public License (LGPL), version 2.1 or later
 * See the lgpl.txt file in the root directory or http://www.gnu.org/licenses/lgpl-2.1.html
 */
package org.hibernate.sql.ast.tree.from;

import org.hibernate.query.NavigablePath;

/**
 * @author Steve Ebersole
 */
public interface ColumnReferenceQualifier {
	TableReference resolveTableReference(NavigablePath navigablePath, String tableExpression);
	TableReference getTableReference(NavigablePath navigablePath, String tableExpression);
	default TableReference getTableReference(String tableExpression) {
		return getTableReference( null, tableExpression );
	}
}
