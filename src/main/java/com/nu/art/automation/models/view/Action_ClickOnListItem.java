/*
 * automation is the scenario automation testing framework allowing
 * the app to record last user actions, and in case of a crash serialize
 * the scenario into a file..
 *
 * Copyright (C) 2018  Adam van der Kruk aka TacB0sS
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
package com.nu.art.automation.models.view;

import com.nu.art.automation.consts.ClickType;

import static com.nu.art.automation.consts.StepTypes.Type_ClickOnListItem;
import static com.nu.art.automation.consts.StepTypes.Type_ClickOnRecyclerItem;

public final class Action_ClickOnListItem
	extends ViewAction {

	private int position;

	private ClickType type;

	public Action_ClickOnListItem() {
		super(Type_ClickOnListItem);
	}

	public Action_ClickOnListItem(String viewConstantName, int position, ClickType type) {
		super(Type_ClickOnRecyclerItem, viewConstantName);
		this.type = type;
		this.position = position;
	}

	public final ClickType getClickType() {
		return type;
	}

	public final void setClickType(ClickType type) {
		this.type = type;
	}

	public final int getPosition() {
		return position;
	}

	public final void setPosition(int position) {
		this.position = position;
	}
}
