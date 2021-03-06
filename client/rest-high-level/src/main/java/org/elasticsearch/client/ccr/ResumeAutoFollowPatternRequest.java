/*
 * Copyright Elasticsearch B.V. and/or licensed to Elasticsearch B.V. under one
 * or more contributor license agreements. Licensed under the Elastic License
 * 2.0 and the Server Side Public License, v 1; you may not use this file except
 * in compliance with, at your election, the Elastic License 2.0 or the Server
 * Side Public License, v 1.
 */

package org.elasticsearch.client.ccr;

import org.elasticsearch.client.Validatable;

import java.util.Objects;

/**
 * Request class for resume auto follow pattern api.
 */
public final class ResumeAutoFollowPatternRequest implements Validatable {

    private final String name;

    /**
     * Resume auto follow pattern with the specified name
     *
     * @param name The name of the auto follow pattern to resume
     */
    public ResumeAutoFollowPatternRequest(String name) {
        this.name = Objects.requireNonNull(name);
    }

    public String getName() {
        return name;
    }
}
