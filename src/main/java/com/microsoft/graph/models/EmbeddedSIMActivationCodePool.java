// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.models.EmbeddedSIMActivationCode;
import com.microsoft.graph.models.EmbeddedSIMActivationCodePoolAssignment;
import com.microsoft.graph.models.EmbeddedSIMDeviceState;
import com.microsoft.graph.models.Entity;
import com.microsoft.graph.requests.EmbeddedSIMActivationCodePoolAssignmentCollectionPage;
import com.microsoft.graph.requests.EmbeddedSIMDeviceStateCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Embedded SIMActivation Code Pool.
 */
public class EmbeddedSIMActivationCodePool extends Entity implements IJsonBackedObject {


    /**
     * The Activation Code Count.
     * The total count of activation codes which belong to this pool.
     */
    @SerializedName(value = "activationCodeCount", alternate = {"ActivationCodeCount"})
    @Expose
	@Nullable
    public Integer activationCodeCount;

    /**
     * The Activation Codes.
     * The activation codes which belong to this pool. This navigation property is used to post activation codes to Intune but cannot be used to read activation codes from Intune.
     */
    @SerializedName(value = "activationCodes", alternate = {"ActivationCodes"})
    @Expose
	@Nullable
    public java.util.List<EmbeddedSIMActivationCode> activationCodes;

    /**
     * The Created Date Time.
     * The time the embedded SIM activation code pool was created. Generated service side.
     */
    @SerializedName(value = "createdDateTime", alternate = {"CreatedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime createdDateTime;

    /**
     * The Display Name.
     * The admin defined name of the embedded SIM activation code pool.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The Modified Date Time.
     * The time the embedded SIM activation code pool was last modified. Updated service side.
     */
    @SerializedName(value = "modifiedDateTime", alternate = {"ModifiedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime modifiedDateTime;

    /**
     * The Assignments.
     * Navigational property to a list of targets to which this pool is assigned.
     */
    @SerializedName(value = "assignments", alternate = {"Assignments"})
    @Expose
	@Nullable
    public EmbeddedSIMActivationCodePoolAssignmentCollectionPage assignments;

    /**
     * The Device States.
     * Navigational property to a list of device states for this pool.
     */
    @SerializedName(value = "deviceStates", alternate = {"DeviceStates"})
    @Expose
	@Nullable
    public EmbeddedSIMDeviceStateCollectionPage deviceStates;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("assignments")) {
            assignments = serializer.deserializeObject(json.get("assignments"), EmbeddedSIMActivationCodePoolAssignmentCollectionPage.class);
        }

        if (json.has("deviceStates")) {
            deviceStates = serializer.deserializeObject(json.get("deviceStates"), EmbeddedSIMDeviceStateCollectionPage.class);
        }
    }
}
