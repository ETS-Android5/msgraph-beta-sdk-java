// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AndroidForWorkImportedPFXCertificateProfile;
import com.microsoft.graph.requests.extensions.IManagedDeviceCertificateStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedDeviceCertificateStateRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedDeviceCertificateStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedDeviceCertificateStateRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Android For Work Imported PFXCertificate Profile Request.
 */
public class AndroidForWorkImportedPFXCertificateProfileRequest extends BaseRequest implements IAndroidForWorkImportedPFXCertificateProfileRequest {
	
    /**
     * The request for the AndroidForWorkImportedPFXCertificateProfile
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AndroidForWorkImportedPFXCertificateProfileRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AndroidForWorkImportedPFXCertificateProfile.class);
    }

    /**
     * Gets the AndroidForWorkImportedPFXCertificateProfile from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<AndroidForWorkImportedPFXCertificateProfile> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the AndroidForWorkImportedPFXCertificateProfile from the service
     *
     * @return the AndroidForWorkImportedPFXCertificateProfile from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AndroidForWorkImportedPFXCertificateProfile get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<AndroidForWorkImportedPFXCertificateProfile> callback) {
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
     * Patches this AndroidForWorkImportedPFXCertificateProfile with a source
     *
     * @param sourceAndroidForWorkImportedPFXCertificateProfile the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final AndroidForWorkImportedPFXCertificateProfile sourceAndroidForWorkImportedPFXCertificateProfile, final ICallback<AndroidForWorkImportedPFXCertificateProfile> callback) {
        send(HttpMethod.PATCH, callback, sourceAndroidForWorkImportedPFXCertificateProfile);
    }

    /**
     * Patches this AndroidForWorkImportedPFXCertificateProfile with a source
     *
     * @param sourceAndroidForWorkImportedPFXCertificateProfile the source object with updates
     * @return the updated AndroidForWorkImportedPFXCertificateProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AndroidForWorkImportedPFXCertificateProfile patch(final AndroidForWorkImportedPFXCertificateProfile sourceAndroidForWorkImportedPFXCertificateProfile) throws ClientException {
        return send(HttpMethod.PATCH, sourceAndroidForWorkImportedPFXCertificateProfile);
    }

    /**
     * Creates a AndroidForWorkImportedPFXCertificateProfile with a new object
     *
     * @param newAndroidForWorkImportedPFXCertificateProfile the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final AndroidForWorkImportedPFXCertificateProfile newAndroidForWorkImportedPFXCertificateProfile, final ICallback<AndroidForWorkImportedPFXCertificateProfile> callback) {
        send(HttpMethod.POST, callback, newAndroidForWorkImportedPFXCertificateProfile);
    }

    /**
     * Creates a AndroidForWorkImportedPFXCertificateProfile with a new object
     *
     * @param newAndroidForWorkImportedPFXCertificateProfile the new object to create
     * @return the created AndroidForWorkImportedPFXCertificateProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AndroidForWorkImportedPFXCertificateProfile post(final AndroidForWorkImportedPFXCertificateProfile newAndroidForWorkImportedPFXCertificateProfile) throws ClientException {
        return send(HttpMethod.POST, newAndroidForWorkImportedPFXCertificateProfile);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IAndroidForWorkImportedPFXCertificateProfileRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (AndroidForWorkImportedPFXCertificateProfileRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IAndroidForWorkImportedPFXCertificateProfileRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (AndroidForWorkImportedPFXCertificateProfileRequest)this;
     }

}

