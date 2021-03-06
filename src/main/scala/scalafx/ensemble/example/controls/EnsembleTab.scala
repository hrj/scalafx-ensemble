/*
 * Copyright (c) 2012, ScalaFX Ensemble Project
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *     * Redistributions of source code must retain the above copyright
 *       notice, this list of conditions and the following disclaimer.
 *     * Redistributions in binary form must reproduce the above copyright
 *       notice, this list of conditions and the following disclaimer in the
 *       documentation and/or other materials provided with the distribution.
 *     * Neither the name of the ScalaFX Project nor the
 *       names of its contributors may be used to endorse or promote products
 *       derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE SCALAFX PROJECT OR ITS CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED
 * AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package scalafx.ensemble.example.controls

import scalafx.Includes._
import scalafx.ensemble.commons.EnsembleExample
import scalafx.geometry.Insets
import scalafx.scene.control.Tab
import scalafx.scene.control.TabPane
import scalafx.scene.control.TabPane.TabClosingPolicy
import scalafx.scene.layout.VBox
import scalafx.scene.text.Font
import scalafx.scene.text.Text
import scalafx.geometry.Side
import scalafx.scene.layout.Priority


class EnsembleTab extends EnsembleExample {
  def getContent = {
    new VBox {
      vgrow = Priority.ALWAYS
      hgrow = Priority.ALWAYS
      spacing = 10
      margin = Insets(50, 0, 0, 50)
      content = List(
        new Text {
          text = "Ensemble Tabs"
          font = new Font("Verdana", 20)
        },
        new TabPane {
          maxWidth = 400
          maxHeight = 150
          tabs = Seq(new Tab { text = "Tab1 - NonClosable"; closable = false }, new Tab { text = "Tab2 - NonClosable"; closable = false }, new Tab { text = "Tab3 - Closable"; closable = true })
        },
        new Text {
          text = "Ensemble Tabs - Non Closable"
          font = new Font("Verdana", 20)
        },
        new TabPane {
          maxWidth = 400
          maxHeight = 150
          tabs = Seq(new Tab { text = "Tab 1" }, new Tab { text = "Tab 2" }, new Tab { text = "Tab 3" })
          tabClosingPolicy = TabClosingPolicy.UNAVAILABLE
          side = Side.TOP
        })
    }
  }
}