// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.IosEnterpriseWiFiConfiguration;
import com.microsoft.graph.models.DeviceConfigurationGroupAssignment;
import com.microsoft.graph.models.DeviceConfigurationAssignment;
import com.microsoft.graph.models.HasPayloadLinkResultItem;
import com.microsoft.graph.models.DeviceConfigurationTargetedUserAndDevice;
import com.microsoft.graph.models.WindowsAssignedAccessProfile;
import com.microsoft.graph.models.WindowsPrivacyDataAccessControlItem;
import com.microsoft.graph.models.IosAvailableUpdateVersion;
import com.microsoft.graph.requests.DeviceManagementDerivedCredentialSettingsWithReferenceRequestBuilder;
import com.microsoft.graph.requests.IosCertificateProfileBaseWithReferenceRequestBuilder;
import com.microsoft.graph.requests.IosTrustedRootCertificateCollectionRequestBuilder;
import com.microsoft.graph.requests.IosTrustedRootCertificateRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ios Enterprise Wi Fi Configuration Request.
 */
public class IosEnterpriseWiFiConfigurationRequest extends BaseRequest<IosEnterpriseWiFiConfiguration> {
	
    /**
     * The request for the IosEnterpriseWiFiConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public IosEnterpriseWiFiConfigurationRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, IosEnterpriseWiFiConfiguration.class);
    }

    /**
     * Gets the IosEnterpriseWiFiConfiguration from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<IosEnterpriseWiFiConfiguration> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the IosEnterpriseWiFiConfiguration from the service
     *
     * @return the IosEnterpriseWiFiConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public IosEnterpriseWiFiConfiguration get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<IosEnterpriseWiFiConfiguration> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public IosEnterpriseWiFiConfiguration delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this IosEnterpriseWiFiConfiguration with a source
     *
     * @param sourceIosEnterpriseWiFiConfiguration the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<IosEnterpriseWiFiConfiguration> patchAsync(@Nonnull final IosEnterpriseWiFiConfiguration sourceIosEnterpriseWiFiConfiguration) {
        return sendAsync(HttpMethod.PATCH, sourceIosEnterpriseWiFiConfiguration);
    }

    /**
     * Patches this IosEnterpriseWiFiConfiguration with a source
     *
     * @param sourceIosEnterpriseWiFiConfiguration the source object with updates
     * @return the updated IosEnterpriseWiFiConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public IosEnterpriseWiFiConfiguration patch(@Nonnull final IosEnterpriseWiFiConfiguration sourceIosEnterpriseWiFiConfiguration) throws ClientException {
        return send(HttpMethod.PATCH, sourceIosEnterpriseWiFiConfiguration);
    }

    /**
     * Creates a IosEnterpriseWiFiConfiguration with a new object
     *
     * @param newIosEnterpriseWiFiConfiguration the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<IosEnterpriseWiFiConfiguration> postAsync(@Nonnull final IosEnterpriseWiFiConfiguration newIosEnterpriseWiFiConfiguration) {
        return sendAsync(HttpMethod.POST, newIosEnterpriseWiFiConfiguration);
    }

    /**
     * Creates a IosEnterpriseWiFiConfiguration with a new object
     *
     * @param newIosEnterpriseWiFiConfiguration the new object to create
     * @return the created IosEnterpriseWiFiConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public IosEnterpriseWiFiConfiguration post(@Nonnull final IosEnterpriseWiFiConfiguration newIosEnterpriseWiFiConfiguration) throws ClientException {
        return send(HttpMethod.POST, newIosEnterpriseWiFiConfiguration);
    }

    /**
     * Creates a IosEnterpriseWiFiConfiguration with a new object
     *
     * @param newIosEnterpriseWiFiConfiguration the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<IosEnterpriseWiFiConfiguration> putAsync(@Nonnull final IosEnterpriseWiFiConfiguration newIosEnterpriseWiFiConfiguration) {
        return sendAsync(HttpMethod.PUT, newIosEnterpriseWiFiConfiguration);
    }

    /**
     * Creates a IosEnterpriseWiFiConfiguration with a new object
     *
     * @param newIosEnterpriseWiFiConfiguration the object to create/update
     * @return the created IosEnterpriseWiFiConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public IosEnterpriseWiFiConfiguration put(@Nonnull final IosEnterpriseWiFiConfiguration newIosEnterpriseWiFiConfiguration) throws ClientException {
        return send(HttpMethod.PUT, newIosEnterpriseWiFiConfiguration);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public IosEnterpriseWiFiConfigurationRequest select(@Nonnull final String value) {
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
     public IosEnterpriseWiFiConfigurationRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

