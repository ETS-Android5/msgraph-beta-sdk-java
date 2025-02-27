// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.EndpointType;
import com.microsoft.graph.models.IdentitySet;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Invitation Participant Info.
 */
public class InvitationParticipantInfo implements IJsonBackedObject {

    /** the OData type of the object as returned by the service */
    @SerializedName("@odata.type")
    @Expose
    @Nullable
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    @Nonnull
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Endpoint Type.
     * The type of the endpoint. Possible values are: default, voicemail.
     */
    @SerializedName(value = "endpointType", alternate = {"EndpointType"})
    @Expose
	@Nullable
    public EndpointType endpointType;

    /**
     * The Hidden.
     * 
     */
    @SerializedName(value = "hidden", alternate = {"Hidden"})
    @Expose
	@Nullable
    public Boolean hidden;

    /**
     * The Identity.
     * The identitySet associated with this invitation.
     */
    @SerializedName(value = "identity", alternate = {"Identity"})
    @Expose
	@Nullable
    public IdentitySet identity;

    /**
     * The Participant Id.
     * Optional. The ID of the target participant.
     */
    @SerializedName(value = "participantId", alternate = {"ParticipantId"})
    @Expose
	@Nullable
    public String participantId;

    /**
     * The Remove From Default Audio Routing Group.
     * 
     */
    @SerializedName(value = "removeFromDefaultAudioRoutingGroup", alternate = {"RemoveFromDefaultAudioRoutingGroup"})
    @Expose
	@Nullable
    public Boolean removeFromDefaultAudioRoutingGroup;

    /**
     * The Replaces Call Id.
     * Optional. The call which the target identity is currently a part of. For peer-to-peer case, the call will be dropped once the participant is added successfully.
     */
    @SerializedName(value = "replacesCallId", alternate = {"ReplacesCallId"})
    @Expose
	@Nullable
    public String replacesCallId;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
