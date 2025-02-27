// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Modality.
*/
public enum Modality
{
    /**
    * unknown
    */
    UNKNOWN,
    /**
    * audio
    */
    AUDIO,
    /**
    * video
    */
    VIDEO,
    /**
    * video Based Screen Sharing
    */
    VIDEO_BASED_SCREEN_SHARING,
    /**
    * data
    */
    DATA,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For Modality values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
