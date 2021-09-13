// Template Source: BaseEntityCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.Call;
import com.microsoft.graph.models.Participant;
import com.microsoft.graph.models.InvitationParticipantInfo;
import com.microsoft.graph.models.InviteParticipantsOperation;
import com.microsoft.graph.models.MuteParticipantOperation;
import com.microsoft.graph.models.MuteParticipantsOperation;
import com.microsoft.graph.models.Prompt;
import com.microsoft.graph.models.StartHoldMusicOperation;
import com.microsoft.graph.models.StopHoldMusicOperation;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.ParticipantCollectionRequestBuilder;
import com.microsoft.graph.requests.ParticipantRequestBuilder;
import com.microsoft.graph.requests.ParticipantCollectionRequest;
import com.microsoft.graph.requests.ParticipantInviteRequestBuilder;
import com.microsoft.graph.requests.ParticipantMuteAllRequestBuilder;
import com.microsoft.graph.http.BaseCollectionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.PrimitiveRequestBuilder;
import com.microsoft.graph.models.ParticipantInviteParameterSet;
import com.microsoft.graph.models.ParticipantMuteParameterSet;
import com.microsoft.graph.models.ParticipantMuteAllParameterSet;
import com.microsoft.graph.models.ParticipantStartHoldMusicParameterSet;
import com.microsoft.graph.models.ParticipantStopHoldMusicParameterSet;
// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Participant Collection Request Builder.
 */
public class ParticipantCollectionRequestBuilder extends BaseCollectionRequestBuilder<Participant, ParticipantRequestBuilder, ParticipantCollectionResponse, ParticipantCollectionPage, ParticipantCollectionRequest> {

    /**
     * The request builder for this collection of Call
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ParticipantCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ParticipantRequestBuilder.class, ParticipantCollectionRequest.class);
    }



    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ParticipantInviteRequestBuilder invite(@Nonnull final ParticipantInviteParameterSet parameters) {
        return new ParticipantInviteRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.invite"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ParticipantMuteAllRequestBuilder muteAll(@Nonnull final ParticipantMuteAllParameterSet parameters) {
        return new ParticipantMuteAllRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.muteAll"), getClient(), null, parameters);
    }

    /**
     * Gets the raw count request for the collection
     * @return The raw count request for the collection
     */
    @Nonnull
    public PrimitiveRequestBuilder<Long> count() {
        return new PrimitiveRequestBuilder<Long>(getRequestUrlWithAdditionalSegment("$count"), getClient(), null, Long.class);
    }
}
