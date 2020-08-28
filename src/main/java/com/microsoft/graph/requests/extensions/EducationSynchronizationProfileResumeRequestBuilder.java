// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IEducationSynchronizationProfileResumeRequest;
import com.microsoft.graph.requests.extensions.EducationSynchronizationProfileResumeRequest;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Education Synchronization Profile Resume Request Builder.
 */
public class EducationSynchronizationProfileResumeRequestBuilder extends BaseActionRequestBuilder implements IEducationSynchronizationProfileResumeRequestBuilder {

    /**
     * The request builder for this EducationSynchronizationProfileResume
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EducationSynchronizationProfileResumeRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the IEducationSynchronizationProfileResumeRequest
     *
     * @return the IEducationSynchronizationProfileResumeRequest instance
     */
    public IEducationSynchronizationProfileResumeRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IEducationSynchronizationProfileResumeRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IEducationSynchronizationProfileResumeRequest instance
     */
    public IEducationSynchronizationProfileResumeRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        EducationSynchronizationProfileResumeRequest request = new EducationSynchronizationProfileResumeRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        return request;
    }
}
