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

package com.hubbledouble.json_merge_patch_example.controller;

import com.hubbledouble.json_merge_patch.processor.HTTPMethodProcessor;
import com.hubbledouble.json_merge_patch_example.message.ParentObject;
import com.hubbledouble.json_merge_patch_example.util.DataUtils;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Map;

/**
 * @author Jorge Saldivar
 */
@RestController
public class RestMergePatchController {

    @GetMapping("/object")
    public ParentObject object() {
        return DataUtils.getRootObject();
    }

    @PostMapping("/object")
    public ParentObject postObject(@RequestBody ParentObject request) {
        return DataUtils.replaceRootObject(request);
    }

    @PatchMapping("/object")
    public ParentObject patchObject(@RequestBody String request) {
        HTTPMethodProcessor.patch(request, DataUtils.getRootObject());
        return DataUtils.getRootObject();
    }

    @GetMapping("/map")
    public Map<String, String> map() {
        return DataUtils.getRootMap();
    }

    @PostMapping("/map")
    public Map<String, String> postMap(@RequestBody Map<String, String> request) {
        return DataUtils.replaceRootMap(request);
    }

    @PatchMapping("/map")
    public Map<String, String> patchMap(@RequestBody String json) {
        HTTPMethodProcessor.patch(json, DataUtils.getRootMap());
        return DataUtils.getRootMap();
    }

    @GetMapping("/collection")
    public Collection<String> collection() {
        return DataUtils.getRootCollection();
    }

    @PostMapping("/collection")
    public Collection<String> postCollection(@RequestBody Collection<String> request) {
        return DataUtils.replaceRootCollection(request);
    }

    @PatchMapping("/collection")
    public Collection<String> patchCollection(@RequestBody String json) {
        HTTPMethodProcessor.patch(json, DataUtils.getRootCollection());
        return DataUtils.getRootCollection();
    }

}
