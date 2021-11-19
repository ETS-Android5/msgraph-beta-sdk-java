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
import com.microsoft.graph.models.CertificateValidityPeriodScale;
import com.microsoft.graph.models.ExtendedKeyUsage;
import com.microsoft.graph.models.SubjectAlternativeNameType;
import com.microsoft.graph.models.SubjectNameFormat;
import com.microsoft.graph.models.AndroidDeviceOwnerTrustedRootCertificate;
import com.microsoft.graph.models.DeviceConfiguration;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Android Device Owner Certificate Profile Base.
 */
public class AndroidDeviceOwnerCertificateProfileBase extends DeviceConfiguration implements IJsonBackedObject {


    /**
     * The Certificate Validity Period Scale.
     * Scale for the Certificate Validity Period.
     */
    @SerializedName(value = "certificateValidityPeriodScale", alternate = {"CertificateValidityPeriodScale"})
    @Expose
	@Nullable
    public CertificateValidityPeriodScale certificateValidityPeriodScale;

    /**
     * The Certificate Validity Period Value.
     * Value for the Certificate Validity Period.
     */
    @SerializedName(value = "certificateValidityPeriodValue", alternate = {"CertificateValidityPeriodValue"})
    @Expose
	@Nullable
    public Integer certificateValidityPeriodValue;

    /**
     * The Extended Key Usages.
     * Extended Key Usage (EKU) settings. This collection can contain a maximum of 500 elements.
     */
    @SerializedName(value = "extendedKeyUsages", alternate = {"ExtendedKeyUsages"})
    @Expose
	@Nullable
    public java.util.List<ExtendedKeyUsage> extendedKeyUsages;

    /**
     * The Renewal Threshold Percentage.
     * Certificate renewal threshold percentage. Valid values 1 to 99
     */
    @SerializedName(value = "renewalThresholdPercentage", alternate = {"RenewalThresholdPercentage"})
    @Expose
	@Nullable
    public Integer renewalThresholdPercentage;

    /**
     * The Subject Alternative Name Type.
     * Certificate Subject Alternative Name Type.
     */
    @SerializedName(value = "subjectAlternativeNameType", alternate = {"SubjectAlternativeNameType"})
    @Expose
	@Nullable
    public EnumSet<SubjectAlternativeNameType> subjectAlternativeNameType;

    /**
     * The Subject Name Format.
     * Certificate Subject Name Format.
     */
    @SerializedName(value = "subjectNameFormat", alternate = {"SubjectNameFormat"})
    @Expose
	@Nullable
    public SubjectNameFormat subjectNameFormat;

    /**
     * The Root Certificate.
     * Trusted Root Certificate.
     */
    @SerializedName(value = "rootCertificate", alternate = {"RootCertificate"})
    @Expose
	@Nullable
    public AndroidDeviceOwnerTrustedRootCertificate rootCertificate;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
