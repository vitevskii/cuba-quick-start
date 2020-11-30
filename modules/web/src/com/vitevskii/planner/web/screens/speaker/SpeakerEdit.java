package com.vitevskii.planner.web.screens.speaker;

import com.haulmont.cuba.gui.screen.*;
import com.vitevskii.planner.entity.Speaker;

@UiController("planner_Speaker.edit")
@UiDescriptor("speaker-edit.xml")
@EditedEntityContainer("speakerDc")
@LoadDataBeforeShow
public class SpeakerEdit extends StandardEditor<Speaker> {
}