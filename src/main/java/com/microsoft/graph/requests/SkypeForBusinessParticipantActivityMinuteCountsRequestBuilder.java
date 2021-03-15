// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.SkypeForBusinessParticipantActivityMinuteCounts;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Skype For Business Participant Activity Minute Counts Request Builder.
 */
public class SkypeForBusinessParticipantActivityMinuteCountsRequestBuilder extends BaseRequestBuilder<SkypeForBusinessParticipantActivityMinuteCounts> {

    /**
     * The request builder for the SkypeForBusinessParticipantActivityMinuteCounts
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SkypeForBusinessParticipantActivityMinuteCountsRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the SkypeForBusinessParticipantActivityMinuteCountsRequest instance
     */
    @Nonnull
    public SkypeForBusinessParticipantActivityMinuteCountsRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the SkypeForBusinessParticipantActivityMinuteCountsRequest instance
     */
    @Nonnull
    public SkypeForBusinessParticipantActivityMinuteCountsRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.SkypeForBusinessParticipantActivityMinuteCountsRequest(getRequestUrl(), getClient(), requestOptions);
    }


}
