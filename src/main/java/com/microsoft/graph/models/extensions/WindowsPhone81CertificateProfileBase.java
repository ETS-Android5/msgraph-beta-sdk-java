// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.CertificateValidityPeriodScale;
import com.microsoft.graph.models.extensions.ExtendedKeyUsage;
import com.microsoft.graph.models.generated.KeyStorageProviderOption;
import com.microsoft.graph.models.generated.SubjectAlternativeNameType;
import com.microsoft.graph.models.generated.SubjectNameFormat;
import com.microsoft.graph.models.extensions.DeviceConfiguration;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Phone81Certificate Profile Base.
 */
public class WindowsPhone81CertificateProfileBase extends DeviceConfiguration implements IJsonBackedObject {


    /**
     * The Certificate Validity Period Scale.
     * Scale for the Certificate Validity Period.
     */
    @SerializedName(value = "certificateValidityPeriodScale", alternate = {"CertificateValidityPeriodScale"})
    @Expose
    public CertificateValidityPeriodScale certificateValidityPeriodScale;

    /**
     * The Certificate Validity Period Value.
     * Value for the Certificate Validtiy Period.
     */
    @SerializedName(value = "certificateValidityPeriodValue", alternate = {"CertificateValidityPeriodValue"})
    @Expose
    public Integer certificateValidityPeriodValue;

    /**
     * The Extended Key Usages.
     * Extended Key Usage (EKU) settings. This collection can contain a maximum of 500 elements.
     */
    @SerializedName(value = "extendedKeyUsages", alternate = {"ExtendedKeyUsages"})
    @Expose
    public java.util.List<ExtendedKeyUsage> extendedKeyUsages;

    /**
     * The Key Storage Provider.
     * Key Storage Provider (KSP).
     */
    @SerializedName(value = "keyStorageProvider", alternate = {"KeyStorageProvider"})
    @Expose
    public KeyStorageProviderOption keyStorageProvider;

    /**
     * The Renewal Threshold Percentage.
     * Certificate renewal threshold percentage.
     */
    @SerializedName(value = "renewalThresholdPercentage", alternate = {"RenewalThresholdPercentage"})
    @Expose
    public Integer renewalThresholdPercentage;

    /**
     * The Subject Alternative Name Type.
     * Certificate Subject Alternative Name Type.
     */
    @SerializedName(value = "subjectAlternativeNameType", alternate = {"SubjectAlternativeNameType"})
    @Expose
    public EnumSet<SubjectAlternativeNameType> subjectAlternativeNameType;

    /**
     * The Subject Name Format.
     * Certificate Subject Name Format.
     */
    @SerializedName(value = "subjectNameFormat", alternate = {"SubjectNameFormat"})
    @Expose
    public SubjectNameFormat subjectNameFormat;


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
