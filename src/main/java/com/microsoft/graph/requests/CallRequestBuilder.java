// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.Call;
import com.microsoft.graph.models.InvitationParticipantInfo;
import com.microsoft.graph.models.CallDisposition;
import com.microsoft.graph.models.AddLargeGalleryViewOperation;
import com.microsoft.graph.models.MediaConfig;
import com.microsoft.graph.models.Modality;
import com.microsoft.graph.models.IncomingCallOptions;
import com.microsoft.graph.models.CancelMediaProcessingOperation;
import com.microsoft.graph.models.ScreenSharingRole;
import com.microsoft.graph.models.MuteParticipantOperation;
import com.microsoft.graph.models.Prompt;
import com.microsoft.graph.models.PlayPromptOperation;
import com.microsoft.graph.models.RecordOperation;
import com.microsoft.graph.models.RejectReason;
import com.microsoft.graph.models.SubscribeToToneOperation;
import com.microsoft.graph.models.ParticipantInfo;
import com.microsoft.graph.models.UnmuteParticipantOperation;
import com.microsoft.graph.models.RecordingStatus;
import com.microsoft.graph.models.UpdateRecordingStatusOperation;
import com.microsoft.graph.models.TeleconferenceDeviceQuality;
import com.microsoft.graph.requests.AudioRoutingGroupCollectionRequestBuilder;
import com.microsoft.graph.requests.AudioRoutingGroupRequestBuilder;
import com.microsoft.graph.requests.ContentSharingSessionCollectionRequestBuilder;
import com.microsoft.graph.requests.ContentSharingSessionRequestBuilder;
import com.microsoft.graph.requests.CommsOperationCollectionRequestBuilder;
import com.microsoft.graph.requests.CommsOperationRequestBuilder;
import com.microsoft.graph.requests.ParticipantCollectionRequestBuilder;
import com.microsoft.graph.requests.ParticipantRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.models.CallRedirectParameterSet;
import com.microsoft.graph.models.CallAddLargeGalleryViewParameterSet;
import com.microsoft.graph.models.CallAnswerParameterSet;
import com.microsoft.graph.models.CallCancelMediaProcessingParameterSet;
import com.microsoft.graph.models.CallChangeScreenSharingRoleParameterSet;
import com.microsoft.graph.models.CallMuteParameterSet;
import com.microsoft.graph.models.CallPlayPromptParameterSet;
import com.microsoft.graph.models.CallRecordParameterSet;
import com.microsoft.graph.models.CallRecordResponseParameterSet;
import com.microsoft.graph.models.CallRejectParameterSet;
import com.microsoft.graph.models.CallSubscribeToToneParameterSet;
import com.microsoft.graph.models.CallTransferParameterSet;
import com.microsoft.graph.models.CallUnmuteParameterSet;
import com.microsoft.graph.models.CallUpdateRecordingStatusParameterSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Call Request Builder.
 */
public class CallRequestBuilder extends BaseRequestBuilder<Call> {

    /**
     * The request builder for the Call
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public CallRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the CallRequest instance
     */
    @Nonnull
    public CallRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the CallRequest instance
     */
    @Nonnull
    public CallRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.CallRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     *  Gets a request builder for the AudioRoutingGroup collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public AudioRoutingGroupCollectionRequestBuilder audioRoutingGroups() {
        return new AudioRoutingGroupCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("audioRoutingGroups"), getClient(), null);
    }

    /**
     * Gets a request builder for the AudioRoutingGroup item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public AudioRoutingGroupRequestBuilder audioRoutingGroups(@Nonnull final String id) {
        return new AudioRoutingGroupRequestBuilder(getRequestUrlWithAdditionalSegment("audioRoutingGroups") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the ContentSharingSession collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public ContentSharingSessionCollectionRequestBuilder contentSharingSessions() {
        return new ContentSharingSessionCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("contentSharingSessions"), getClient(), null);
    }

    /**
     * Gets a request builder for the ContentSharingSession item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public ContentSharingSessionRequestBuilder contentSharingSessions(@Nonnull final String id) {
        return new ContentSharingSessionRequestBuilder(getRequestUrlWithAdditionalSegment("contentSharingSessions") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the CommsOperation collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public CommsOperationCollectionRequestBuilder operations() {
        return new CommsOperationCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("operations"), getClient(), null);
    }

    /**
     * Gets a request builder for the CommsOperation item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public CommsOperationRequestBuilder operations(@Nonnull final String id) {
        return new CommsOperationRequestBuilder(getRequestUrlWithAdditionalSegment("operations") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the Participant collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public ParticipantCollectionRequestBuilder participants() {
        return new ParticipantCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("participants"), getClient(), null);
    }

    /**
     * Gets a request builder for the Participant item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public ParticipantRequestBuilder participants(@Nonnull final String id) {
        return new ParticipantRequestBuilder(getRequestUrlWithAdditionalSegment("participants") + "/" + id, getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public CallRedirectRequestBuilder redirect(@Nonnull final CallRedirectParameterSet parameters) {
        return new CallRedirectRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.redirect"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public CallAddLargeGalleryViewRequestBuilder addLargeGalleryView(@Nonnull final CallAddLargeGalleryViewParameterSet parameters) {
        return new CallAddLargeGalleryViewRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.addLargeGalleryView"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public CallAnswerRequestBuilder answer(@Nonnull final CallAnswerParameterSet parameters) {
        return new CallAnswerRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.answer"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public CallCancelMediaProcessingRequestBuilder cancelMediaProcessing(@Nonnull final CallCancelMediaProcessingParameterSet parameters) {
        return new CallCancelMediaProcessingRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.cancelMediaProcessing"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public CallChangeScreenSharingRoleRequestBuilder changeScreenSharingRole(@Nonnull final CallChangeScreenSharingRoleParameterSet parameters) {
        return new CallChangeScreenSharingRoleRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.changeScreenSharingRole"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public CallKeepAliveRequestBuilder keepAlive() {
        return new CallKeepAliveRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.keepAlive"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public CallMuteRequestBuilder mute(@Nonnull final CallMuteParameterSet parameters) {
        return new CallMuteRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.mute"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public CallPlayPromptRequestBuilder playPrompt(@Nonnull final CallPlayPromptParameterSet parameters) {
        return new CallPlayPromptRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.playPrompt"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public CallRecordRequestBuilder record(@Nonnull final CallRecordParameterSet parameters) {
        return new CallRecordRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.record"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public CallRecordResponseRequestBuilder recordResponse(@Nonnull final CallRecordResponseParameterSet parameters) {
        return new CallRecordResponseRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.recordResponse"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public CallRejectRequestBuilder reject(@Nonnull final CallRejectParameterSet parameters) {
        return new CallRejectRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.reject"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public CallSubscribeToToneRequestBuilder subscribeToTone(@Nonnull final CallSubscribeToToneParameterSet parameters) {
        return new CallSubscribeToToneRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.subscribeToTone"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public CallTransferRequestBuilder transfer(@Nonnull final CallTransferParameterSet parameters) {
        return new CallTransferRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.transfer"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public CallUnmuteRequestBuilder unmute(@Nonnull final CallUnmuteParameterSet parameters) {
        return new CallUnmuteRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.unmute"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public CallUpdateRecordingStatusRequestBuilder updateRecordingStatus(@Nonnull final CallUpdateRecordingStatusParameterSet parameters) {
        return new CallUpdateRecordingStatusRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.updateRecordingStatus"), getClient(), null, parameters);
    }
}
