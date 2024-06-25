package com.ne_2024.Java.Repositories;

import com.ne_2024.Java.Models.Banking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBankingRepository  extends JpaRepository<Banking, Long> {
}
