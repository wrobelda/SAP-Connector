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

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.mule.api.MuleEvent;
import org.mule.api.MuleMessage;
import org.mule.api.endpoint.OutboundEndpoint;
import org.mule.api.lifecycle.InitialisationException;
import org.mule.transport.AbstractMessageDispatcher;

/**
 * <code>SapMessageDispatcher</code> is a message dispatcher class
 * for SAP transport.
 * 
 */
public class SapMessageDispatcher extends AbstractMessageDispatcher
{
    private static Log logger
        = LogFactory.getLog(AbstractMessageDispatcher.class);

    SapConnector connector = null;

	/**
     * Constructor class 
     *
     * @param endpoint 
     * @exception InitialisationException if it fails.
     */
    public SapMessageDispatcher(OutboundEndpoint endpoint)
        throws InitialisationException
    {
		super(endpoint);
        connector = (SapConnector)endpoint.getConnector();				

        // set datasource for JCo client
        
	}

	/**
     * Describe <code>doDispatch</code> method here.
     *
     * @param event a <code>MuleEvent</code> value
     * @exception Exception if an error occurs
     */
    protected void doDispatch(MuleEvent event) throws Exception
    {
        logger.info("*****SapMessageDispatcher.doDispatch()*****");
	}

	/**
     * Describe <code>doSend</code> method here.
     *
     * @param event a <code>MuleEvent</code> value
     * @return a <code>MuleMessage</code> value
     * @exception Exception if an error occurs
     */
    protected MuleMessage doSend(MuleEvent event) throws Exception
    {
		logger.info("*****SapMessageDispatcher.doSend()*****");
        //logger.info(event.getMessageAsString());
     	
		Object payload = event.transformMessage();
		Object result = this.connector.getAdapter().invoke(payload);
		return createMuleMessage(result);
	}


	/**
     * Describe <code>doConnect</code> method here.
     *
     * @exception Exception if an error occurs
     */
    protected void doConnect() throws Exception
    {
        logger.info("*****SapMessageDispatcher.doConnect()*****");
	}

	/**
     * Describe <code>doDisconnect</code> method here.
     *
     * @exception Exception if an error occurs
     */
    protected void doDisconnect() throws Exception
    {
        logger.info("*****SapMessageDispatcher.doDisconnect()*****");
		
	}

	/**
     * Describe <code>doDispose</code> method here.
     *
     */
    protected void doDispose()
    {
        logger.info("*****SapMessageDispatcher.doDispose()*****");
		
	}
}
