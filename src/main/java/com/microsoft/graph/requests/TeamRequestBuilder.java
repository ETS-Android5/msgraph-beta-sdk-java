// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.Team;
import com.microsoft.graph.models.TeamVisibilityType;
import com.microsoft.graph.models.ClonableTeamParts;
import java.util.EnumSet;
import com.microsoft.graph.models.TeamworkActivityTopic;
import com.microsoft.graph.models.ItemBody;
import com.microsoft.graph.models.KeyValuePair;
import com.microsoft.graph.models.TeamworkNotificationRecipient;
import com.microsoft.graph.models.ChatMessage;
import com.microsoft.graph.requests.ChannelCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.ChannelWithReferenceRequestBuilder;
import com.microsoft.graph.requests.ChannelCollectionRequestBuilder;
import com.microsoft.graph.requests.ChannelRequestBuilder;
import com.microsoft.graph.requests.GroupWithReferenceRequestBuilder;
import com.microsoft.graph.requests.TeamsAppInstallationCollectionRequestBuilder;
import com.microsoft.graph.requests.TeamsAppInstallationRequestBuilder;
import com.microsoft.graph.requests.ConversationMemberCollectionRequestBuilder;
import com.microsoft.graph.requests.ConversationMemberRequestBuilder;
import com.microsoft.graph.requests.TeamsAsyncOperationCollectionRequestBuilder;
import com.microsoft.graph.requests.TeamsAsyncOperationRequestBuilder;
import com.microsoft.graph.requests.UserCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.UserWithReferenceRequestBuilder;
import com.microsoft.graph.requests.ResourceSpecificPermissionGrantCollectionRequestBuilder;
import com.microsoft.graph.requests.ResourceSpecificPermissionGrantRequestBuilder;
import com.microsoft.graph.requests.ProfilePhotoRequestBuilder;
import com.microsoft.graph.requests.TeamworkTagCollectionRequestBuilder;
import com.microsoft.graph.requests.TeamworkTagRequestBuilder;
import com.microsoft.graph.requests.TeamsTemplateWithReferenceRequestBuilder;
import com.microsoft.graph.requests.ScheduleRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.models.TeamCloneParameterSet;
import com.microsoft.graph.models.TeamArchiveParameterSet;
import com.microsoft.graph.models.TeamSendActivityNotificationParameterSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Team Request Builder.
 */
public class TeamRequestBuilder extends BaseRequestBuilder<Team> {

    /**
     * The request builder for the Team
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TeamRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the TeamRequest instance
     */
    @Nonnull
    public TeamRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the TeamRequest instance
     */
    @Nonnull
    public TeamRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.TeamRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     *  Gets a request builder for the Channel collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public ChannelCollectionWithReferencesRequestBuilder allChannels() {
        return new ChannelCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("allChannels"), getClient(), null);
    }

    /**
     * Gets a request builder for the Channel item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public ChannelWithReferenceRequestBuilder allChannels(@Nonnull final String id) {
        return new ChannelWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("allChannels") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the Channel collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public ChannelCollectionRequestBuilder channels() {
        return new ChannelCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("channels"), getClient(), null);
    }

    /**
     * Gets a request builder for the Channel item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public ChannelRequestBuilder channels(@Nonnull final String id) {
        return new ChannelRequestBuilder(getRequestUrlWithAdditionalSegment("channels") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for Group
     *
     * @return the GroupWithReferenceRequestBuilder instance
     */
    @Nonnull
    public GroupWithReferenceRequestBuilder group() {
        return new GroupWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("group"), getClient(), null);
    }
    /**
     *  Gets a request builder for the Channel collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public ChannelCollectionWithReferencesRequestBuilder incomingChannels() {
        return new ChannelCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("incomingChannels"), getClient(), null);
    }

    /**
     * Gets a request builder for the Channel item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public ChannelWithReferenceRequestBuilder incomingChannels(@Nonnull final String id) {
        return new ChannelWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("incomingChannels") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the TeamsAppInstallation collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public TeamsAppInstallationCollectionRequestBuilder installedApps() {
        return new TeamsAppInstallationCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("installedApps"), getClient(), null);
    }

    /**
     * Gets a request builder for the TeamsAppInstallation item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public TeamsAppInstallationRequestBuilder installedApps(@Nonnull final String id) {
        return new TeamsAppInstallationRequestBuilder(getRequestUrlWithAdditionalSegment("installedApps") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the ConversationMember collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public ConversationMemberCollectionRequestBuilder members() {
        return new ConversationMemberCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("members"), getClient(), null);
    }

    /**
     * Gets a request builder for the ConversationMember item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public ConversationMemberRequestBuilder members(@Nonnull final String id) {
        return new ConversationMemberRequestBuilder(getRequestUrlWithAdditionalSegment("members") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the TeamsAsyncOperation collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public TeamsAsyncOperationCollectionRequestBuilder operations() {
        return new TeamsAsyncOperationCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("operations"), getClient(), null);
    }

    /**
     * Gets a request builder for the TeamsAsyncOperation item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public TeamsAsyncOperationRequestBuilder operations(@Nonnull final String id) {
        return new TeamsAsyncOperationRequestBuilder(getRequestUrlWithAdditionalSegment("operations") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the User collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public UserCollectionWithReferencesRequestBuilder owners() {
        return new UserCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("owners"), getClient(), null);
    }

    /**
     * Gets a request builder for the User item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public UserWithReferenceRequestBuilder owners(@Nonnull final String id) {
        return new UserWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("owners") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the ResourceSpecificPermissionGrant collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public ResourceSpecificPermissionGrantCollectionRequestBuilder permissionGrants() {
        return new ResourceSpecificPermissionGrantCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("permissionGrants"), getClient(), null);
    }

    /**
     * Gets a request builder for the ResourceSpecificPermissionGrant item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public ResourceSpecificPermissionGrantRequestBuilder permissionGrants(@Nonnull final String id) {
        return new ResourceSpecificPermissionGrantRequestBuilder(getRequestUrlWithAdditionalSegment("permissionGrants") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for ProfilePhoto
     *
     * @return the ProfilePhotoRequestBuilder instance
     */
    @Nonnull
    public ProfilePhotoRequestBuilder photo() {
        return new ProfilePhotoRequestBuilder(getRequestUrlWithAdditionalSegment("photo"), getClient(), null);
    }

    /**
     * Gets the request builder for Channel
     *
     * @return the ChannelRequestBuilder instance
     */
    @Nonnull
    public ChannelRequestBuilder primaryChannel() {
        return new ChannelRequestBuilder(getRequestUrlWithAdditionalSegment("primaryChannel"), getClient(), null);
    }
    /**
     *  Gets a request builder for the TeamworkTag collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public TeamworkTagCollectionRequestBuilder tags() {
        return new TeamworkTagCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("tags"), getClient(), null);
    }

    /**
     * Gets a request builder for the TeamworkTag item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public TeamworkTagRequestBuilder tags(@Nonnull final String id) {
        return new TeamworkTagRequestBuilder(getRequestUrlWithAdditionalSegment("tags") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for TeamsTemplate
     *
     * @return the TeamsTemplateWithReferenceRequestBuilder instance
     */
    @Nonnull
    public TeamsTemplateWithReferenceRequestBuilder template() {
        return new TeamsTemplateWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("template"), getClient(), null);
    }

    /**
     * Gets the request builder for Schedule
     *
     * @return the ScheduleRequestBuilder instance
     */
    @Nonnull
    public ScheduleRequestBuilder schedule() {
        return new ScheduleRequestBuilder(getRequestUrlWithAdditionalSegment("schedule"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public TeamCloneRequestBuilder clone(@Nonnull final TeamCloneParameterSet parameters) {
        return new TeamCloneRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.clone"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public TeamArchiveRequestBuilder archive(@Nonnull final TeamArchiveParameterSet parameters) {
        return new TeamArchiveRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.archive"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public TeamUnarchiveRequestBuilder unarchive() {
        return new TeamUnarchiveRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.unarchive"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public TeamCompleteMigrationRequestBuilder completeMigration() {
        return new TeamCompleteMigrationRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.completeMigration"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public TeamSendActivityNotificationRequestBuilder sendActivityNotification(@Nonnull final TeamSendActivityNotificationParameterSet parameters) {
        return new TeamSendActivityNotificationRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.sendActivityNotification"), getClient(), null, parameters);
    }
}
