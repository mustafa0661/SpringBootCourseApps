package com.springBoot.lab7.Repository;

import com.springBoot.lab7.Veri.Ogrenci;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OgrenciRepo extends JpaRepository<Ogrenci, Long> {
}
