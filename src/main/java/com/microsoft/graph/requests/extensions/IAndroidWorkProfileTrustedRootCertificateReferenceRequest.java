// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AndroidWorkProfileTrustedRootCertificate;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.AndroidWorkProfileTrustedRootCertificate;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Android Work Profile Trusted Root Certificate Reference Request.
 */
public interface IAndroidWorkProfileTrustedRootCertificateReferenceRequest extends IHttpRequest {

    void delete(final ICallback<AndroidWorkProfileTrustedRootCertificate> callback);

    AndroidWorkProfileTrustedRootCertificate delete() throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IAndroidWorkProfileTrustedRootCertificateReferenceRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IAndroidWorkProfileTrustedRootCertificateReferenceRequest expand(final String value);

    /**
     * Puts the AndroidWorkProfileTrustedRootCertificate
     *
     * @param srcAndroidWorkProfileTrustedRootCertificate the AndroidWorkProfileTrustedRootCertificate to PUT
     * @param callback the callback to be called after success or failure
     */
    void put(AndroidWorkProfileTrustedRootCertificate srcAndroidWorkProfileTrustedRootCertificate, final ICallback<AndroidWorkProfileTrustedRootCertificate> callback);

    /**
     * Puts the AndroidWorkProfileTrustedRootCertificate
     *
     * @param srcAndroidWorkProfileTrustedRootCertificate the AndroidWorkProfileTrustedRootCertificate to PUT
     * @return the AndroidWorkProfileTrustedRootCertificate
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    AndroidWorkProfileTrustedRootCertificate put(AndroidWorkProfileTrustedRootCertificate srcAndroidWorkProfileTrustedRootCertificate) throws ClientException;
}
