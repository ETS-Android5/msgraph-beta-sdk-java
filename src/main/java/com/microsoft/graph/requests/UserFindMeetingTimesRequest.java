// Template Source: BaseMethodRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.MeetingTimeSuggestionsResult;
import com.microsoft.graph.models.User;
import com.microsoft.graph.requests.UserFindMeetingTimesRequest;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.models.UserFindMeetingTimesParameterSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Find Meeting Times Request.
 */
public class UserFindMeetingTimesRequest extends BaseRequest<MeetingTimeSuggestionsResult> {
    /**
     * The request for this UserFindMeetingTimes
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UserFindMeetingTimesRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, MeetingTimeSuggestionsResult.class);
    }

	/** The body for the method */
    @Nullable
    public UserFindMeetingTimesParameterSet body;
    /**
     * Invokes the method and returns a future with the result
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<MeetingTimeSuggestionsResult> postAsync() {
        return sendAsync(HttpMethod.POST, body);
    }

    /**
     * Invokes the method and returns the result
     * @return result of the method invocation
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    @Nullable
    public MeetingTimeSuggestionsResult post() throws ClientException {
       return send(HttpMethod.POST, body);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    @Nonnull
    public UserFindMeetingTimesRequest select(@Nonnull final String value) {
        addSelectOption(value);
        return this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    @Nonnull
    public UserFindMeetingTimesRequest expand(@Nonnull final String value) {
        addExpandOption(value);
        return this;
    }

}
