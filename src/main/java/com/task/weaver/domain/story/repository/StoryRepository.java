package com.task.weaver.domain.story.repository;

import com.task.weaver.domain.story.entity.Story;
import com.task.weaver.domain.story.repository.dsl.StoryRepositoryDsl;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoryRepository extends JpaRepository<Story, Long>, StoryRepositoryDsl {

}
