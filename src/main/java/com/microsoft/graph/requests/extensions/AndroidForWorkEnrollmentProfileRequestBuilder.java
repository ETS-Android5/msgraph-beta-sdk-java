// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AndroidForWorkEnrollmentProfile;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Android For Work Enrollment Profile Request Builder.
 */
public class AndroidForWorkEnrollmentProfileRequestBuilder extends BaseRequestBuilder implements IAndroidForWorkEnrollmentProfileRequestBuilder {

    /**
     * The request builder for the AndroidForWorkEnrollmentProfile
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AndroidForWorkEnrollmentProfileRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IAndroidForWorkEnrollmentProfileRequest instance
     */
    public IAndroidForWorkEnrollmentProfileRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IAndroidForWorkEnrollmentProfileRequest instance
     */
    public IAndroidForWorkEnrollmentProfileRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.AndroidForWorkEnrollmentProfileRequest(getRequestUrl(), getClient(), requestOptions);
    }



    public IAndroidForWorkEnrollmentProfileCreateTokenRequestBuilder createToken(final Integer tokenValidityInSeconds) {
        return new AndroidForWorkEnrollmentProfileCreateTokenRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.createToken"), getClient(), null, tokenValidityInSeconds);
    }

    public IAndroidForWorkEnrollmentProfileRevokeTokenRequestBuilder revokeToken() {
        return new AndroidForWorkEnrollmentProfileRevokeTokenRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.revokeToken"), getClient(), null);
    }
}
