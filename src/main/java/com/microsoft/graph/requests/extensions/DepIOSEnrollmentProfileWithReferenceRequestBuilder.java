// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DepIOSEnrollmentProfile;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Dep IOSEnrollment Profile With Reference Request Builder.
 */
public class DepIOSEnrollmentProfileWithReferenceRequestBuilder extends BaseRequestBuilder implements IDepIOSEnrollmentProfileWithReferenceRequestBuilder {

    /**
     * The request builder for the DepIOSEnrollmentProfile
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DepIOSEnrollmentProfileWithReferenceRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IDepIOSEnrollmentProfileWithReferenceRequest instance
     */
    public IDepIOSEnrollmentProfileWithReferenceRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific options instead of the existing options
	 *
     * @param requestOptions the options for this request
     * @return the IDepIOSEnrollmentProfileWithReferenceRequest instance
     */
    public IDepIOSEnrollmentProfileWithReferenceRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new DepIOSEnrollmentProfileWithReferenceRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IDepIOSEnrollmentProfileReferenceRequestBuilder reference(){
        return new DepIOSEnrollmentProfileReferenceRequestBuilder(getRequestUrl() + "/$ref", getClient(), getOptions());
    }

}
