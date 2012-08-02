package org.mule.transport.sap.adapter;

import java.util.Properties;

import com.sap.conn.jco.ext.DestinationDataEventListener;

public class DestinationDataSimpleProvider implements com.sap.conn.jco.ext.DestinationDataProvider {
	private final Properties _properties;

	public DestinationDataSimpleProvider(Properties properties)
	{
		_properties = properties;
	}

	public Properties getDestinationProperties(String arg0) {
		return _properties;
	}

	public void setDestinationDataEventListener(DestinationDataEventListener arg0) {
		throw new UnsupportedOperationException("Operation not implemented!");
	}

	public boolean supportsEvents() {
		return false;
	}

}