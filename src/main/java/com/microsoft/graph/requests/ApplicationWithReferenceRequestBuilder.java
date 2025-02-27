// Template Source: BaseEntityWithReferenceRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.Application;
import com.microsoft.graph.models.KeyCredential;
import com.microsoft.graph.models.PasswordCredential;
import com.microsoft.graph.models.DirectoryObject;
import com.microsoft.graph.requests.AppManagementPolicyCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.AppManagementPolicyWithReferenceRequestBuilder;
import com.microsoft.graph.requests.DirectoryObjectWithReferenceRequestBuilder;
import com.microsoft.graph.requests.ExtensionPropertyCollectionRequestBuilder;
import com.microsoft.graph.requests.ExtensionPropertyRequestBuilder;
import com.microsoft.graph.requests.FederatedIdentityCredentialCollectionRequestBuilder;
import com.microsoft.graph.requests.FederatedIdentityCredentialRequestBuilder;
import com.microsoft.graph.requests.HomeRealmDiscoveryPolicyCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.HomeRealmDiscoveryPolicyWithReferenceRequestBuilder;
import com.microsoft.graph.requests.DirectoryObjectCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.AppRoleAssignmentRequestBuilder;
import com.microsoft.graph.requests.EndpointRequestBuilder;
import com.microsoft.graph.requests.ServicePrincipalRequestBuilder;
import com.microsoft.graph.requests.UserRequestBuilder;
import com.microsoft.graph.requests.TokenIssuancePolicyCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.TokenIssuancePolicyWithReferenceRequestBuilder;
import com.microsoft.graph.requests.TokenLifetimePolicyCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.TokenLifetimePolicyWithReferenceRequestBuilder;
import com.microsoft.graph.requests.ConnectorGroupWithReferenceRequestBuilder;
import com.microsoft.graph.requests.SynchronizationRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.http.BaseWithReferenceRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Application With Reference Request Builder.
 */
public class ApplicationWithReferenceRequestBuilder extends BaseWithReferenceRequestBuilder<Application, ApplicationWithReferenceRequest, ApplicationReferenceRequestBuilder> {

    /**
     * The request builder for the Application
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ApplicationWithReferenceRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ApplicationWithReferenceRequest.class, ApplicationReferenceRequestBuilder.class);
    }
}
