package ai.api;

/***********************************************************************************************************************
 *
 * API.AI Android SDK - client-side libraries for API.AI
 * =================================================
 *
 * Copyright (C) 2015 by Speaktoit, Inc. (https://www.speaktoit.com)
 * https://www.api.ai
 *
 ***********************************************************************************************************************
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *
 ***********************************************************************************************************************/

import java.util.List;

import ai.api.model.AIContext;
import ai.api.model.AIRequest;
import ai.api.model.Entity;

/**
 * Extra data for request
 */
public class RequestExtras {
    private List<AIContext> contexts;
    private List<Entity> entities;

    private Boolean resetContexts;

    public RequestExtras() {
        contexts = null;
        entities = null;
    }

    public RequestExtras(final List<AIContext> contexts, final List<Entity> entities) {
        this.contexts = contexts;
        this.entities = entities;
    }

    public List<AIContext> getContexts() {
        return contexts;
    }

    public void setContexts(final List<AIContext> contexts) {
        this.contexts = contexts;
    }

    public List<Entity> getEntities() {
        return entities;
    }

    public void setEntities(final List<Entity> entities) {
        this.entities = entities;
    }

    public Boolean getResetContexts() {
        return resetContexts;
    }

    public void setResetContexts(final boolean resetContexts) {
        this.resetContexts = resetContexts;
    }

    public boolean hasContexts() {
        if (contexts != null && !contexts.isEmpty()) {
            return true;
        }
        return false;
    }

    public boolean hasEntities() {
        if (entities != null && !entities.isEmpty()) {
            return true;
        }
        return false;
    }

    public void copyTo(final AIRequest request) {
        if (hasContexts()) {
            request.setContexts(getContexts());
        }

        if (hasEntities()) {
            request.setEntities(getEntities());
        }

        if (getResetContexts() != null) {
            request.setResetContexts(getResetContexts());
        }

    }


}
