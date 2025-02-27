// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.PlannerOrderHintsByAssignee;
import com.microsoft.graph.models.PlannerDelta;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Planner Assigned To Task Board Task Format.
 */
public class PlannerAssignedToTaskBoardTaskFormat extends PlannerDelta implements IJsonBackedObject {


    /**
     * The Order Hints By Assignee.
     * Dictionary of hints used to order tasks on the AssignedTo view of the Task Board. The key of each entry is one of the users the task is assigned to and the value is the order hint. The format of each value is defined as outlined here.
     */
    @SerializedName(value = "orderHintsByAssignee", alternate = {"OrderHintsByAssignee"})
    @Expose
	@Nullable
    public PlannerOrderHintsByAssignee orderHintsByAssignee;

    /**
     * The Unassigned Order Hint.
     * Hint value used to order the task on the AssignedTo view of the Task Board when the task is not assigned to anyone, or if the orderHintsByAssignee dictionary does not provide an order hint for the user the task is assigned to. The format is defined as outlined here.
     */
    @SerializedName(value = "unassignedOrderHint", alternate = {"UnassignedOrderHint"})
    @Expose
	@Nullable
    public String unassignedOrderHint;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
