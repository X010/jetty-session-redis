/**
 * Copyright (C) 2011 Ovea <dev@ovea.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.ovea.jetty.session.serializer;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/**
 * @author Mathieu Carbou (mathieu.carbou@gmail.com)
 */
public final class JdkSerializer extends BinarySerializer {
    @Override
    protected void write(OutputStream out, Object o) throws Exception {
        ObjectOutputStream oos = new ObjectOutputStream(out);
        oos.writeObject(o);
    }

    @Override
    protected Object read(InputStream is) throws Exception {
        ObjectInputStream ois = new ObjectInputStream(is);
        return ois.readObject();
    }
}
