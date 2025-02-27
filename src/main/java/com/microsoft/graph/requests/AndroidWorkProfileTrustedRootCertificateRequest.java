// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.AndroidWorkProfileTrustedRootCertificate;
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
 * The class for the Android Work Profile Trusted Root Certificate Request.
 */
public class AndroidWorkProfileTrustedRootCertificateRequest extends BaseRequest<AndroidWorkProfileTrustedRootCertificate> {
	
    /**
     * The request for the AndroidWorkProfileTrustedRootCertificate
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AndroidWorkProfileTrustedRootCertificateRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AndroidWorkProfileTrustedRootCertificate.class);
    }

    /**
     * Gets the AndroidWorkProfileTrustedRootCertificate from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AndroidWorkProfileTrustedRootCertificate> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the AndroidWorkProfileTrustedRootCertificate from the service
     *
     * @return the AndroidWorkProfileTrustedRootCertificate from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AndroidWorkProfileTrustedRootCertificate get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AndroidWorkProfileTrustedRootCertificate> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public AndroidWorkProfileTrustedRootCertificate delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this AndroidWorkProfileTrustedRootCertificate with a source
     *
     * @param sourceAndroidWorkProfileTrustedRootCertificate the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AndroidWorkProfileTrustedRootCertificate> patchAsync(@Nonnull final AndroidWorkProfileTrustedRootCertificate sourceAndroidWorkProfileTrustedRootCertificate) {
        return sendAsync(HttpMethod.PATCH, sourceAndroidWorkProfileTrustedRootCertificate);
    }

    /**
     * Patches this AndroidWorkProfileTrustedRootCertificate with a source
     *
     * @param sourceAndroidWorkProfileTrustedRootCertificate the source object with updates
     * @return the updated AndroidWorkProfileTrustedRootCertificate
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AndroidWorkProfileTrustedRootCertificate patch(@Nonnull final AndroidWorkProfileTrustedRootCertificate sourceAndroidWorkProfileTrustedRootCertificate) throws ClientException {
        return send(HttpMethod.PATCH, sourceAndroidWorkProfileTrustedRootCertificate);
    }

    /**
     * Creates a AndroidWorkProfileTrustedRootCertificate with a new object
     *
     * @param newAndroidWorkProfileTrustedRootCertificate the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AndroidWorkProfileTrustedRootCertificate> postAsync(@Nonnull final AndroidWorkProfileTrustedRootCertificate newAndroidWorkProfileTrustedRootCertificate) {
        return sendAsync(HttpMethod.POST, newAndroidWorkProfileTrustedRootCertificate);
    }

    /**
     * Creates a AndroidWorkProfileTrustedRootCertificate with a new object
     *
     * @param newAndroidWorkProfileTrustedRootCertificate the new object to create
     * @return the created AndroidWorkProfileTrustedRootCertificate
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AndroidWorkProfileTrustedRootCertificate post(@Nonnull final AndroidWorkProfileTrustedRootCertificate newAndroidWorkProfileTrustedRootCertificate) throws ClientException {
        return send(HttpMethod.POST, newAndroidWorkProfileTrustedRootCertificate);
    }

    /**
     * Creates a AndroidWorkProfileTrustedRootCertificate with a new object
     *
     * @param newAndroidWorkProfileTrustedRootCertificate the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AndroidWorkProfileTrustedRootCertificate> putAsync(@Nonnull final AndroidWorkProfileTrustedRootCertificate newAndroidWorkProfileTrustedRootCertificate) {
        return sendAsync(HttpMethod.PUT, newAndroidWorkProfileTrustedRootCertificate);
    }

    /**
     * Creates a AndroidWorkProfileTrustedRootCertificate with a new object
     *
     * @param newAndroidWorkProfileTrustedRootCertificate the object to create/update
     * @return the created AndroidWorkProfileTrustedRootCertificate
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AndroidWorkProfileTrustedRootCertificate put(@Nonnull final AndroidWorkProfileTrustedRootCertificate newAndroidWorkProfileTrustedRootCertificate) throws ClientException {
        return send(HttpMethod.PUT, newAndroidWorkProfileTrustedRootCertificate);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public AndroidWorkProfileTrustedRootCertificateRequest select(@Nonnull final String value) {
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
     public AndroidWorkProfileTrustedRootCertificateRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

