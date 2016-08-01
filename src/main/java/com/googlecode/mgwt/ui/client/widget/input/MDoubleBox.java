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
package com.googlecode.mgwt.ui.client.widget.input;

import com.google.gwt.dom.client.Document;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.i18n.client.NumberFormat;
import com.google.gwt.text.client.DoubleParser;
import com.google.gwt.text.shared.AbstractRenderer;
import com.google.gwt.text.shared.Renderer;
import com.google.gwt.user.client.ui.ValueBox;

import com.googlecode.mgwt.ui.client.widget.base.MValueBoxBase;

/**
 * A input box that accepts doubles
 *
 * @author Daniel Kurka
 */
public class MDoubleBox extends MValueBoxBase<Double> {

  private static class SDoubleBox extends ValueBox<Double> implements HasSource {

    private Object source;

    public SDoubleBox() {
      super(Document.get().createTextInputElement(), DoubleRenderer.instance(),
            DoubleParser.instance());
      setStylePrimaryName("gwt-DoubleBox");
    }

    @Override
    protected HandlerManager createHandlerManager() {
      return new HandlerManager(source);
    }

    public void setSource(Object source) {
      this.source = source;
    }
  }

  public MDoubleBox() {
    this(InputAppearanceHolder.DEFAULT_APPEARANCE);
  }

  public MDoubleBox(InputAppearance appearance) {
    super(appearance, new SDoubleBox());
    impl.setType(box.getElement(), "number");
    addStyleName(appearance.css().textBox());
  }

  public static class DoubleRenderer extends AbstractRenderer<Double> {
    private static DoubleRenderer INSTANCE;
    private static NumberFormat formatter = NumberFormat.getFormat("#.###");

    /**
     * Returns the instance.
     */
    public static Renderer<Double> instance() {
      if (INSTANCE == null) {
        INSTANCE = new DoubleRenderer();
      }
      return INSTANCE;
    }

    protected DoubleRenderer() {
    }

    public String render(Double object) {
      if (object == null) {
        return "";
      }

      return formatter.format(object);
    }
  }
}
