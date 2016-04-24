package com.guitar.db.repository;

import com.guitar.db.model.Model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by mate00 on 2016-04-17.
 */
public interface ModelJpaRepository extends JpaRepository<Model, Long> {

    @Query("select m from Model m where m.price >= :lowest and m.price <= :highest and m.woodType like :wood")
    List<Model> queryByPriceRangeAndWoodType(@Param("lowest")BigDecimal lowest,
                                             @Param("highest")BigDecimal highest,
                                             @Param("wood") String wood);
}
