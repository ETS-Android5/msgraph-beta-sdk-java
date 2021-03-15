// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.Site;
import com.microsoft.graph.models.ItemActivityStat;
import com.microsoft.graph.models.ContentType;
import com.microsoft.graph.requests.ItemAnalyticsWithReferenceRequestBuilder;
import com.microsoft.graph.requests.ColumnDefinitionCollectionRequestBuilder;
import com.microsoft.graph.requests.ColumnDefinitionRequestBuilder;
import com.microsoft.graph.requests.ContentTypeCollectionRequestBuilder;
import com.microsoft.graph.requests.ContentTypeRequestBuilder;
import com.microsoft.graph.requests.DriveRequestBuilder;
import com.microsoft.graph.requests.DriveCollectionRequestBuilder;
import com.microsoft.graph.requests.ColumnDefinitionCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.ColumnDefinitionWithReferenceRequestBuilder;
import com.microsoft.graph.requests.BaseItemCollectionRequestBuilder;
import com.microsoft.graph.requests.BaseItemRequestBuilder;
import com.microsoft.graph.requests.ListCollectionRequestBuilder;
import com.microsoft.graph.requests.ListRequestBuilder;
import com.microsoft.graph.requests.SitePageCollectionRequestBuilder;
import com.microsoft.graph.requests.SitePageRequestBuilder;
import com.microsoft.graph.requests.PermissionCollectionRequestBuilder;
import com.microsoft.graph.requests.PermissionRequestBuilder;
import com.microsoft.graph.requests.SiteCollectionRequestBuilder;
import com.microsoft.graph.requests.SiteRequestBuilder;
import com.microsoft.graph.requests.OnenoteRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.models.SiteGetActivitiesByIntervalParameterSet;
import com.microsoft.graph.models.SiteGetApplicableContentTypesForListParameterSet;
import com.microsoft.graph.models.SiteGetByPathParameterSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Site Request Builder.
 */
public class SiteRequestBuilder extends BaseRequestBuilder<Site> {

    /**
     * The request builder for the Site
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SiteRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the SiteRequest instance
     */
    @Nonnull
    public SiteRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the SiteRequest instance
     */
    @Nonnull
    public SiteRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.SiteRequest(getRequestUrl(), getClient(), requestOptions);
    }



    /**
     * Gets the request builder for User
     *
     * @return the UserWithReferenceRequestBuilder instance
     */
    @Nonnull
    public UserWithReferenceRequestBuilder createdByUser() {
        return new UserWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("createdByUser"), getClient(), null);
    }

    /**
     * Gets the request builder for User
     *
     * @return the UserWithReferenceRequestBuilder instance
     */
    @Nonnull
    public UserWithReferenceRequestBuilder lastModifiedByUser() {
        return new UserWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("lastModifiedByUser"), getClient(), null);
    }

    /**
     * Gets the request builder for ItemAnalytics
     *
     * @return the ItemAnalyticsWithReferenceRequestBuilder instance
     */
    @Nonnull
    public ItemAnalyticsWithReferenceRequestBuilder analytics() {
        return new ItemAnalyticsWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("analytics"), getClient(), null);
    }
    /**
     *  Gets a request builder for the ColumnDefinition collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public ColumnDefinitionCollectionRequestBuilder columns() {
        return new ColumnDefinitionCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("columns"), getClient(), null);
    }

    /**
     * Gets a request builder for the ColumnDefinition item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public ColumnDefinitionRequestBuilder columns(@Nonnull final String id) {
        return new ColumnDefinitionRequestBuilder(getRequestUrlWithAdditionalSegment("columns") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the ContentType collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public ContentTypeCollectionRequestBuilder contentTypes() {
        return new ContentTypeCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("contentTypes"), getClient(), null);
    }

    /**
     * Gets a request builder for the ContentType item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public ContentTypeRequestBuilder contentTypes(@Nonnull final String id) {
        return new ContentTypeRequestBuilder(getRequestUrlWithAdditionalSegment("contentTypes") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for Drive
     *
     * @return the DriveRequestBuilder instance
     */
    @Nonnull
    public DriveRequestBuilder drive() {
        return new DriveRequestBuilder(getRequestUrlWithAdditionalSegment("drive"), getClient(), null);
    }
    /**
     *  Gets a request builder for the Drive collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public DriveCollectionRequestBuilder drives() {
        return new DriveCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("drives"), getClient(), null);
    }

    /**
     * Gets a request builder for the Drive item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public DriveRequestBuilder drives(@Nonnull final String id) {
        return new DriveRequestBuilder(getRequestUrlWithAdditionalSegment("drives") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the ColumnDefinition collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public ColumnDefinitionCollectionWithReferencesRequestBuilder externalColumns() {
        return new ColumnDefinitionCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("externalColumns"), getClient(), null);
    }

    /**
     * Gets a request builder for the ColumnDefinition item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public ColumnDefinitionWithReferenceRequestBuilder externalColumns(@Nonnull final String id) {
        return new ColumnDefinitionWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("externalColumns") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the BaseItem collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public BaseItemCollectionRequestBuilder items() {
        return new BaseItemCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("items"), getClient(), null);
    }

    /**
     * Gets a request builder for the BaseItem item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public BaseItemRequestBuilder items(@Nonnull final String id) {
        return new BaseItemRequestBuilder(getRequestUrlWithAdditionalSegment("items") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the List collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public ListCollectionRequestBuilder lists() {
        return new ListCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("lists"), getClient(), null);
    }

    /**
     * Gets a request builder for the List item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public ListRequestBuilder lists(@Nonnull final String id) {
        return new ListRequestBuilder(getRequestUrlWithAdditionalSegment("lists") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the SitePage collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public SitePageCollectionRequestBuilder pages() {
        return new SitePageCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("pages"), getClient(), null);
    }

    /**
     * Gets a request builder for the SitePage item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public SitePageRequestBuilder pages(@Nonnull final String id) {
        return new SitePageRequestBuilder(getRequestUrlWithAdditionalSegment("pages") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the Permission collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public PermissionCollectionRequestBuilder permissions() {
        return new PermissionCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("permissions"), getClient(), null);
    }

    /**
     * Gets a request builder for the Permission item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public PermissionRequestBuilder permissions(@Nonnull final String id) {
        return new PermissionRequestBuilder(getRequestUrlWithAdditionalSegment("permissions") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the Site collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public SiteCollectionRequestBuilder sites() {
        return new SiteCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("sites"), getClient(), null);
    }

    /**
     * Gets a request builder for the Site item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public SiteRequestBuilder sites(@Nonnull final String id) {
        return new SiteRequestBuilder(getRequestUrlWithAdditionalSegment("sites") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for Onenote
     *
     * @return the OnenoteRequestBuilder instance
     */
    @Nonnull
    public OnenoteRequestBuilder onenote() {
        return new OnenoteRequestBuilder(getRequestUrlWithAdditionalSegment("onenote"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public SiteGetActivitiesByIntervalCollectionRequestBuilder getActivitiesByInterval(@Nonnull final SiteGetActivitiesByIntervalParameterSet parameters) {
        return new SiteGetActivitiesByIntervalCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getActivitiesByInterval"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public SiteGetApplicableContentTypesForListCollectionRequestBuilder getApplicableContentTypesForList(@Nonnull final SiteGetApplicableContentTypesForListParameterSet parameters) {
        return new SiteGetApplicableContentTypesForListCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getApplicableContentTypesForList"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public SiteGetByPathRequestBuilder getByPath(@Nonnull final SiteGetByPathParameterSet parameters) {
        return new SiteGetByPathRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getByPath"), getClient(), null, parameters);
    }
}
