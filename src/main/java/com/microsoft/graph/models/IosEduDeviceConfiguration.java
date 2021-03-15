// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.IosEduCertificateSettings;
import com.microsoft.graph.models.DeviceConfiguration;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ios Edu Device Configuration.
 */
public class IosEduDeviceConfiguration extends DeviceConfiguration implements IJsonBackedObject {


    /**
     * The Device Certificate Settings.
     * The Trusted Root and PFX certificates for Device
     */
    @SerializedName(value = "deviceCertificateSettings", alternate = {"DeviceCertificateSettings"})
    @Expose
	@Nullable
    public IosEduCertificateSettings deviceCertificateSettings;

    /**
     * The Student Certificate Settings.
     * The Trusted Root and PFX certificates for Student
     */
    @SerializedName(value = "studentCertificateSettings", alternate = {"StudentCertificateSettings"})
    @Expose
	@Nullable
    public IosEduCertificateSettings studentCertificateSettings;

    /**
     * The Teacher Certificate Settings.
     * The Trusted Root and PFX certificates for Teacher
     */
    @SerializedName(value = "teacherCertificateSettings", alternate = {"TeacherCertificateSettings"})
    @Expose
	@Nullable
    public IosEduCertificateSettings teacherCertificateSettings;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
