// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.WindowsWiredNetworkConfiguration;
import com.microsoft.graph.models.DeviceConfigurationGroupAssignment;
import com.microsoft.graph.models.DeviceConfigurationAssignment;
import com.microsoft.graph.models.HasPayloadLinkResultItem;
import com.microsoft.graph.models.DeviceConfigurationTargetedUserAndDevice;
import com.microsoft.graph.models.WindowsAssignedAccessProfile;
import com.microsoft.graph.models.WindowsPrivacyDataAccessControlItem;
import com.microsoft.graph.models.IosAvailableUpdateVersion;
import com.microsoft.graph.requests.WindowsCertificateProfileBaseWithReferenceRequestBuilder;
import com.microsoft.graph.requests.Windows81TrustedRootCertificateWithReferenceRequestBuilder;
import com.microsoft.graph.requests.Windows81TrustedRootCertificateCollectionWithReferencesRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Wired Network Configuration Request.
 */
public class WindowsWiredNetworkConfigurationRequest extends BaseRequest<WindowsWiredNetworkConfiguration> {
	
    /**
     * The request for the WindowsWiredNetworkConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WindowsWiredNetworkConfigurationRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WindowsWiredNetworkConfiguration.class);
    }

    /**
     * Gets the WindowsWiredNetworkConfiguration from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<WindowsWiredNetworkConfiguration> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the WindowsWiredNetworkConfiguration from the service
     *
     * @return the WindowsWiredNetworkConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WindowsWiredNetworkConfiguration get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<WindowsWiredNetworkConfiguration> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public WindowsWiredNetworkConfiguration delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this WindowsWiredNetworkConfiguration with a source
     *
     * @param sourceWindowsWiredNetworkConfiguration the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<WindowsWiredNetworkConfiguration> patchAsync(@Nonnull final WindowsWiredNetworkConfiguration sourceWindowsWiredNetworkConfiguration) {
        return sendAsync(HttpMethod.PATCH, sourceWindowsWiredNetworkConfiguration);
    }

    /**
     * Patches this WindowsWiredNetworkConfiguration with a source
     *
     * @param sourceWindowsWiredNetworkConfiguration the source object with updates
     * @return the updated WindowsWiredNetworkConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WindowsWiredNetworkConfiguration patch(@Nonnull final WindowsWiredNetworkConfiguration sourceWindowsWiredNetworkConfiguration) throws ClientException {
        return send(HttpMethod.PATCH, sourceWindowsWiredNetworkConfiguration);
    }

    /**
     * Creates a WindowsWiredNetworkConfiguration with a new object
     *
     * @param newWindowsWiredNetworkConfiguration the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<WindowsWiredNetworkConfiguration> postAsync(@Nonnull final WindowsWiredNetworkConfiguration newWindowsWiredNetworkConfiguration) {
        return sendAsync(HttpMethod.POST, newWindowsWiredNetworkConfiguration);
    }

    /**
     * Creates a WindowsWiredNetworkConfiguration with a new object
     *
     * @param newWindowsWiredNetworkConfiguration the new object to create
     * @return the created WindowsWiredNetworkConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WindowsWiredNetworkConfiguration post(@Nonnull final WindowsWiredNetworkConfiguration newWindowsWiredNetworkConfiguration) throws ClientException {
        return send(HttpMethod.POST, newWindowsWiredNetworkConfiguration);
    }

    /**
     * Creates a WindowsWiredNetworkConfiguration with a new object
     *
     * @param newWindowsWiredNetworkConfiguration the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<WindowsWiredNetworkConfiguration> putAsync(@Nonnull final WindowsWiredNetworkConfiguration newWindowsWiredNetworkConfiguration) {
        return sendAsync(HttpMethod.PUT, newWindowsWiredNetworkConfiguration);
    }

    /**
     * Creates a WindowsWiredNetworkConfiguration with a new object
     *
     * @param newWindowsWiredNetworkConfiguration the object to create/update
     * @return the created WindowsWiredNetworkConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WindowsWiredNetworkConfiguration put(@Nonnull final WindowsWiredNetworkConfiguration newWindowsWiredNetworkConfiguration) throws ClientException {
        return send(HttpMethod.PUT, newWindowsWiredNetworkConfiguration);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public WindowsWiredNetworkConfigurationRequest select(@Nonnull final String value) {
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
     public WindowsWiredNetworkConfigurationRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

