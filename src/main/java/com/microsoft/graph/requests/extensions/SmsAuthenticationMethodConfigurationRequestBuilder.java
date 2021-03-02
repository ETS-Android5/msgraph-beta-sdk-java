// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.SmsAuthenticationMethodConfiguration;
import com.microsoft.graph.requests.extensions.ISmsAuthenticationMethodTargetCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISmsAuthenticationMethodTargetRequestBuilder;
import com.microsoft.graph.requests.extensions.SmsAuthenticationMethodTargetCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SmsAuthenticationMethodTargetRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Sms Authentication Method Configuration Request Builder.
 */
public class SmsAuthenticationMethodConfigurationRequestBuilder extends BaseRequestBuilder implements ISmsAuthenticationMethodConfigurationRequestBuilder {

    /**
     * The request builder for the SmsAuthenticationMethodConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SmsAuthenticationMethodConfigurationRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the ISmsAuthenticationMethodConfigurationRequest instance
     */
    public ISmsAuthenticationMethodConfigurationRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the ISmsAuthenticationMethodConfigurationRequest instance
     */
    public ISmsAuthenticationMethodConfigurationRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.SmsAuthenticationMethodConfigurationRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public ISmsAuthenticationMethodTargetCollectionRequestBuilder includeTargets() {
        return new SmsAuthenticationMethodTargetCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("includeTargets"), getClient(), null);
    }

    public ISmsAuthenticationMethodTargetRequestBuilder includeTargets(final String id) {
        return new SmsAuthenticationMethodTargetRequestBuilder(getRequestUrlWithAdditionalSegment("includeTargets") + "/" + id, getClient(), null);
    }
}
