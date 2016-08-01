/*
 * Copyright 2014 Daniel Kurka
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.googlecode.mgwt.dom.client.event.touch;

import com.google.gwt.dom.client.Touch;

public class TouchCopy {

  public static TouchCopy copy(Touch touch) {
    return new TouchCopy(touch);
  }

  private final int pageX;
  private final int pageY;
  private final int clientX;
  private final int clientY;
  private final int screenX;
  private final int screenY;
  private final int id;

  public TouchCopy(int pageX, int pageY, int id) {
    this.pageX = pageX;
    this.pageY = pageY;
    this.clientX = 0;
    this.clientY = 0;
    this.screenX = 0;
    this.screenY = 0;
    this.id = id;
  }

  public TouchCopy(Touch touch) {
    this.pageX = touch.getPageX();
    this.pageY = touch.getPageY();
    this.clientX = touch.getClientX();
    this.clientY = touch.getClientY();
    this.screenX = touch.getScreenX();
    this.screenY = touch.getScreenY();
    this.id = touch.getIdentifier();
  }

  public int getPageX() {
    return pageX;
  }

  public int getPageY() {
    return pageY;
  }

  public int getClientX() {
    return clientX;
  }

  public int getClientY() {
    return clientY;
  }

  public int getScreenX() {
    return screenX;
  }

  public int getScreenY() {
    return screenY;
  }

  public int getIdentifier() {
    return id;
  }
}
