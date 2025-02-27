// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Connection State.
*/
public enum ConnectionState
{
    /**
    * draft
    */
    DRAFT,
    /**
    * ready
    */
    READY,
    /**
    * obsolete
    */
    OBSOLETE,
    /**
    * limit Exceeded
    */
    LIMIT_EXCEEDED,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For ConnectionState values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
