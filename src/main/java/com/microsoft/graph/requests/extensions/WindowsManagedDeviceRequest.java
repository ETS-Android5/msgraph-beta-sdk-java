// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WindowsManagedDevice;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Managed Device Request.
 */
public class WindowsManagedDeviceRequest extends BaseRequest implements IWindowsManagedDeviceRequest {
	
    /**
     * The request for the WindowsManagedDevice
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WindowsManagedDeviceRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WindowsManagedDevice.class);
    }

    /**
     * Gets the WindowsManagedDevice from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<WindowsManagedDevice> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the WindowsManagedDevice from the service
     *
     * @return the WindowsManagedDevice from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WindowsManagedDevice get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<WindowsManagedDevice> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this WindowsManagedDevice with a source
     *
     * @param sourceWindowsManagedDevice the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final WindowsManagedDevice sourceWindowsManagedDevice, final ICallback<WindowsManagedDevice> callback) {
        send(HttpMethod.PATCH, callback, sourceWindowsManagedDevice);
    }

    /**
     * Patches this WindowsManagedDevice with a source
     *
     * @param sourceWindowsManagedDevice the source object with updates
     * @return the updated WindowsManagedDevice
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WindowsManagedDevice patch(final WindowsManagedDevice sourceWindowsManagedDevice) throws ClientException {
        return send(HttpMethod.PATCH, sourceWindowsManagedDevice);
    }

    /**
     * Creates a WindowsManagedDevice with a new object
     *
     * @param newWindowsManagedDevice the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final WindowsManagedDevice newWindowsManagedDevice, final ICallback<WindowsManagedDevice> callback) {
        send(HttpMethod.POST, callback, newWindowsManagedDevice);
    }

    /**
     * Creates a WindowsManagedDevice with a new object
     *
     * @param newWindowsManagedDevice the new object to create
     * @return the created WindowsManagedDevice
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WindowsManagedDevice post(final WindowsManagedDevice newWindowsManagedDevice) throws ClientException {
        return send(HttpMethod.POST, newWindowsManagedDevice);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IWindowsManagedDeviceRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (WindowsManagedDeviceRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IWindowsManagedDeviceRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (WindowsManagedDeviceRequest)this;
     }

}

