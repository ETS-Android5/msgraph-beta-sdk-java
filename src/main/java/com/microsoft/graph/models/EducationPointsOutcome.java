// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.EducationAssignmentPointsGrade;
import com.microsoft.graph.models.EducationOutcome;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Education Points Outcome.
 */
public class EducationPointsOutcome extends EducationOutcome implements IJsonBackedObject {


    /**
     * The Points.
     * The numeric grade the teacher has given the student for this assignment.
     */
    @SerializedName(value = "points", alternate = {"Points"})
    @Expose
	@Nullable
    public EducationAssignmentPointsGrade points;

    /**
     * The Published Points.
     * A copy of the points property that is made when the grade is released to the student.
     */
    @SerializedName(value = "publishedPoints", alternate = {"PublishedPoints"})
    @Expose
	@Nullable
    public EducationAssignmentPointsGrade publishedPoints;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
