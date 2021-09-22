   
package com.cg.sprint.school.administration.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cg.sprint.school.administration.model.Notice;

@Repository
public interface NoticeRepository extends CrudRepository<Notice, Integer> {
    
//    List<Notice> findById(String noticeId);
//    
//    List<Notice> findByName(String name);
//    
//    List<Notice> findByDate(String date);
    
}