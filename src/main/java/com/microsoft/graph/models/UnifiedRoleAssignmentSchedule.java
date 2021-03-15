// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.RequestSchedule;
import com.microsoft.graph.models.UnifiedRoleEligibilitySchedule;
import com.microsoft.graph.models.UnifiedRoleScheduleBase;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Unified Role Assignment Schedule.
 */
public class UnifiedRoleAssignmentSchedule extends UnifiedRoleScheduleBase implements IJsonBackedObject {


    /**
     * The Assignment Type.
     * 
     */
    @SerializedName(value = "assignmentType", alternate = {"AssignmentType"})
    @Expose
	@Nullable
    public String assignmentType;

    /**
     * The Member Type.
     * 
     */
    @SerializedName(value = "memberType", alternate = {"MemberType"})
    @Expose
	@Nullable
    public String memberType;

    /**
     * The Schedule Info.
     * 
     */
    @SerializedName(value = "scheduleInfo", alternate = {"ScheduleInfo"})
    @Expose
	@Nullable
    public RequestSchedule scheduleInfo;

    /**
     * The Activated Using.
     * 
     */
    @SerializedName(value = "activatedUsing", alternate = {"ActivatedUsing"})
    @Expose
	@Nullable
    public UnifiedRoleEligibilitySchedule activatedUsing;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
