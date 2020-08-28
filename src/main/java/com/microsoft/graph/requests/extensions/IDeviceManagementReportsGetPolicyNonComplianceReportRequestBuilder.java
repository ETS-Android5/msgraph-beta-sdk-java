// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IDeviceManagementReportsGetPolicyNonComplianceReportRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Device Management Reports Get Policy Non Compliance Report Request Builder.
 */
public interface IDeviceManagementReportsGetPolicyNonComplianceReportRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IDeviceManagementReportsGetPolicyNonComplianceReportRequest
     *
     * @return the IDeviceManagementReportsGetPolicyNonComplianceReportRequest instance
     */
    IDeviceManagementReportsGetPolicyNonComplianceReportRequest buildRequest();

    /**
     * Creates the IDeviceManagementReportsGetPolicyNonComplianceReportRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IDeviceManagementReportsGetPolicyNonComplianceReportRequest instance
     */
    IDeviceManagementReportsGetPolicyNonComplianceReportRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
