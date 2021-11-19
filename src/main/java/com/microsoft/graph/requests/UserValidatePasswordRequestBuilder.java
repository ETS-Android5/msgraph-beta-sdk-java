// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.requests.UserValidatePasswordRequest;
import com.microsoft.graph.models.User;
import com.microsoft.graph.models.PasswordValidationInformation;
import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.models.UserValidatePasswordParameterSet;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Validate Password Request Builder.
 */
public class UserValidatePasswordRequestBuilder extends BaseActionRequestBuilder<PasswordValidationInformation> {

    /**
     * The request builder for this UserValidatePassword
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UserValidatePasswordRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }
    private UserValidatePasswordParameterSet body;
    /**
     * The request builder for this UserValidatePassword
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public UserValidatePasswordRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final UserValidatePasswordParameterSet parameters) {
        super(requestUrl, client, requestOptions);
        this.body = parameters;
    }

    /**
     * Creates the UserValidatePasswordRequest
     *
     * @param requestOptions the options for the request
     * @return the UserValidatePasswordRequest instance
     */
    @Nonnull
    public UserValidatePasswordRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the UserValidatePasswordRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the UserValidatePasswordRequest instance
     */
    @Nonnull
    public UserValidatePasswordRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final UserValidatePasswordRequest request = new UserValidatePasswordRequest(
                getRequestUrl(),
                getClient(),
                requestOptions);
        request.body = this.body;
        return request;
    }
}
