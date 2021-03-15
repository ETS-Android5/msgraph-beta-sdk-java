// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.Windows10SecureAssessmentConfiguration;
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
 * The class for the Windows10Secure Assessment Configuration Request.
 */
public class Windows10SecureAssessmentConfigurationRequest extends BaseRequest<Windows10SecureAssessmentConfiguration> {
	
    /**
     * The request for the Windows10SecureAssessmentConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public Windows10SecureAssessmentConfigurationRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Windows10SecureAssessmentConfiguration.class);
    }

    /**
     * Gets the Windows10SecureAssessmentConfiguration from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Windows10SecureAssessmentConfiguration> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the Windows10SecureAssessmentConfiguration from the service
     *
     * @return the Windows10SecureAssessmentConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Windows10SecureAssessmentConfiguration get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Windows10SecureAssessmentConfiguration> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public Windows10SecureAssessmentConfiguration delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this Windows10SecureAssessmentConfiguration with a source
     *
     * @param sourceWindows10SecureAssessmentConfiguration the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Windows10SecureAssessmentConfiguration> patchAsync(@Nonnull final Windows10SecureAssessmentConfiguration sourceWindows10SecureAssessmentConfiguration) {
        return sendAsync(HttpMethod.PATCH, sourceWindows10SecureAssessmentConfiguration);
    }

    /**
     * Patches this Windows10SecureAssessmentConfiguration with a source
     *
     * @param sourceWindows10SecureAssessmentConfiguration the source object with updates
     * @return the updated Windows10SecureAssessmentConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Windows10SecureAssessmentConfiguration patch(@Nonnull final Windows10SecureAssessmentConfiguration sourceWindows10SecureAssessmentConfiguration) throws ClientException {
        return send(HttpMethod.PATCH, sourceWindows10SecureAssessmentConfiguration);
    }

    /**
     * Creates a Windows10SecureAssessmentConfiguration with a new object
     *
     * @param newWindows10SecureAssessmentConfiguration the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Windows10SecureAssessmentConfiguration> postAsync(@Nonnull final Windows10SecureAssessmentConfiguration newWindows10SecureAssessmentConfiguration) {
        return sendAsync(HttpMethod.POST, newWindows10SecureAssessmentConfiguration);
    }

    /**
     * Creates a Windows10SecureAssessmentConfiguration with a new object
     *
     * @param newWindows10SecureAssessmentConfiguration the new object to create
     * @return the created Windows10SecureAssessmentConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Windows10SecureAssessmentConfiguration post(@Nonnull final Windows10SecureAssessmentConfiguration newWindows10SecureAssessmentConfiguration) throws ClientException {
        return send(HttpMethod.POST, newWindows10SecureAssessmentConfiguration);
    }

    /**
     * Creates a Windows10SecureAssessmentConfiguration with a new object
     *
     * @param newWindows10SecureAssessmentConfiguration the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Windows10SecureAssessmentConfiguration> putAsync(@Nonnull final Windows10SecureAssessmentConfiguration newWindows10SecureAssessmentConfiguration) {
        return sendAsync(HttpMethod.PUT, newWindows10SecureAssessmentConfiguration);
    }

    /**
     * Creates a Windows10SecureAssessmentConfiguration with a new object
     *
     * @param newWindows10SecureAssessmentConfiguration the object to create/update
     * @return the created Windows10SecureAssessmentConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Windows10SecureAssessmentConfiguration put(@Nonnull final Windows10SecureAssessmentConfiguration newWindows10SecureAssessmentConfiguration) throws ClientException {
        return send(HttpMethod.PUT, newWindows10SecureAssessmentConfiguration);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public Windows10SecureAssessmentConfigurationRequest select(@Nonnull final String value) {
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
     public Windows10SecureAssessmentConfigurationRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

