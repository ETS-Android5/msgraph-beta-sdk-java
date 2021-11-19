// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.DeviceManagementCompliancePolicy;
import com.microsoft.graph.models.DeviceManagementConfigurationPolicyAssignment;
import com.microsoft.graph.models.DeviceManagementComplianceScheduledActionForRule;
import com.microsoft.graph.requests.DeviceManagementConfigurationPolicyAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.DeviceManagementConfigurationPolicyAssignmentRequestBuilder;
import com.microsoft.graph.requests.DeviceManagementComplianceScheduledActionForRuleCollectionRequestBuilder;
import com.microsoft.graph.requests.DeviceManagementComplianceScheduledActionForRuleRequestBuilder;
import com.microsoft.graph.requests.DeviceManagementConfigurationSettingCollectionRequestBuilder;
import com.microsoft.graph.requests.DeviceManagementConfigurationSettingRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Compliance Policy Request.
 */
public class DeviceManagementCompliancePolicyRequest extends BaseRequest<DeviceManagementCompliancePolicy> {
	
    /**
     * The request for the DeviceManagementCompliancePolicy
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceManagementCompliancePolicyRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceManagementCompliancePolicy.class);
    }

    /**
     * Gets the DeviceManagementCompliancePolicy from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceManagementCompliancePolicy> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the DeviceManagementCompliancePolicy from the service
     *
     * @return the DeviceManagementCompliancePolicy from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceManagementCompliancePolicy get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceManagementCompliancePolicy> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public DeviceManagementCompliancePolicy delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this DeviceManagementCompliancePolicy with a source
     *
     * @param sourceDeviceManagementCompliancePolicy the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceManagementCompliancePolicy> patchAsync(@Nonnull final DeviceManagementCompliancePolicy sourceDeviceManagementCompliancePolicy) {
        return sendAsync(HttpMethod.PATCH, sourceDeviceManagementCompliancePolicy);
    }

    /**
     * Patches this DeviceManagementCompliancePolicy with a source
     *
     * @param sourceDeviceManagementCompliancePolicy the source object with updates
     * @return the updated DeviceManagementCompliancePolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceManagementCompliancePolicy patch(@Nonnull final DeviceManagementCompliancePolicy sourceDeviceManagementCompliancePolicy) throws ClientException {
        return send(HttpMethod.PATCH, sourceDeviceManagementCompliancePolicy);
    }

    /**
     * Creates a DeviceManagementCompliancePolicy with a new object
     *
     * @param newDeviceManagementCompliancePolicy the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceManagementCompliancePolicy> postAsync(@Nonnull final DeviceManagementCompliancePolicy newDeviceManagementCompliancePolicy) {
        return sendAsync(HttpMethod.POST, newDeviceManagementCompliancePolicy);
    }

    /**
     * Creates a DeviceManagementCompliancePolicy with a new object
     *
     * @param newDeviceManagementCompliancePolicy the new object to create
     * @return the created DeviceManagementCompliancePolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceManagementCompliancePolicy post(@Nonnull final DeviceManagementCompliancePolicy newDeviceManagementCompliancePolicy) throws ClientException {
        return send(HttpMethod.POST, newDeviceManagementCompliancePolicy);
    }

    /**
     * Creates a DeviceManagementCompliancePolicy with a new object
     *
     * @param newDeviceManagementCompliancePolicy the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceManagementCompliancePolicy> putAsync(@Nonnull final DeviceManagementCompliancePolicy newDeviceManagementCompliancePolicy) {
        return sendAsync(HttpMethod.PUT, newDeviceManagementCompliancePolicy);
    }

    /**
     * Creates a DeviceManagementCompliancePolicy with a new object
     *
     * @param newDeviceManagementCompliancePolicy the object to create/update
     * @return the created DeviceManagementCompliancePolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceManagementCompliancePolicy put(@Nonnull final DeviceManagementCompliancePolicy newDeviceManagementCompliancePolicy) throws ClientException {
        return send(HttpMethod.PUT, newDeviceManagementCompliancePolicy);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public DeviceManagementCompliancePolicyRequest select(@Nonnull final String value) {
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
     public DeviceManagementCompliancePolicyRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

