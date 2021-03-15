// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.AndroidWorkProfileGmailEasConfiguration;
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
 * The class for the Android Work Profile Gmail Eas Configuration Request.
 */
public class AndroidWorkProfileGmailEasConfigurationRequest extends BaseRequest<AndroidWorkProfileGmailEasConfiguration> {
	
    /**
     * The request for the AndroidWorkProfileGmailEasConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AndroidWorkProfileGmailEasConfigurationRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AndroidWorkProfileGmailEasConfiguration.class);
    }

    /**
     * Gets the AndroidWorkProfileGmailEasConfiguration from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AndroidWorkProfileGmailEasConfiguration> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the AndroidWorkProfileGmailEasConfiguration from the service
     *
     * @return the AndroidWorkProfileGmailEasConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AndroidWorkProfileGmailEasConfiguration get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AndroidWorkProfileGmailEasConfiguration> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public AndroidWorkProfileGmailEasConfiguration delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this AndroidWorkProfileGmailEasConfiguration with a source
     *
     * @param sourceAndroidWorkProfileGmailEasConfiguration the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AndroidWorkProfileGmailEasConfiguration> patchAsync(@Nonnull final AndroidWorkProfileGmailEasConfiguration sourceAndroidWorkProfileGmailEasConfiguration) {
        return sendAsync(HttpMethod.PATCH, sourceAndroidWorkProfileGmailEasConfiguration);
    }

    /**
     * Patches this AndroidWorkProfileGmailEasConfiguration with a source
     *
     * @param sourceAndroidWorkProfileGmailEasConfiguration the source object with updates
     * @return the updated AndroidWorkProfileGmailEasConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AndroidWorkProfileGmailEasConfiguration patch(@Nonnull final AndroidWorkProfileGmailEasConfiguration sourceAndroidWorkProfileGmailEasConfiguration) throws ClientException {
        return send(HttpMethod.PATCH, sourceAndroidWorkProfileGmailEasConfiguration);
    }

    /**
     * Creates a AndroidWorkProfileGmailEasConfiguration with a new object
     *
     * @param newAndroidWorkProfileGmailEasConfiguration the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AndroidWorkProfileGmailEasConfiguration> postAsync(@Nonnull final AndroidWorkProfileGmailEasConfiguration newAndroidWorkProfileGmailEasConfiguration) {
        return sendAsync(HttpMethod.POST, newAndroidWorkProfileGmailEasConfiguration);
    }

    /**
     * Creates a AndroidWorkProfileGmailEasConfiguration with a new object
     *
     * @param newAndroidWorkProfileGmailEasConfiguration the new object to create
     * @return the created AndroidWorkProfileGmailEasConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AndroidWorkProfileGmailEasConfiguration post(@Nonnull final AndroidWorkProfileGmailEasConfiguration newAndroidWorkProfileGmailEasConfiguration) throws ClientException {
        return send(HttpMethod.POST, newAndroidWorkProfileGmailEasConfiguration);
    }

    /**
     * Creates a AndroidWorkProfileGmailEasConfiguration with a new object
     *
     * @param newAndroidWorkProfileGmailEasConfiguration the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AndroidWorkProfileGmailEasConfiguration> putAsync(@Nonnull final AndroidWorkProfileGmailEasConfiguration newAndroidWorkProfileGmailEasConfiguration) {
        return sendAsync(HttpMethod.PUT, newAndroidWorkProfileGmailEasConfiguration);
    }

    /**
     * Creates a AndroidWorkProfileGmailEasConfiguration with a new object
     *
     * @param newAndroidWorkProfileGmailEasConfiguration the object to create/update
     * @return the created AndroidWorkProfileGmailEasConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AndroidWorkProfileGmailEasConfiguration put(@Nonnull final AndroidWorkProfileGmailEasConfiguration newAndroidWorkProfileGmailEasConfiguration) throws ClientException {
        return send(HttpMethod.PUT, newAndroidWorkProfileGmailEasConfiguration);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public AndroidWorkProfileGmailEasConfigurationRequest select(@Nonnull final String value) {
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
     public AndroidWorkProfileGmailEasConfigurationRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

