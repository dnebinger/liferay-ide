/*******************************************************************************
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *   
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *   
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 *    
 * Contributors:
 *               Kamesh Sampath - initial implementation
 *******************************************************************************/


package com.liferay.ide.portlet.core.model.lfrportlet610;

import org.eclipse.sapphire.java.JavaType;
import org.eclipse.sapphire.java.JavaTypeConstraint;
import org.eclipse.sapphire.java.JavaTypeKind;
import org.eclipse.sapphire.java.JavaTypeName;
import org.eclipse.sapphire.modeling.IModelElement;
import org.eclipse.sapphire.modeling.ModelElementType;
import org.eclipse.sapphire.modeling.ReferenceValue;
import org.eclipse.sapphire.modeling.ValueProperty;
import org.eclipse.sapphire.modeling.annotations.GenerateImpl;
import org.eclipse.sapphire.modeling.annotations.Label;
import org.eclipse.sapphire.modeling.annotations.MustExist;
import org.eclipse.sapphire.modeling.annotations.NoDuplicates;
import org.eclipse.sapphire.modeling.annotations.Reference;
import org.eclipse.sapphire.modeling.annotations.Required;
import org.eclipse.sapphire.modeling.annotations.Type;
import org.eclipse.sapphire.modeling.xml.annotations.XmlBinding;

/**
 * @author kamesh
 */
@GenerateImpl
public interface IAtomCollectionAdapter extends IModelElement {

	ModelElementType TYPE = new ModelElementType( IAtomCollectionAdapter.class );

	// *** AdapterClass ***
	@Type( base = JavaTypeName.class )
	@JavaTypeConstraint( kind = JavaTypeKind.CLASS, type = { "com.liferay.portal.kernel.atom.AtomCollectionAdapter" } )
	@Reference( target = JavaType.class )
	@Label( standard = "Adapter" )
	@MustExist
	@Required
	@NoDuplicates
	@XmlBinding( path = "atom-collection-adapter" )
	ValueProperty PROP_ADAPTER_CLASS = new ValueProperty( TYPE, "AdapterClass" );

	ReferenceValue<JavaTypeName, JavaType> getAdapterClass();

	void setAdapterClass( String value );

	void setAdapterClass( JavaTypeName value );

}
