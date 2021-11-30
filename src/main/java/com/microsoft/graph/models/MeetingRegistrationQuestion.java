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
import com.microsoft.graph.models.AnswerInputType;
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Meeting Registration Question.
 */
public class MeetingRegistrationQuestion extends Entity implements IJsonBackedObject {


    /**
     * The Answer Input Type.
     * Answer input type of the custom registration question.
     */
    @SerializedName(value = "answerInputType", alternate = {"AnswerInputType"})
    @Expose
	@Nullable
    public AnswerInputType answerInputType;

    /**
     * The Answer Options.
     * Answer options when answerInputType is radioButton.
     */
    @SerializedName(value = "answerOptions", alternate = {"AnswerOptions"})
    @Expose
	@Nullable
    public java.util.List<String> answerOptions;

    /**
     * The Display Name.
     * Display name of the custom registration question.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The Is Required.
     * Indicates whether the question is required. Default value is false.
     */
    @SerializedName(value = "isRequired", alternate = {"IsRequired"})
    @Expose
	@Nullable
    public Boolean isRequired;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
