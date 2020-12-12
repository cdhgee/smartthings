/**
 *  MyQ Virtual Contact Sensor and Switch
 *
 *  Copyright 2020 David Gee
 *
 *  Licensed under the GNU General Public License v3.0 (the "License"); you may not use this file except
 *  in compliance with the License. You may obtain a copy of the License at:
 *
 *      https://www.gnu.org/licenses/gpl-3.0.en.html
 *
 *  Unless required by applicable law or agreed to in writing, software distributed under the License is distributed
 *  on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License
 *  for the specific language governing permissions and limitations under the License.
 */
metadata {
  definition (name: "MyQ Virtual Contact Sensor and Switch", namespace: "cdhgee", author: "David Gee", cstHandler: true) {
    capability "Contact Sensor"
    capability "Switch"
  }


  simulator {
    // TODO: define status and reply messages here
  }

  tiles {
    // TODO: define your main and details tiles here
  }
}

// parse events into attributes
def parse(String description) {
  log.debug "Parsing '${description}'"
  // TODO: handle 'contact' attribute
  // TODO: handle 'switch' attribute

}

// handle commands

def on() {

  log.debug "Turning Switch and Sensor On"

  sendEvent(name: "switch", value: "on", isStateChange: true, display: true, displayed: true)

  sendEvent(name: "contact", value: "open", isStateChange: true, display: true, displayed: true)

}

def off() {

  log.debug "Turning Switch and Sensor Off"

  sendEvent(name: "switch", value: "off", isStateChange: true, display: true, displayed: true)

  sendEvent(name: "contact", value: "closed", isStateChange: true, display: true, displayed: true)

}
