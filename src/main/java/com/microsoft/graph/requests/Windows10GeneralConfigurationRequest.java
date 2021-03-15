// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.Windows10GeneralConfiguration;
import com.microsoft.graph.models.DeviceConfigurationGroupAssignment;
import com.microsoft.graph.models.DeviceConfigurationAssignment;
import com.microsoft.graph.models.HasPayloadLinkResultItem;
import com.microsoft.graph.models.DeviceConfigurationTargetedUserAndDevice;
import com.microsoft.graph.models.WindowsAssignedAccessProfile;
import com.microsoft.graph.models.WindowsPrivacyDataAccessControlItem;
import com.microsoft.graph.models.IosAvailableUpdateVersion;
import com.microsoft.graph.requests.WindowsPrivacyDataAccessControlItemCollectionRequestBuilder;
import com.microsoft.graph.requests.WindowsPrivacyDataAccessControlItemRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows10General Configuration Request.
 */
public class Windows10GeneralConfigurationRequest extends BaseRequest<Windows10GeneralConfiguration> {
	
    /**
     * The request for the Windows10GeneralConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public Windows10GeneralConfigurationRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Windows10GeneralConfiguration.class);
    }

    /**
     * Gets the Windows10GeneralConfiguration from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Windows10GeneralConfiguration> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the Windows10GeneralConfiguration from the service
     *
     * @return the Windows10GeneralConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Windows10GeneralConfiguration get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Windows10GeneralConfiguration> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public Windows10GeneralConfiguration delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this Windows10GeneralConfiguration with a source
     *
     * @param sourceWindows10GeneralConfiguration the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Windows10GeneralConfiguration> patchAsync(@Nonnull final Windows10GeneralConfiguration sourceWindows10GeneralConfiguration) {
        return sendAsync(HttpMethod.PATCH, sourceWindows10GeneralConfiguration);
    }

    /**
     * Patches this Windows10GeneralConfiguration with a source
     *
     * @param sourceWindows10GeneralConfiguration the source object with updates
     * @return the updated Windows10GeneralConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Windows10GeneralConfiguration patch(@Nonnull final Windows10GeneralConfiguration sourceWindows10GeneralConfiguration) throws ClientException {
        return send(HttpMethod.PATCH, sourceWindows10GeneralConfiguration);
    }

    /**
     * Creates a Windows10GeneralConfiguration with a new object
     *
     * @param newWindows10GeneralConfiguration the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Windows10GeneralConfiguration> postAsync(@Nonnull final Windows10GeneralConfiguration newWindows10GeneralConfiguration) {
        return sendAsync(HttpMethod.POST, newWindows10GeneralConfiguration);
    }

    /**
     * Creates a Windows10GeneralConfiguration with a new object
     *
     * @param newWindows10GeneralConfiguration the new object to create
     * @return the created Windows10GeneralConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Windows10GeneralConfiguration post(@Nonnull final Windows10GeneralConfiguration newWindows10GeneralConfiguration) throws ClientException {
        return send(HttpMethod.POST, newWindows10GeneralConfiguration);
    }

    /**
     * Creates a Windows10GeneralConfiguration with a new object
     *
     * @param newWindows10GeneralConfiguration the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Windows10GeneralConfiguration> putAsync(@Nonnull final Windows10GeneralConfiguration newWindows10GeneralConfiguration) {
        return sendAsync(HttpMethod.PUT, newWindows10GeneralConfiguration);
    }

    /**
     * Creates a Windows10GeneralConfiguration with a new object
     *
     * @param newWindows10GeneralConfiguration the object to create/update
     * @return the created Windows10GeneralConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Windows10GeneralConfiguration put(@Nonnull final Windows10GeneralConfiguration newWindows10GeneralConfiguration) throws ClientException {
        return send(HttpMethod.PUT, newWindows10GeneralConfiguration);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public Windows10GeneralConfigurationRequest select(@Nonnull final String value) {
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
     public Windows10GeneralConfigurationRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

