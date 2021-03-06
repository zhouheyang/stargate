/*
 * Copyright 2017 The Tsinghua University
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

package tsinghua.stargate.util;

import java.io.File;

import org.junit.Test;

public class TestPathUtils {

  public void testMkDir() throws Exception {
    PathUtils.mkDirRecursively(new File("D:\\tmp\\gg\\tt\\12\\t.txt"));
  }

  @Test
  public void testDeleteDir() throws Exception {
    PathUtils.deleteRecursively(new File("D:\\tmp\\gg"));
  }
}
