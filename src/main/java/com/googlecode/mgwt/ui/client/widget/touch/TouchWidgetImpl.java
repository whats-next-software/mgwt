/*
 * Copyright 2011 Daniel Kurka
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
package com.googlecode.mgwt.ui.client.widget.touch;

import com.google.gwt.event.dom.client.TouchCancelHandler;
import com.google.gwt.event.dom.client.TouchEndHandler;
import com.google.gwt.event.dom.client.TouchMoveHandler;
import com.google.gwt.event.dom.client.TouchStartHandler;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.user.client.ui.Widget;
import com.googlecode.mgwt.dom.client.event.touch.TouchHandler;

/**
 * The touch widget interface is used to abstract implementation details for
 * adding touch handlers on touch devices / mouse devices
 *
 * @author Daniel Kurka
 */
public interface TouchWidgetImpl {

	/**
	 * Add a touch start handler to a widget
	 *
	 * @param w the widget that the handler should be added to
	 * @param handler the handler to add
	 * @return the handlerregistration
	 */
	public abstract HandlerRegistration addTouchStartHandler(Widget w, TouchStartHandler handler);

	/**
	 * Add a touch move handler to a widget
	 *
	 * @param w the widget that the handler should be added to
	 * @param handler the handler to add
	 * @return the handlerregistration
	 */
	public abstract HandlerRegistration addTouchMoveHandler(Widget w, TouchMoveHandler handler);

	/**
	 * Add a touch cancel handler to a widget
	 *
	 * @param w the widget that the handler should be added to
	 * @param handler the handler to add
	 * @return the handlerregistration
	 */
	public abstract HandlerRegistration addTouchCancelHandler(Widget w, TouchCancelHandler handler);

	/**
	 * Add a touch end handler to a widget
	 *
	 * @param w the widget that the handler should be added to
	 * @param handler the handler to add
	 * @return the handlerregistration
	 */
	public abstract HandlerRegistration addTouchEndHandler(Widget w, TouchEndHandler handler);

  public abstract HandlerRegistration addTouchHandler(Widget w, TouchHandler handler);
}
