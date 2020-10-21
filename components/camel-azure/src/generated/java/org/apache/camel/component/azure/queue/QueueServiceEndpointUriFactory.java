/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.azure.queue;

import java.net.URISyntaxException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.camel.spi.EndpointUriFactory;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
public class QueueServiceEndpointUriFactory extends org.apache.camel.support.component.EndpointUriFactorySupport implements EndpointUriFactory {

    private static final String BASE = ":containerAndQueueUri";

    private static final Set<String> PROPERTY_NAMES;
    private static final Set<String> SECRET_PROPERTY_NAMES;
    static {
        Set<String> props = new HashSet<>(16);
        props.add("basicPropertyBinding");
        props.add("credentials");
        props.add("synchronous");
        props.add("azureQueueClient");
        props.add("exchangePattern");
        props.add("credentialsAccountKey");
        props.add("validateClientURI");
        props.add("lazyStartProducer");
        props.add("bridgeErrorHandler");
        props.add("messageVisibilityDelay");
        props.add("messageTimeToLive");
        props.add("queuePrefix");
        props.add("containerAndQueueUri");
        props.add("exceptionHandler");
        props.add("operation");
        props.add("credentialsAccountName");
        PROPERTY_NAMES = Collections.unmodifiableSet(props);
        Set<String> secretProps = new HashSet<>(2);
        secretProps.add("credentialsAccountKey");
        secretProps.add("credentialsAccountName");
        SECRET_PROPERTY_NAMES = Collections.unmodifiableSet(secretProps);
    }

    @Override
    public boolean isEnabled(String scheme) {
        return "azure-queue".equals(scheme);
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> properties, boolean encode) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(properties);

        uri = buildPathParameter(syntax, uri, "containerAndQueueUri", null, true, copy);
        uri = buildQueryParameters(uri, copy, encode);
        return uri;
    }

    @Override
    public Set<String> propertyNames() {
        return PROPERTY_NAMES;
    }

    @Override
    public Set<String> secretPropertyNames() {
        return SECRET_PROPERTY_NAMES;
    }

    @Override
    public boolean isLenientProperties() {
        return false;
    }
}

