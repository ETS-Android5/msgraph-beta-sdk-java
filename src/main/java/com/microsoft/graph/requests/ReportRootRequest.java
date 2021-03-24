// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.ReportRoot;
import com.microsoft.graph.models.ApplicationSignInSummary;
import com.microsoft.graph.models.AzureADFeatureUsage;
import com.microsoft.graph.models.AzureADLicenseUsage;
import com.microsoft.graph.models.AzureADUserFeatureUsage;
import com.microsoft.graph.models.CredentialUsageSummary;
import com.microsoft.graph.models.CredentialUserRegistrationCount;
import com.microsoft.graph.models.RelyingPartyDetailedSummary;
import com.microsoft.graph.models.Report;
import com.microsoft.graph.models.EmailActivitySummary;
import com.microsoft.graph.models.EmailActivityUserDetail;
import com.microsoft.graph.models.EmailAppUsageAppsUserCounts;
import com.microsoft.graph.models.EmailAppUsageUserCounts;
import com.microsoft.graph.models.EmailAppUsageUserDetail;
import com.microsoft.graph.models.EmailAppUsageVersionsUserCounts;
import com.microsoft.graph.models.MailboxUsageDetail;
import com.microsoft.graph.models.MailboxUsageMailboxCounts;
import com.microsoft.graph.models.MailboxUsageQuotaStatusMailboxCounts;
import com.microsoft.graph.models.MailboxUsageStorage;
import com.microsoft.graph.models.Office365ActivationCounts;
import com.microsoft.graph.models.Office365ActivationsUserCounts;
import com.microsoft.graph.models.Office365ActivationsUserDetail;
import com.microsoft.graph.models.Office365ActiveUserCounts;
import com.microsoft.graph.models.Office365ActiveUserDetail;
import com.microsoft.graph.models.Office365GroupsActivityCounts;
import com.microsoft.graph.models.Office365GroupsActivityDetail;
import com.microsoft.graph.models.Office365GroupsActivityFileCounts;
import com.microsoft.graph.models.Office365GroupsActivityGroupCounts;
import com.microsoft.graph.models.Office365GroupsActivityStorage;
import com.microsoft.graph.models.Office365ServicesUserCounts;
import com.microsoft.graph.models.SiteActivitySummary;
import com.microsoft.graph.models.OneDriveActivityUserDetail;
import com.microsoft.graph.models.OneDriveUsageAccountCounts;
import com.microsoft.graph.models.OneDriveUsageAccountDetail;
import com.microsoft.graph.models.OneDriveUsageFileCounts;
import com.microsoft.graph.models.SiteUsageStorage;
import com.microsoft.graph.models.SharePointActivityPages;
import com.microsoft.graph.models.SharePointActivityUserCounts;
import com.microsoft.graph.models.SharePointActivityUserDetail;
import com.microsoft.graph.models.SharePointSiteUsageDetail;
import com.microsoft.graph.models.SharePointSiteUsageFileCounts;
import com.microsoft.graph.models.SharePointSiteUsagePages;
import com.microsoft.graph.models.SharePointSiteUsageSiteCounts;
import com.microsoft.graph.models.SkypeForBusinessActivityCounts;
import com.microsoft.graph.models.SkypeForBusinessActivityUserCounts;
import com.microsoft.graph.models.SkypeForBusinessActivityUserDetail;
import com.microsoft.graph.models.SkypeForBusinessDeviceUsageDistributionUserCounts;
import com.microsoft.graph.models.SkypeForBusinessDeviceUsageUserCounts;
import com.microsoft.graph.models.SkypeForBusinessDeviceUsageUserDetail;
import com.microsoft.graph.models.SkypeForBusinessOrganizerActivityCounts;
import com.microsoft.graph.models.SkypeForBusinessOrganizerActivityMinuteCounts;
import com.microsoft.graph.models.SkypeForBusinessOrganizerActivityUserCounts;
import com.microsoft.graph.models.SkypeForBusinessParticipantActivityCounts;
import com.microsoft.graph.models.SkypeForBusinessParticipantActivityMinuteCounts;
import com.microsoft.graph.models.SkypeForBusinessParticipantActivityUserCounts;
import com.microsoft.graph.models.SkypeForBusinessPeerToPeerActivityCounts;
import com.microsoft.graph.models.SkypeForBusinessPeerToPeerActivityMinuteCounts;
import com.microsoft.graph.models.SkypeForBusinessPeerToPeerActivityUserCounts;
import com.microsoft.graph.models.TeamsDeviceUsageDistributionUserCounts;
import com.microsoft.graph.models.TeamsDeviceUsageUserCounts;
import com.microsoft.graph.models.TeamsDeviceUsageUserDetail;
import com.microsoft.graph.models.TeamsUserActivityCounts;
import com.microsoft.graph.models.TeamsUserActivityDistributionUserCounts;
import com.microsoft.graph.models.TeamsUserActivityUserCounts;
import com.microsoft.graph.models.TeamsUserActivityUserDetail;
import com.microsoft.graph.models.YammerActivitySummary;
import com.microsoft.graph.models.YammerActivityUserDetail;
import com.microsoft.graph.models.YammerDeviceUsageDistributionUserCounts;
import com.microsoft.graph.models.YammerDeviceUsageUserCounts;
import com.microsoft.graph.models.YammerDeviceUsageUserDetail;
import com.microsoft.graph.models.YammerGroupsActivityCounts;
import com.microsoft.graph.models.YammerGroupsActivityDetail;
import com.microsoft.graph.models.YammerGroupsActivityGroupCounts;
import com.microsoft.graph.models.ArchivedPrintJob;
import com.microsoft.graph.models.GroupPrintUsageSummary;
import com.microsoft.graph.models.OverallPrintUsageSummary;
import com.microsoft.graph.models.PrinterUsageSummary;
import com.microsoft.graph.models.PrintUsageSummary;
import com.microsoft.graph.models.UserPrintUsageSummary;
import com.microsoft.graph.requests.ApplicationSignInDetailedSummaryCollectionRequestBuilder;
import com.microsoft.graph.requests.ApplicationSignInDetailedSummaryRequestBuilder;
import com.microsoft.graph.requests.AuthenticationMethodsRootRequestBuilder;
import com.microsoft.graph.requests.CredentialUserRegistrationDetailsCollectionRequestBuilder;
import com.microsoft.graph.requests.CredentialUserRegistrationDetailsRequestBuilder;
import com.microsoft.graph.requests.UserCredentialUsageDetailsCollectionRequestBuilder;
import com.microsoft.graph.requests.UserCredentialUsageDetailsRequestBuilder;
import com.microsoft.graph.requests.PrintUsageByPrinterCollectionRequestBuilder;
import com.microsoft.graph.requests.PrintUsageByPrinterRequestBuilder;
import com.microsoft.graph.requests.PrintUsageByUserCollectionRequestBuilder;
import com.microsoft.graph.requests.PrintUsageByUserRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Request.
 */
public class ReportRootRequest extends BaseRequest<ReportRoot> {
	
    /**
     * The request for the ReportRoot
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ReportRootRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ReportRoot.class);
    }

    /**
     * Gets the ReportRoot from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ReportRoot> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the ReportRoot from the service
     *
     * @return the ReportRoot from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ReportRoot get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ReportRoot> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public ReportRoot delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this ReportRoot with a source
     *
     * @param sourceReportRoot the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ReportRoot> patchAsync(@Nonnull final ReportRoot sourceReportRoot) {
        return sendAsync(HttpMethod.PATCH, sourceReportRoot);
    }

    /**
     * Patches this ReportRoot with a source
     *
     * @param sourceReportRoot the source object with updates
     * @return the updated ReportRoot
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ReportRoot patch(@Nonnull final ReportRoot sourceReportRoot) throws ClientException {
        return send(HttpMethod.PATCH, sourceReportRoot);
    }

    /**
     * Creates a ReportRoot with a new object
     *
     * @param newReportRoot the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ReportRoot> postAsync(@Nonnull final ReportRoot newReportRoot) {
        return sendAsync(HttpMethod.POST, newReportRoot);
    }

    /**
     * Creates a ReportRoot with a new object
     *
     * @param newReportRoot the new object to create
     * @return the created ReportRoot
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ReportRoot post(@Nonnull final ReportRoot newReportRoot) throws ClientException {
        return send(HttpMethod.POST, newReportRoot);
    }

    /**
     * Creates a ReportRoot with a new object
     *
     * @param newReportRoot the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ReportRoot> putAsync(@Nonnull final ReportRoot newReportRoot) {
        return sendAsync(HttpMethod.PUT, newReportRoot);
    }

    /**
     * Creates a ReportRoot with a new object
     *
     * @param newReportRoot the object to create/update
     * @return the created ReportRoot
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ReportRoot put(@Nonnull final ReportRoot newReportRoot) throws ClientException {
        return send(HttpMethod.PUT, newReportRoot);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public ReportRootRequest select(@Nonnull final String value) {
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
     public ReportRootRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

