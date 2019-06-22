/*
 * Copyright 2019 the original author or authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 *
 */

package com.hubbledouble.json_merge_patch_example.message;

import java.util.Collection;
import java.util.Map;

/**
 * @author Jorge Saldivar
 */
public class ChildObject {

    private String stringObject;

    private Long longObject;

    private Double doubleObject;

    private Integer integerObject;

    private Float floatObject;

    private Collection<String> collectionObject;

    private Map<String, String> mapObject;

    private LeafObject leafObject;

    public ChildObject() {
    }

    public ChildObject(String stringObject,
                       Long longObject,
                       Double doubleObject,
                       Integer integerObject,
                       Float floatObject,
                       Collection<String> collectionObject,
                       Map<String, String> mapObject,
                       LeafObject leafObject) {

        this.stringObject = stringObject;
        this.longObject = longObject;
        this.doubleObject = doubleObject;
        this.integerObject = integerObject;
        this.floatObject = floatObject;
        this.collectionObject = collectionObject;
        this.mapObject = mapObject;
        this.leafObject = leafObject;

    }

    public String getStringObject() {
        return stringObject;
    }

    public Long getLongObject() {
        return longObject;
    }

    public Double getDoubleObject() {
        return doubleObject;
    }

    public Integer getIntegerObject() {
        return integerObject;
    }

    public Float getFloatObject() {
        return floatObject;
    }

    public Collection<String> getCollectionObject() {
        return collectionObject;
    }

    public Map<String, String> getMapObject() {
        return mapObject;
    }

    public LeafObject getLeafObject() {
        return leafObject;
    }
}
