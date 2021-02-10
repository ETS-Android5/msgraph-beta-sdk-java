// Template Source: IBaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IAuthenticationMethodsRootUsersRegisteredByMethodRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Authentication Methods Root Users Registered By Method Request Builder.
 */
public interface IAuthenticationMethodsRootUsersRegisteredByMethodRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IAuthenticationMethodsRootUsersRegisteredByMethodRequest
     *
     * @param requestOptions the options for the request
     * @return the IAuthenticationMethodsRootUsersRegisteredByMethodRequest instance
     */
    IAuthenticationMethodsRootUsersRegisteredByMethodRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the IAuthenticationMethodsRootUsersRegisteredByMethodRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IAuthenticationMethodsRootUsersRegisteredByMethodRequest instance
     */
    IAuthenticationMethodsRootUsersRegisteredByMethodRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
