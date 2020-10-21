/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.file.remote;

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
public class FtpEndpointUriFactory extends org.apache.camel.support.component.EndpointUriFactorySupport implements EndpointUriFactory {

    private static final String BASE = ":host:port/directoryName";

    private static final Set<String> PROPERTY_NAMES;
    private static final Set<String> SECRET_PROPERTY_NAMES;
    static {
        Set<String> props = new HashSet<>(113);
        props.add("disconnect");
        props.add("moveExistingFileStrategy");
        props.add("fileName");
        props.add("synchronous");
        props.add("idempotent");
        props.add("password");
        props.add("preSort");
        props.add("sortBy");
        props.add("scheduledExecutorService");
        props.add("directoryName");
        props.add("readLockDeleteOrphanLockFiles");
        props.add("schedulerProperties");
        props.add("inProgressRepository");
        props.add("soTimeout");
        props.add("backoffIdleThreshold");
        props.add("passiveMode");
        props.add("delay");
        props.add("startScheduler");
        props.add("binary");
        props.add("readLockTimeout");
        props.add("charset");
        props.add("disconnectOnBatchComplete");
        props.add("ftpClientParameters");
        props.add("idempotentKey");
        props.add("sorter");
        props.add("maximumReconnectAttempts");
        props.add("stepwise");
        props.add("autoCreate");
        props.add("recursive");
        props.add("antExclude");
        props.add("keepLastModified");
        props.add("noop");
        props.add("handleDirectoryParserAbsoluteResult");
        props.add("useFixedDelay");
        props.add("runLoggingLevel");
        props.add("transferLoggingLevel");
        props.add("tempPrefix");
        props.add("sendNoop");
        props.add("transferLoggingIntervalSeconds");
        props.add("ftpClientConfig");
        props.add("minDepth");
        props.add("activePortRange");
        props.add("include");
        props.add("idempotentRepository");
        props.add("streamDownload");
        props.add("reconnectDelay");
        props.add("filter");
        props.add("maxDepth");
        props.add("filterFile");
        props.add("pollStrategy");
        props.add("shuffle");
        props.add("antInclude");
        props.add("moveExisting");
        props.add("throwExceptionOnConnectFailed");
        props.add("initialDelay");
        props.add("flatten");
        props.add("download");
        props.add("bridgeErrorHandler");
        props.add("eagerDeleteTargetFile");
        props.add("readLockRemoveOnRollback");
        props.add("siteCommand");
        props.add("readLockRemoveOnCommit");
        props.add("host");
        props.add("connectTimeout");
        props.add("greedy");
        props.add("exclude");
        props.add("maxMessagesPerPoll");
        props.add("fastExistsCheck");
        props.add("repeatCount");
        props.add("sendEmptyMessageWhenIdle");
        props.add("processStrategy");
        props.add("readLock");
        props.add("separator");
        props.add("readLockLoggingLevel");
        props.add("readLockMinLength");
        props.add("lazyStartProducer");
        props.add("ftpClient");
        props.add("port");
        props.add("readLockMarkerFile");
        props.add("exceptionHandler");
        props.add("eagerMaxMessagesPerPoll");
        props.add("basicPropertyBinding");
        props.add("backoffMultiplier");
        props.add("exclusiveReadLockStrategy");
        props.add("readLockCheckInterval");
        props.add("fileExist");
        props.add("localWorkDirectory");
        props.add("transferLoggingVerbose");
        props.add("delete");
        props.add("readLockMinAge");
        props.add("timeout");
        props.add("scheduler");
        props.add("jailStartingDirectory");
        props.add("doneFileName");
        props.add("backoffErrorThreshold");
        props.add("resumeDownload");
        props.add("chmod");
        props.add("onCompletionExceptionHandler");
        props.add("allowNullBody");
        props.add("timeUnit");
        props.add("moveFailed");
        props.add("preMove");
        props.add("move");
        props.add("exchangePattern");
        props.add("useList");
        props.add("ftpClientConfigParameters");
        props.add("tempFileName");
        props.add("ignoreFileNotFoundOrPermissionError");
        props.add("antFilterCaseSensitive");
        props.add("account");
        props.add("bufferSize");
        props.add("filterDirectory");
        props.add("username");
        PROPERTY_NAMES = Collections.unmodifiableSet(props);
        Set<String> secretProps = new HashSet<>(3);
        secretProps.add("password");
        secretProps.add("account");
        secretProps.add("username");
        SECRET_PROPERTY_NAMES = Collections.unmodifiableSet(secretProps);
    }

    @Override
    public boolean isEnabled(String scheme) {
        return "ftp".equals(scheme);
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> properties, boolean encode) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(properties);

        uri = buildPathParameter(syntax, uri, "host", null, true, copy);
        uri = buildPathParameter(syntax, uri, "port", null, false, copy);
        uri = buildPathParameter(syntax, uri, "directoryName", null, false, copy);
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

