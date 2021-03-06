package com.jaeyeon.studyolle.modules.study.event;

import com.jaeyeon.studyolle.modules.study.Study;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class StudyCreatedEvent {

    private final Study study;
}
