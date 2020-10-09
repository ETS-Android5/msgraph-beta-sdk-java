// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.callrecords.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.callrecords.models.generated.MediaStreamDirection;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Media Stream.
 */
public class MediaStream implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Average Audio Degradation.
     * Average Network Mean Opinion Score degradation for stream. Represents how much the network loss and jitter has impacted the quality of received audio.
     */
    @SerializedName(value = "averageAudioDegradation", alternate = {"AverageAudioDegradation"})
    @Expose
    public float averageAudioDegradation;

    /**
     * The Average Audio Network Jitter.
     * Average jitter for the stream computed as specified in [RFC 3550][], denoted in [ISO 8601][] format. For example, 1 second is denoted as 'PT1S', where 'P' is the duration designator, 'T' is the time designator, and 'S' is the second designator.
     */
    @SerializedName(value = "averageAudioNetworkJitter", alternate = {"AverageAudioNetworkJitter"})
    @Expose
    public javax.xml.datatype.Duration averageAudioNetworkJitter;

    /**
     * The Average Bandwidth Estimate.
     * Average estimated bandwidth available between two endpoints in bits per second.
     */
    @SerializedName(value = "averageBandwidthEstimate", alternate = {"AverageBandwidthEstimate"})
    @Expose
    public Long averageBandwidthEstimate;

    /**
     * The Average Jitter.
     * Average jitter for the stream computed as specified in [RFC 3550][], denoted in [ISO 8601][] format. For example, 1 second is denoted as 'PT1S', where 'P' is the duration designator, 'T' is the time designator, and 'S' is the second designator.
     */
    @SerializedName(value = "averageJitter", alternate = {"AverageJitter"})
    @Expose
    public javax.xml.datatype.Duration averageJitter;

    /**
     * The Average Packet Loss Rate.
     * Average packet loss rate for stream.
     */
    @SerializedName(value = "averagePacketLossRate", alternate = {"AveragePacketLossRate"})
    @Expose
    public float averagePacketLossRate;

    /**
     * The Average Ratio Of Concealed Samples.
     * Ratio of the number of audio frames with samples generated by packet loss concealment to the total number of audio frames.
     */
    @SerializedName(value = "averageRatioOfConcealedSamples", alternate = {"AverageRatioOfConcealedSamples"})
    @Expose
    public float averageRatioOfConcealedSamples;

    /**
     * The Average Received Frame Rate.
     * Average frames per second received for all video streams computed over the duration of the session.
     */
    @SerializedName(value = "averageReceivedFrameRate", alternate = {"AverageReceivedFrameRate"})
    @Expose
    public float averageReceivedFrameRate;

    /**
     * The Average Round Trip Time.
     * Average network propagation round-trip time computed as specified in [RFC 3550][], denoted in [ISO 8601][] format. For example, 1 second is denoted as 'PT1S', where 'P' is the duration designator, 'T' is the time designator, and 'S' is the second designator.
     */
    @SerializedName(value = "averageRoundTripTime", alternate = {"AverageRoundTripTime"})
    @Expose
    public javax.xml.datatype.Duration averageRoundTripTime;

    /**
     * The Average Video Frame Loss Percentage.
     * Average percentage of video frames lost as displayed to the user.
     */
    @SerializedName(value = "averageVideoFrameLossPercentage", alternate = {"AverageVideoFrameLossPercentage"})
    @Expose
    public float averageVideoFrameLossPercentage;

    /**
     * The Average Video Frame Rate.
     * Average frames per second received for a video stream, computed over the duration of the session.
     */
    @SerializedName(value = "averageVideoFrameRate", alternate = {"AverageVideoFrameRate"})
    @Expose
    public float averageVideoFrameRate;

    /**
     * The Average Video Packet Loss Rate.
     * Average fraction of packets lost, as specified in [RFC 3550][], computed over the duration of the session.
     */
    @SerializedName(value = "averageVideoPacketLossRate", alternate = {"AverageVideoPacketLossRate"})
    @Expose
    public float averageVideoPacketLossRate;

    /**
     * The End Date Time.
     * UTC time when the stream ended. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
     */
    @SerializedName(value = "endDateTime", alternate = {"EndDateTime"})
    @Expose
    public java.util.Calendar endDateTime;

    /**
     * The Low Frame Rate Ratio.
     * Fraction of the call where frame rate is less than 7.5 frames per second.
     */
    @SerializedName(value = "lowFrameRateRatio", alternate = {"LowFrameRateRatio"})
    @Expose
    public float lowFrameRateRatio;

    /**
     * The Low Video Processing Capability Ratio.
     * Fraction of the call that the client is running less than 70% expected video processing capability.
     */
    @SerializedName(value = "lowVideoProcessingCapabilityRatio", alternate = {"LowVideoProcessingCapabilityRatio"})
    @Expose
    public float lowVideoProcessingCapabilityRatio;

    /**
     * The Max Audio Network Jitter.
     * Maximum of audio network jitter computed over each of the 20 second windows during the session, denoted in [ISO 8601][] format. For example, 1 second is denoted as 'PT1S', where 'P' is the duration designator, 'T' is the time designator, and 'S' is the second designator.
     */
    @SerializedName(value = "maxAudioNetworkJitter", alternate = {"MaxAudioNetworkJitter"})
    @Expose
    public javax.xml.datatype.Duration maxAudioNetworkJitter;

    /**
     * The Max Jitter.
     * Maximum jitter for the stream computed as specified in RFC 3550, denoted in [ISO 8601][] format. For example, 1 second is denoted as 'PT1S', where 'P' is the duration designator, 'T' is the time designator, and 'S' is the second designator.
     */
    @SerializedName(value = "maxJitter", alternate = {"MaxJitter"})
    @Expose
    public javax.xml.datatype.Duration maxJitter;

    /**
     * The Max Packet Loss Rate.
     * Maximum packet loss rate for the stream.
     */
    @SerializedName(value = "maxPacketLossRate", alternate = {"MaxPacketLossRate"})
    @Expose
    public float maxPacketLossRate;

    /**
     * The Max Ratio Of Concealed Samples.
     * Maximum ratio of packets concealed by the healer.
     */
    @SerializedName(value = "maxRatioOfConcealedSamples", alternate = {"MaxRatioOfConcealedSamples"})
    @Expose
    public float maxRatioOfConcealedSamples;

    /**
     * The Max Round Trip Time.
     * Maximum network propagation round-trip time computed as specified in [RFC 3550][], denoted in [ISO 8601][] format. For example, 1 second is denoted as 'PT1S', where 'P' is the duration designator, 'T' is the time designator, and 'S' is the second designator.
     */
    @SerializedName(value = "maxRoundTripTime", alternate = {"MaxRoundTripTime"})
    @Expose
    public javax.xml.datatype.Duration maxRoundTripTime;

    /**
     * The Packet Utilization.
     * Packet count for the stream.
     */
    @SerializedName(value = "packetUtilization", alternate = {"PacketUtilization"})
    @Expose
    public Long packetUtilization;

    /**
     * The Post Forward Error Correction Packet Loss Rate.
     * Packet loss rate after FEC has been applied aggregated across all video streams and codecs.
     */
    @SerializedName(value = "postForwardErrorCorrectionPacketLossRate", alternate = {"PostForwardErrorCorrectionPacketLossRate"})
    @Expose
    public float postForwardErrorCorrectionPacketLossRate;

    /**
     * The Start Date Time.
     * UTC time when the stream started. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
     */
    @SerializedName(value = "startDateTime", alternate = {"StartDateTime"})
    @Expose
    public java.util.Calendar startDateTime;

    /**
     * The Stream Direction.
     * Indicates the direction of the media stream. Possible values are: callerToCallee, calleeToCaller.
     */
    @SerializedName(value = "streamDirection", alternate = {"StreamDirection"})
    @Expose
    public MediaStreamDirection streamDirection;

    /**
     * The Stream Id.
     * Unique identifier for the stream.
     */
    @SerializedName(value = "streamId", alternate = {"StreamId"})
    @Expose
    public String streamId;

    /**
     * The Was Media Bypassed.
     * True if the media stream bypassed the Mediation Server and went straight between client and PSTN Gateway/PBX, false otherwise.
     */
    @SerializedName(value = "wasMediaBypassed", alternate = {"WasMediaBypassed"})
    @Expose
    public Boolean wasMediaBypassed;


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
