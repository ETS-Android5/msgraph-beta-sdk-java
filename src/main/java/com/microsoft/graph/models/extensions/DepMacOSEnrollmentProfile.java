// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.DepEnrollmentBaseProfile;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Dep Mac OSEnrollment Profile.
 */
public class DepMacOSEnrollmentProfile extends DepEnrollmentBaseProfile implements IJsonBackedObject {


    /**
     * The Choose Your Lock Screen Disabled.
     * Indicates if iCloud Documents and Desktop screen is disabled
     */
    @SerializedName(value = "chooseYourLockScreenDisabled", alternate = {"ChooseYourLockScreenDisabled"})
    @Expose
    public Boolean chooseYourLockScreenDisabled;

    /**
     * The File Vault Disabled.
     * Indicates if file vault is disabled
     */
    @SerializedName(value = "fileVaultDisabled", alternate = {"FileVaultDisabled"})
    @Expose
    public Boolean fileVaultDisabled;

    /**
     * The ICloud Diagnostics Disabled.
     * Indicates if iCloud Analytics screen is disabled
     */
    @SerializedName(value = "iCloudDiagnosticsDisabled", alternate = {"ICloudDiagnosticsDisabled"})
    @Expose
    public Boolean iCloudDiagnosticsDisabled;

    /**
     * The ICloud Storage Disabled.
     * Indicates if iCloud Documents and Desktop screen is disabled
     */
    @SerializedName(value = "iCloudStorageDisabled", alternate = {"ICloudStorageDisabled"})
    @Expose
    public Boolean iCloudStorageDisabled;

    /**
     * The Registration Disabled.
     * Indicates if registration is disabled
     */
    @SerializedName(value = "registrationDisabled", alternate = {"RegistrationDisabled"})
    @Expose
    public Boolean registrationDisabled;


    /**
     * The raw representation of this class
     */
    private JsonObject rawObject;

    /**
     * The serializer
     */
    private ISerializer serializer;

    /**
     * Gets the raw representation of this class
     *
     * @return the raw representation of this class
     */
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;

    }
}
