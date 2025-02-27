// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.UnifiedRoleScheduleInstanceBase;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Unified Role Eligibility Schedule Instance.
 */
public class UnifiedRoleEligibilityScheduleInstance extends UnifiedRoleScheduleInstanceBase implements IJsonBackedObject {


    /**
     * The End Date Time.
     * Time that the roleEligibilityScheduleInstance will expire.
     */
    @SerializedName(value = "endDateTime", alternate = {"EndDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime endDateTime;

    /**
     * The Member Type.
     * Membership type of the assignment. It can either be Inherited, Direct, or Group.
     */
    @SerializedName(value = "memberType", alternate = {"MemberType"})
    @Expose
	@Nullable
    public String memberType;

    /**
     * The Role Eligibility Schedule Id.
     * Identifier of the parent roleEligibilitySchedule for this instance.
     */
    @SerializedName(value = "roleEligibilityScheduleId", alternate = {"RoleEligibilityScheduleId"})
    @Expose
	@Nullable
    public String roleEligibilityScheduleId;

    /**
     * The Start Date Time.
     * Time that the roleEligibilityScheduleInstance will start.
     */
    @SerializedName(value = "startDateTime", alternate = {"StartDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime startDateTime;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
