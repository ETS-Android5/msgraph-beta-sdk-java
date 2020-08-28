// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceManagementDerivedCredentialSettings;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Derived Credential Settings Reference Request.
 */
public class DeviceManagementDerivedCredentialSettingsReferenceRequest extends BaseRequest implements IDeviceManagementDerivedCredentialSettingsReferenceRequest {

    /**
     * The request for the DeviceManagementDerivedCredentialSettings
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceManagementDerivedCredentialSettingsReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceManagementDerivedCredentialSettings.class);
    }

    public void delete(final ICallback<DeviceManagementDerivedCredentialSettings> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    public DeviceManagementDerivedCredentialSettings delete() throws ClientException {
       return send(HttpMethod.DELETE, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IDeviceManagementDerivedCredentialSettingsReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (DeviceManagementDerivedCredentialSettingsReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IDeviceManagementDerivedCredentialSettingsReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (DeviceManagementDerivedCredentialSettingsReferenceRequest)this;
    }
    /**
     * Puts the DeviceManagementDerivedCredentialSettings
     *
     * @param srcDeviceManagementDerivedCredentialSettings the DeviceManagementDerivedCredentialSettings reference to PUT
     * @param callback the callback to be called after success or failure
     */
    public void put(DeviceManagementDerivedCredentialSettings srcDeviceManagementDerivedCredentialSettings, final ICallback<DeviceManagementDerivedCredentialSettings> callback) {
        send(HttpMethod.PUT, callback, srcDeviceManagementDerivedCredentialSettings);
    }

    /**
     * Puts the DeviceManagementDerivedCredentialSettings
     *
     * @param srcDeviceManagementDerivedCredentialSettings the DeviceManagementDerivedCredentialSettings reference to PUT
     * @return the DeviceManagementDerivedCredentialSettings
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public DeviceManagementDerivedCredentialSettings put(DeviceManagementDerivedCredentialSettings srcDeviceManagementDerivedCredentialSettings) throws ClientException {
        return send(HttpMethod.PUT, srcDeviceManagementDerivedCredentialSettings);
    }
}
