/*
 * Copyright 2010 Daniel Kurka
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package com.googlecode.mgwt.dom.client.event.pointer;

import com.google.gwt.core.client.JsArray;
import com.google.gwt.dom.client.Touch;
import com.google.gwt.event.dom.client.TouchMoveEvent;

/**
 * A simulated TouchMoveEvent is really a MS Pointer move event
 */
public class SimulatedTouchMoveEvent extends TouchMoveEvent {

  private final int clientX;
  private final int clientY;
  private final int pageX;
  private final int pageY;
  private int touchId;

  public SimulatedTouchMoveEvent(MsPointerMoveEvent event) {
    this.touchId = event.getPointerId();
    clientX = event.getClientX();
    clientY = event.getClientY();
    pageX = event.getScreenX();
    pageY = event.getScreenY();
    setNativeEvent(event.getNativeEvent());
    setSource(event.getSource());
  }

  @Override
  public JsArray<Touch> getChangedTouches() {
    JsArray<Touch> array = SimulatedTouch.createTouchArray();
    SimulatedTouch touch = SimulatedTouch.createTouch();
    touch.setClientX(clientX);
    touch.setClientY(clientY);
    touch.setPageX(pageX);
    touch.setPageY(pageY);
    touch.setId(touchId);
    array.push(touch);
    return array;
  }

  @Override
  public JsArray<Touch> getTouches() {
    JsArray<Touch> array = SimulatedTouch.createTouchArray();
    SimulatedTouch touch = SimulatedTouch.createTouch();
    touch.setClientX(clientX);
    touch.setClientY(clientY);
    touch.setPageX(pageX);
    touch.setPageY(pageY);
    touch.setId(touchId);
    array.push(touch);
    return array;
  }
}
