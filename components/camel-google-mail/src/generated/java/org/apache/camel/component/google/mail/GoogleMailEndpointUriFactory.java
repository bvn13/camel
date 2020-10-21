/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.google.mail;

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
public class GoogleMailEndpointUriFactory extends org.apache.camel.support.component.EndpointUriFactorySupport implements EndpointUriFactory {

    private static final String BASE = ":apiName/methodName";

    private static final Set<String> PROPERTY_NAMES;
    private static final Set<String> SECRET_PROPERTY_NAMES;
    static {
        Set<String> props = new HashSet<>(38);
        props.add("basicPropertyBinding");
        props.add("backoffMultiplier");
        props.add("apiName");
        props.add("synchronous");
        props.add("initialDelay");
        props.add("content");
        props.add("scheduler");
        props.add("modifyMessageRequest");
        props.add("bridgeErrorHandler");
        props.add("useFixedDelay");
        props.add("mediaContent");
        props.add("runLoggingLevel");
        props.add("backoffErrorThreshold");
        props.add("greedy");
        props.add("clientSecret");
        props.add("id");
        props.add("scheduledExecutorService");
        props.add("batchModifyMessagesRequest");
        props.add("applicationName");
        props.add("repeatCount");
        props.add("timeUnit");
        props.add("clientId");
        props.add("sendEmptyMessageWhenIdle");
        props.add("schedulerProperties");
        props.add("exchangePattern");
        props.add("methodName");
        props.add("messageId");
        props.add("accessToken");
        props.add("userId");
        props.add("backoffIdleThreshold");
        props.add("batchDeleteMessagesRequest");
        props.add("lazyStartProducer");
        props.add("delay");
        props.add("pollStrategy");
        props.add("startScheduler");
        props.add("inBody");
        props.add("exceptionHandler");
        props.add("refreshToken");
        PROPERTY_NAMES = Collections.unmodifiableSet(props);
        Set<String> secretProps = new HashSet<>(3);
        secretProps.add("clientSecret");
        secretProps.add("accessToken");
        secretProps.add("refreshToken");
        SECRET_PROPERTY_NAMES = Collections.unmodifiableSet(secretProps);
    }

    @Override
    public boolean isEnabled(String scheme) {
        return "google-mail".equals(scheme);
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> properties, boolean encode) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(properties);

        uri = buildPathParameter(syntax, uri, "apiName", null, true, copy);
        uri = buildPathParameter(syntax, uri, "methodName", null, true, copy);
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

