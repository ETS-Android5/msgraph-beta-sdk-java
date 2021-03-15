// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.EditionUpgradeConfiguration;
import com.microsoft.graph.models.DeviceConfigurationGroupAssignment;
import com.microsoft.graph.models.DeviceConfigurationAssignment;
import com.microsoft.graph.models.HasPayloadLinkResultItem;
import com.microsoft.graph.models.DeviceConfigurationTargetedUserAndDevice;
import com.microsoft.graph.models.WindowsAssignedAccessProfile;
import com.microsoft.graph.models.WindowsPrivacyDataAccessControlItem;
import com.microsoft.graph.models.IosAvailableUpdateVersion;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Edition Upgrade Configuration Request.
 */
public class EditionUpgradeConfigurationRequest extends BaseRequest<EditionUpgradeConfiguration> {
	
    /**
     * The request for the EditionUpgradeConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EditionUpgradeConfigurationRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, EditionUpgradeConfiguration.class);
    }

    /**
     * Gets the EditionUpgradeConfiguration from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<EditionUpgradeConfiguration> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the EditionUpgradeConfiguration from the service
     *
     * @return the EditionUpgradeConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public EditionUpgradeConfiguration get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<EditionUpgradeConfiguration> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public EditionUpgradeConfiguration delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this EditionUpgradeConfiguration with a source
     *
     * @param sourceEditionUpgradeConfiguration the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<EditionUpgradeConfiguration> patchAsync(@Nonnull final EditionUpgradeConfiguration sourceEditionUpgradeConfiguration) {
        return sendAsync(HttpMethod.PATCH, sourceEditionUpgradeConfiguration);
    }

    /**
     * Patches this EditionUpgradeConfiguration with a source
     *
     * @param sourceEditionUpgradeConfiguration the source object with updates
     * @return the updated EditionUpgradeConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public EditionUpgradeConfiguration patch(@Nonnull final EditionUpgradeConfiguration sourceEditionUpgradeConfiguration) throws ClientException {
        return send(HttpMethod.PATCH, sourceEditionUpgradeConfiguration);
    }

    /**
     * Creates a EditionUpgradeConfiguration with a new object
     *
     * @param newEditionUpgradeConfiguration the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<EditionUpgradeConfiguration> postAsync(@Nonnull final EditionUpgradeConfiguration newEditionUpgradeConfiguration) {
        return sendAsync(HttpMethod.POST, newEditionUpgradeConfiguration);
    }

    /**
     * Creates a EditionUpgradeConfiguration with a new object
     *
     * @param newEditionUpgradeConfiguration the new object to create
     * @return the created EditionUpgradeConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public EditionUpgradeConfiguration post(@Nonnull final EditionUpgradeConfiguration newEditionUpgradeConfiguration) throws ClientException {
        return send(HttpMethod.POST, newEditionUpgradeConfiguration);
    }

    /**
     * Creates a EditionUpgradeConfiguration with a new object
     *
     * @param newEditionUpgradeConfiguration the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<EditionUpgradeConfiguration> putAsync(@Nonnull final EditionUpgradeConfiguration newEditionUpgradeConfiguration) {
        return sendAsync(HttpMethod.PUT, newEditionUpgradeConfiguration);
    }

    /**
     * Creates a EditionUpgradeConfiguration with a new object
     *
     * @param newEditionUpgradeConfiguration the object to create/update
     * @return the created EditionUpgradeConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public EditionUpgradeConfiguration put(@Nonnull final EditionUpgradeConfiguration newEditionUpgradeConfiguration) throws ClientException {
        return send(HttpMethod.PUT, newEditionUpgradeConfiguration);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public EditionUpgradeConfigurationRequest select(@Nonnull final String value) {
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
     public EditionUpgradeConfigurationRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

