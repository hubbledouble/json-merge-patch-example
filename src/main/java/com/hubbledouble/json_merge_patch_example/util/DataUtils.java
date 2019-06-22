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

package com.hubbledouble.json_merge_patch_example.util;

import com.hubbledouble.json_merge_patch_example.message.ChildObject;
import com.hubbledouble.json_merge_patch_example.message.LeafObject;
import com.hubbledouble.json_merge_patch_example.message.ParentObject;

import java.util.*;

/**
 * @author Jorge Saldivar
 */
public class DataUtils {

    private static final Map<String, String> ROOT_MAP = initializeMap();
    private static final Collection<String> ROOT_COLLECTION = initializeCollection();
    private static ParentObject rootObject = initializeObject();

    private DataUtils() {
    }

    private static Map<String, String> initializeMap() {

        Map<String, String> map = new HashMap<>();
        map.put("first entry", "1");
        map.put("second entry", "2");

        return map;

    }

    private static Collection<String> initializeCollection() {

        Collection<String> collection = new ArrayList<>();
        collection.add("first entry");
        return collection;

    }

    private static ParentObject initializeObject() {

        return new ParentObject(
                "object",
                "string",
                1l,
                2.0d,
                3,
                4.f,
                sampleList(),
                sampleMap(),
                new ChildObject("childString",
                        1l,
                        2.0d,
                        3,
                        4.f,
                        sampleList(),
                        sampleMap(),
                        new LeafObject("leafString",
                                1l,
                                2.0d,
                                3,
                                4.f,
                                sampleList(),
                                sampleMap())));

    }

    private static List<String> sampleList() {
        List<String> list = new ArrayList<>();
        list.add("list");
        return list;
    }

    private static Map<String, String> sampleMap() {
        Map<String, String> map = new HashMap<>();
        map.put("key", "value");
        return map;
    }

    public static Map<String, String> getRootMap() {
        return ROOT_MAP;
    }

    public static Map<String, String> replaceRootMap(Map<String, String> map) {
        ROOT_MAP.clear();
        ROOT_MAP.putAll(map);
        return ROOT_MAP;
    }

    public static Collection<String> getRootCollection() {
        return ROOT_COLLECTION;
    }

    public static Collection<String> replaceRootCollection(Collection<String> collection) {
        ROOT_COLLECTION.clear();
        ROOT_COLLECTION.addAll(collection);
        return ROOT_COLLECTION;
    }

    public static ParentObject getRootObject() {
        return rootObject;
    }

    public static ParentObject replaceRootObject(ParentObject parentObject) {
        rootObject = parentObject;
        return rootObject;
    }

}