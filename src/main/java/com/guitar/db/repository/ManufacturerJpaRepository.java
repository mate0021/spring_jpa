package com.guitar.db.repository;

import com.guitar.db.model.Manufacturer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by mate00 on 2016-04-17.
 */
public interface ManufacturerJpaRepository extends JpaRepository<Manufacturer, Long> {
}
