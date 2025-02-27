// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.IosCertificateProfileBase;
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
 * The class for the Ios Certificate Profile Base Request.
 */
public class IosCertificateProfileBaseRequest extends BaseRequest<IosCertificateProfileBase> {
	
    /**
     * The request for the IosCertificateProfileBase
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public IosCertificateProfileBaseRequest(@Nonnull final String requestUrl,
            @Nonnull final IBaseClient<?> client,
            @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions,
            @Nonnull final Class<? extends IosCertificateProfileBase> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * The request for the IosCertificateProfileBase
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public IosCertificateProfileBaseRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, IosCertificateProfileBase.class);
    }

    /**
     * Gets the IosCertificateProfileBase from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<IosCertificateProfileBase> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the IosCertificateProfileBase from the service
     *
     * @return the IosCertificateProfileBase from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public IosCertificateProfileBase get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<IosCertificateProfileBase> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public IosCertificateProfileBase delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this IosCertificateProfileBase with a source
     *
     * @param sourceIosCertificateProfileBase the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<IosCertificateProfileBase> patchAsync(@Nonnull final IosCertificateProfileBase sourceIosCertificateProfileBase) {
        return sendAsync(HttpMethod.PATCH, sourceIosCertificateProfileBase);
    }

    /**
     * Patches this IosCertificateProfileBase with a source
     *
     * @param sourceIosCertificateProfileBase the source object with updates
     * @return the updated IosCertificateProfileBase
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public IosCertificateProfileBase patch(@Nonnull final IosCertificateProfileBase sourceIosCertificateProfileBase) throws ClientException {
        return send(HttpMethod.PATCH, sourceIosCertificateProfileBase);
    }

    /**
     * Creates a IosCertificateProfileBase with a new object
     *
     * @param newIosCertificateProfileBase the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<IosCertificateProfileBase> postAsync(@Nonnull final IosCertificateProfileBase newIosCertificateProfileBase) {
        return sendAsync(HttpMethod.POST, newIosCertificateProfileBase);
    }

    /**
     * Creates a IosCertificateProfileBase with a new object
     *
     * @param newIosCertificateProfileBase the new object to create
     * @return the created IosCertificateProfileBase
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public IosCertificateProfileBase post(@Nonnull final IosCertificateProfileBase newIosCertificateProfileBase) throws ClientException {
        return send(HttpMethod.POST, newIosCertificateProfileBase);
    }

    /**
     * Creates a IosCertificateProfileBase with a new object
     *
     * @param newIosCertificateProfileBase the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<IosCertificateProfileBase> putAsync(@Nonnull final IosCertificateProfileBase newIosCertificateProfileBase) {
        return sendAsync(HttpMethod.PUT, newIosCertificateProfileBase);
    }

    /**
     * Creates a IosCertificateProfileBase with a new object
     *
     * @param newIosCertificateProfileBase the object to create/update
     * @return the created IosCertificateProfileBase
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public IosCertificateProfileBase put(@Nonnull final IosCertificateProfileBase newIosCertificateProfileBase) throws ClientException {
        return send(HttpMethod.PUT, newIosCertificateProfileBase);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public IosCertificateProfileBaseRequest select(@Nonnull final String value) {
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
     public IosCertificateProfileBaseRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

