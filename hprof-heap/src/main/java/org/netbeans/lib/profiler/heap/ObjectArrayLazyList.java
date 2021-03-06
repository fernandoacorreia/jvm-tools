/**
 * Copyright 2014 Alexey Ragozin
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.netbeans.lib.profiler.heap;

/**
 * @author Alexey Ragozin (alexey.ragozin@gmail.com)
 */
class ObjectArrayLazyList extends AbstractObjectArrayLazyList<Instance> {

    public ObjectArrayLazyList(HprofHeap h, HprofByteBuffer buf, int len, long off) {
        super(h, buf, len, off);
    }

    @Override
    public Instance get(int index) {
        return getInstance(index);
    }

}
