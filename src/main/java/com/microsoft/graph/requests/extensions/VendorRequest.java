// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Vendor;
import com.microsoft.graph.requests.extensions.ICurrencyRequestBuilder;
import com.microsoft.graph.requests.extensions.CurrencyRequestBuilder;
import com.microsoft.graph.requests.extensions.IPaymentMethodRequestBuilder;
import com.microsoft.graph.requests.extensions.PaymentMethodRequestBuilder;
import com.microsoft.graph.requests.extensions.IPaymentTermRequestBuilder;
import com.microsoft.graph.requests.extensions.PaymentTermRequestBuilder;
import com.microsoft.graph.requests.extensions.IPictureCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPictureRequestBuilder;
import com.microsoft.graph.requests.extensions.PictureCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PictureRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Vendor Request.
 */
public class VendorRequest extends BaseRequest implements IVendorRequest {
	
    /**
     * The request for the Vendor
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public VendorRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Vendor.class);
    }

    /**
     * Gets the Vendor from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super Vendor> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the Vendor from the service
     *
     * @return the Vendor from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Vendor get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super Vendor> callback) {
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
     * Patches this Vendor with a source
     *
     * @param sourceVendor the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final Vendor sourceVendor, final ICallback<? super Vendor> callback) {
        send(HttpMethod.PATCH, callback, sourceVendor);
    }

    /**
     * Patches this Vendor with a source
     *
     * @param sourceVendor the source object with updates
     * @return the updated Vendor
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Vendor patch(final Vendor sourceVendor) throws ClientException {
        return send(HttpMethod.PATCH, sourceVendor);
    }

    /**
     * Creates a Vendor with a new object
     *
     * @param newVendor the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final Vendor newVendor, final ICallback<? super Vendor> callback) {
        send(HttpMethod.POST, callback, newVendor);
    }

    /**
     * Creates a Vendor with a new object
     *
     * @param newVendor the new object to create
     * @return the created Vendor
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Vendor post(final Vendor newVendor) throws ClientException {
        return send(HttpMethod.POST, newVendor);
    }

    /**
     * Creates a Vendor with a new object
     *
     * @param newVendor the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final Vendor newVendor, final ICallback<? super Vendor> callback) {
        send(HttpMethod.PUT, callback, newVendor);
    }

    /**
     * Creates a Vendor with a new object
     *
     * @param newVendor the object to create/update
     * @return the created Vendor
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Vendor put(final Vendor newVendor) throws ClientException {
        return send(HttpMethod.PUT, newVendor);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IVendorRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (VendorRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IVendorRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (VendorRequest)this;
     }

}

