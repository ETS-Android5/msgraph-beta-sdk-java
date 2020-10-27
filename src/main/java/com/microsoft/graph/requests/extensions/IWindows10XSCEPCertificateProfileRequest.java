// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.Windows10XSCEPCertificateProfile;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Windows10XSCEPCertificate Profile Request.
 */
public interface IWindows10XSCEPCertificateProfileRequest extends IHttpRequest {

    /**
     * Gets the Windows10XSCEPCertificateProfile from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super Windows10XSCEPCertificateProfile> callback);

    /**
     * Gets the Windows10XSCEPCertificateProfile from the service
     *
     * @return the Windows10XSCEPCertificateProfile from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Windows10XSCEPCertificateProfile get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super Windows10XSCEPCertificateProfile> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this Windows10XSCEPCertificateProfile with a source
     *
     * @param sourceWindows10XSCEPCertificateProfile the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final Windows10XSCEPCertificateProfile sourceWindows10XSCEPCertificateProfile, final ICallback<? super Windows10XSCEPCertificateProfile> callback);

    /**
     * Patches this Windows10XSCEPCertificateProfile with a source
     *
     * @param sourceWindows10XSCEPCertificateProfile the source object with updates
     * @return the updated Windows10XSCEPCertificateProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Windows10XSCEPCertificateProfile patch(final Windows10XSCEPCertificateProfile sourceWindows10XSCEPCertificateProfile) throws ClientException;

    /**
     * Posts a Windows10XSCEPCertificateProfile with a new object
     *
     * @param newWindows10XSCEPCertificateProfile the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final Windows10XSCEPCertificateProfile newWindows10XSCEPCertificateProfile, final ICallback<? super Windows10XSCEPCertificateProfile> callback);

    /**
     * Posts a Windows10XSCEPCertificateProfile with a new object
     *
     * @param newWindows10XSCEPCertificateProfile the new object to create
     * @return the created Windows10XSCEPCertificateProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Windows10XSCEPCertificateProfile post(final Windows10XSCEPCertificateProfile newWindows10XSCEPCertificateProfile) throws ClientException;

    /**
     * Posts a Windows10XSCEPCertificateProfile with a new object
     *
     * @param newWindows10XSCEPCertificateProfile the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final Windows10XSCEPCertificateProfile newWindows10XSCEPCertificateProfile, final ICallback<? super Windows10XSCEPCertificateProfile> callback);

    /**
     * Posts a Windows10XSCEPCertificateProfile with a new object
     *
     * @param newWindows10XSCEPCertificateProfile the object to create/update
     * @return the created Windows10XSCEPCertificateProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Windows10XSCEPCertificateProfile put(final Windows10XSCEPCertificateProfile newWindows10XSCEPCertificateProfile) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IWindows10XSCEPCertificateProfileRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IWindows10XSCEPCertificateProfileRequest expand(final String value);

}

