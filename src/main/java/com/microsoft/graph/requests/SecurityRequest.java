// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.Security;
import com.microsoft.graph.models.HuntingQueryResults;
import com.microsoft.graph.requests.Alert_v2CollectionRequestBuilder;
import com.microsoft.graph.requests.Alert_v2RequestBuilder;
import com.microsoft.graph.requests.IncidentCollectionRequestBuilder;
import com.microsoft.graph.requests.IncidentRequestBuilder;
import com.microsoft.graph.requests.AttackSimulationRootRequestBuilder;
import com.microsoft.graph.requests.AlertCollectionRequestBuilder;
import com.microsoft.graph.requests.AlertRequestBuilder;
import com.microsoft.graph.requests.CloudAppSecurityProfileCollectionRequestBuilder;
import com.microsoft.graph.requests.CloudAppSecurityProfileRequestBuilder;
import com.microsoft.graph.requests.DomainSecurityProfileCollectionRequestBuilder;
import com.microsoft.graph.requests.DomainSecurityProfileRequestBuilder;
import com.microsoft.graph.requests.FileSecurityProfileCollectionRequestBuilder;
import com.microsoft.graph.requests.FileSecurityProfileRequestBuilder;
import com.microsoft.graph.requests.HostSecurityProfileCollectionRequestBuilder;
import com.microsoft.graph.requests.HostSecurityProfileRequestBuilder;
import com.microsoft.graph.requests.IpSecurityProfileCollectionRequestBuilder;
import com.microsoft.graph.requests.IpSecurityProfileRequestBuilder;
import com.microsoft.graph.requests.ProviderTenantSettingCollectionRequestBuilder;
import com.microsoft.graph.requests.ProviderTenantSettingRequestBuilder;
import com.microsoft.graph.requests.SecureScoreControlProfileCollectionRequestBuilder;
import com.microsoft.graph.requests.SecureScoreControlProfileRequestBuilder;
import com.microsoft.graph.requests.SecureScoreCollectionRequestBuilder;
import com.microsoft.graph.requests.SecureScoreRequestBuilder;
import com.microsoft.graph.requests.SecurityActionCollectionRequestBuilder;
import com.microsoft.graph.requests.SecurityActionRequestBuilder;
import com.microsoft.graph.requests.TiIndicatorCollectionRequestBuilder;
import com.microsoft.graph.requests.TiIndicatorRequestBuilder;
import com.microsoft.graph.requests.UserSecurityProfileCollectionRequestBuilder;
import com.microsoft.graph.requests.UserSecurityProfileRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Security Request.
 */
public class SecurityRequest extends BaseRequest<Security> {
	
    /**
     * The request for the Security
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SecurityRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Security.class);
    }

    /**
     * Gets the Security from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Security> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the Security from the service
     *
     * @return the Security from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Security get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Security> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public Security delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this Security with a source
     *
     * @param sourceSecurity the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Security> patchAsync(@Nonnull final Security sourceSecurity) {
        return sendAsync(HttpMethod.PATCH, sourceSecurity);
    }

    /**
     * Patches this Security with a source
     *
     * @param sourceSecurity the source object with updates
     * @return the updated Security
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Security patch(@Nonnull final Security sourceSecurity) throws ClientException {
        return send(HttpMethod.PATCH, sourceSecurity);
    }

    /**
     * Creates a Security with a new object
     *
     * @param newSecurity the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Security> postAsync(@Nonnull final Security newSecurity) {
        return sendAsync(HttpMethod.POST, newSecurity);
    }

    /**
     * Creates a Security with a new object
     *
     * @param newSecurity the new object to create
     * @return the created Security
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Security post(@Nonnull final Security newSecurity) throws ClientException {
        return send(HttpMethod.POST, newSecurity);
    }

    /**
     * Creates a Security with a new object
     *
     * @param newSecurity the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Security> putAsync(@Nonnull final Security newSecurity) {
        return sendAsync(HttpMethod.PUT, newSecurity);
    }

    /**
     * Creates a Security with a new object
     *
     * @param newSecurity the object to create/update
     * @return the created Security
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Security put(@Nonnull final Security newSecurity) throws ClientException {
        return send(HttpMethod.PUT, newSecurity);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public SecurityRequest select(@Nonnull final String value) {
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
     public SecurityRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

