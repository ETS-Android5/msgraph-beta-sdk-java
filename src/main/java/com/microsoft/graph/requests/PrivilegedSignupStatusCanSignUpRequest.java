// Template Source: BaseMethodRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.PrivilegedSignupStatus;
import com.microsoft.graph.requests.PrivilegedSignupStatusCanSignUpRequest;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Privileged Signup Status Can Sign Up Request.
 */
public class PrivilegedSignupStatusCanSignUpRequest extends BaseRequest<Boolean> {
    /**
     * The request for this PrivilegedSignupStatusCanSignUp
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PrivilegedSignupStatusCanSignUpRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Boolean.class);
    }

    /**
     * Gets the Boolean
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Boolean> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the Boolean
     *
     * @return the Boolean
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    @Nullable
    public Boolean get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    @Nonnull
    public PrivilegedSignupStatusCanSignUpRequest select(@Nonnull final String value) {
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
    public PrivilegedSignupStatusCanSignUpRequest expand(@Nonnull final String value) {
        addExpandOption(value);
        return this;
    }

}
