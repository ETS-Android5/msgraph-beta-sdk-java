// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WindowsInformationProtectionDeviceRegistration;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.WindowsInformationProtectionDeviceRegistration;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;


// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Windows Information Protection Device Registration With Reference Request.
 */
public interface IWindowsInformationProtectionDeviceRegistrationWithReferenceRequest extends IHttpRequest {

    void post(final WindowsInformationProtectionDeviceRegistration newWindowsInformationProtectionDeviceRegistration, final IJsonBackedObject payload, final ICallback<WindowsInformationProtectionDeviceRegistration> callback);

    WindowsInformationProtectionDeviceRegistration post(final WindowsInformationProtectionDeviceRegistration newWindowsInformationProtectionDeviceRegistration, final IJsonBackedObject payload) throws ClientException;

    void get(final ICallback<WindowsInformationProtectionDeviceRegistration> callback);

    WindowsInformationProtectionDeviceRegistration get() throws ClientException;

	void delete(final ICallback<WindowsInformationProtectionDeviceRegistration> callback);

	void delete() throws ClientException;

	void patch(final WindowsInformationProtectionDeviceRegistration sourceWindowsInformationProtectionDeviceRegistration, final ICallback<WindowsInformationProtectionDeviceRegistration> callback);

	WindowsInformationProtectionDeviceRegistration patch(final WindowsInformationProtectionDeviceRegistration sourceWindowsInformationProtectionDeviceRegistration) throws ClientException;

    IWindowsInformationProtectionDeviceRegistrationWithReferenceRequest select(final String value);

    IWindowsInformationProtectionDeviceRegistrationWithReferenceRequest expand(final String value);

}
