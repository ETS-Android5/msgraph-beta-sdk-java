// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Teamwork Features Configuration.
 */
public class TeamworkFeaturesConfiguration implements IJsonBackedObject {

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
     * The Email To Send Logs And Feedback.
     * Email address to send logs and feedback.
     */
    @SerializedName(value = "emailToSendLogsAndFeedback", alternate = {"EmailToSendLogsAndFeedback"})
    @Expose
	@Nullable
    public String emailToSendLogsAndFeedback;

    /**
     * The Is Auto Screen Share Enabled.
     * True if auto screen shared is enabled.
     */
    @SerializedName(value = "isAutoScreenShareEnabled", alternate = {"IsAutoScreenShareEnabled"})
    @Expose
	@Nullable
    public Boolean isAutoScreenShareEnabled;

    /**
     * The Is Bluetooth Beaconing Enabled.
     * True if Bluetooth beaconing is enabled.
     */
    @SerializedName(value = "isBluetoothBeaconingEnabled", alternate = {"IsBluetoothBeaconingEnabled"})
    @Expose
	@Nullable
    public Boolean isBluetoothBeaconingEnabled;

    /**
     * The Is Hide Meeting Names Enabled.
     * True if hiding meeting names is enabled.
     */
    @SerializedName(value = "isHideMeetingNamesEnabled", alternate = {"IsHideMeetingNamesEnabled"})
    @Expose
	@Nullable
    public Boolean isHideMeetingNamesEnabled;

    /**
     * The Is Send Logs And Feedback Enabled.
     * True if sending logs and feedback is enabled.
     */
    @SerializedName(value = "isSendLogsAndFeedbackEnabled", alternate = {"IsSendLogsAndFeedbackEnabled"})
    @Expose
	@Nullable
    public Boolean isSendLogsAndFeedbackEnabled;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
