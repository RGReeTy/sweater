package com.example.sweater.repos;

import com.example.sweater.domain.Message;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * The interface Message repo.
 */
public interface MessageRepo extends CrudRepository<Message, Long> {

    /**
     * Find by tag list.
     *
     * @param tag the tag
     * @return the list
     */
    List<Message> findByTag(String tag);
}
