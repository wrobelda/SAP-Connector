/*
 * $Id$
 *
 * Copyright (c) Osaka Gas Information System Research Institute Co., Ltd.
 * All rights reserved.  http://www.ogis-ri.co.jp/
 * 
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package org.mule.transport.sap;

import org.mule.api.MuleContext;
import org.mule.transport.AbstractMuleMessageFactory;

/**
 * Describe class <code>SapMessageFactory</code> here.
 *
 */
public class SapMessageFactory extends AbstractMuleMessageFactory  
{

	public SapMessageFactory(MuleContext context)
    { 
    	super(context);
    }

	@Override
	protected Class<?>[] getSupportedTransportMessageTypes() {
		return new Class[]{byte.class, String.class, Object.class};
	}

	@Override
	protected Object extractPayload(Object transportMessage, String encoding)
			throws Exception {
		return transportMessage;
	}
}
