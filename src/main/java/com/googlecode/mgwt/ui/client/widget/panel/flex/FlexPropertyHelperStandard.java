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
package com.googlecode.mgwt.ui.client.widget.panel.flex;

import com.google.gwt.dom.client.Element;

public class FlexPropertyHelperStandard extends FlexPropertyHelper {

  @Override
  public void _setAlignmentProperty(Element el, Alignment alignment) {
    String value;
    switch (alignment) {
      case START: {
        value = "flex-start";
        break;
      }
      case END: {
        value = "flex-end";
        break;
      }
      case CENTER: {
        value = "center";
        break;
      }
      case STRETCH: {
        value = "stretch";
        break;
      }
      case BASELINE: {
        value = "baseline";
        break;
      }
      default: {
        value = "";
      }
    }
    setStyleProperty(el, "alignItems", value);
  }

  @Override
  public void _setOrientationProperty(Element el, Orientation orientation) {
    String value;
    switch (orientation) {
      case HORIZONTAL: {
        value = "row";
        break;
      }
      case VERTICAL: {
        value = "column";
        break;
      }
      case HORIZONTAL_REVERSE: {
        value = "row-reverse";
        break;
      }
      case VERTICAL_REVERSE: {
        value = "column-reverse";
        break;
      }
      default: {
        value = "";
        break;
      }
    }
    setStyleProperty(el, "flexDirection", value);
  }

  @Override
  public void _setJustificationProperty(Element el, Justification justification) {
    String value;
    switch (justification) {
      case START: {
        value = "flex-start";
        break;
      }
      case END: {
        value = "flex-end";
        break;
      }
      case CENTER: {
        value = "center";
        break;
      }
      case SPACE_AROUND: {
        value = "space-around";
        break;
      }
      case SPACE_BETWEEN: {
        value = "space-between";
        break;
      }
      default: {
        value = "";
      }
    }
    setStyleProperty(el, "justifyContent", value);
  }

  @Override
  protected void _setAlignmentSelfProperty(Element el, AlignmentSelf alignmentSelf)
  {
    String value;
    switch (alignmentSelf) {
      case START: {
        value = "flex-start";
        break;
      }
      case END: {
        value = "flex-end";
        break;
      }
      case CENTER: {
        value = "center";
        break;
      }
      case STRETCH: {
        value = "stretch";
        break;
      }
      case BASELINE: {
        value = "baseline";
        break;
      }
      default: {
        value = "auto";
      }
    }
    setStyleProperty(el, "alignSelf", value);
  }

  @Override
  protected void _setFlexWrapProperty(Element el, FlexWrap flexWrap)
  {
    String value;
    switch (flexWrap) {
      case NOWRAP: {
        value = "nowrap";
        break;
      }
      case WRAP: {
        value = "wrap";
        break;
      }
      case WRAP_REVERSE: {
        value = "wrap-reverse";
        break;
      }
      default: {
        value = "nowrap";
        break;
      }
    }
    setStyleProperty(el, "flexWrap", value);
  }

  @Override
  protected void _setFlex(Element el, double grow, String basis) {
    setStyleProperty(el,"flex", Double.toString(grow)+" "+(basis == null ? "0%" : basis));
  }

  @Override
  protected void _setFlex(Element el, double grow, double shrink, String basis) {
    setStyleProperty(el,"flex", Double.toString(grow)+" "+Double.toString(shrink)+" "+(basis == null ? "0%" : basis));
  }

  @Override
  public void _setFlexOrder(Element el, int order) {
    setStyleProperty(el,"order", Integer.toString(order));
  }

  @Override
  protected void _setElementAsFlexContainer(Element el, Orientation orientation) {
    setStyleProperty(el,"display", "flex");
    _setOrientationProperty(el,orientation);
  }

}
