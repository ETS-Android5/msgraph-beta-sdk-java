// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.IosExpeditedCheckinConfiguration;
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
 * The class for the Ios Expedited Checkin Configuration Request.
 */
public class IosExpeditedCheckinConfigurationRequest extends BaseRequest<IosExpeditedCheckinConfiguration> {
	
    /**
     * The request for the IosExpeditedCheckinConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public IosExpeditedCheckinConfigurationRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, IosExpeditedCheckinConfiguration.class);
    }

    /**
     * Gets the IosExpeditedCheckinConfiguration from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<IosExpeditedCheckinConfiguration> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the IosExpeditedCheckinConfiguration from the service
     *
     * @return the IosExpeditedCheckinConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public IosExpeditedCheckinConfiguration get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<IosExpeditedCheckinConfiguration> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public IosExpeditedCheckinConfiguration delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this IosExpeditedCheckinConfiguration with a source
     *
     * @param sourceIosExpeditedCheckinConfiguration the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<IosExpeditedCheckinConfiguration> patchAsync(@Nonnull final IosExpeditedCheckinConfiguration sourceIosExpeditedCheckinConfiguration) {
        return sendAsync(HttpMethod.PATCH, sourceIosExpeditedCheckinConfiguration);
    }

    /**
     * Patches this IosExpeditedCheckinConfiguration with a source
     *
     * @param sourceIosExpeditedCheckinConfiguration the source object with updates
     * @return the updated IosExpeditedCheckinConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public IosExpeditedCheckinConfiguration patch(@Nonnull final IosExpeditedCheckinConfiguration sourceIosExpeditedCheckinConfiguration) throws ClientException {
        return send(HttpMethod.PATCH, sourceIosExpeditedCheckinConfiguration);
    }

    /**
     * Creates a IosExpeditedCheckinConfiguration with a new object
     *
     * @param newIosExpeditedCheckinConfiguration the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<IosExpeditedCheckinConfiguration> postAsync(@Nonnull final IosExpeditedCheckinConfiguration newIosExpeditedCheckinConfiguration) {
        return sendAsync(HttpMethod.POST, newIosExpeditedCheckinConfiguration);
    }

    /**
     * Creates a IosExpeditedCheckinConfiguration with a new object
     *
     * @param newIosExpeditedCheckinConfiguration the new object to create
     * @return the created IosExpeditedCheckinConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public IosExpeditedCheckinConfiguration post(@Nonnull final IosExpeditedCheckinConfiguration newIosExpeditedCheckinConfiguration) throws ClientException {
        return send(HttpMethod.POST, newIosExpeditedCheckinConfiguration);
    }

    /**
     * Creates a IosExpeditedCheckinConfiguration with a new object
     *
     * @param newIosExpeditedCheckinConfiguration the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<IosExpeditedCheckinConfiguration> putAsync(@Nonnull final IosExpeditedCheckinConfiguration newIosExpeditedCheckinConfiguration) {
        return sendAsync(HttpMethod.PUT, newIosExpeditedCheckinConfiguration);
    }

    /**
     * Creates a IosExpeditedCheckinConfiguration with a new object
     *
     * @param newIosExpeditedCheckinConfiguration the object to create/update
     * @return the created IosExpeditedCheckinConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public IosExpeditedCheckinConfiguration put(@Nonnull final IosExpeditedCheckinConfiguration newIosExpeditedCheckinConfiguration) throws ClientException {
        return send(HttpMethod.PUT, newIosExpeditedCheckinConfiguration);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public IosExpeditedCheckinConfigurationRequest select(@Nonnull final String value) {
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
     public IosExpeditedCheckinConfigurationRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

