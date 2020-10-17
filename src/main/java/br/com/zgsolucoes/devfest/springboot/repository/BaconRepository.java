package br.com.zgsolucoes.devfest.springboot.repository;

import br.com.zgsolucoes.devfest.springboot.domain.Bacon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BaconRepository extends JpaRepository<Bacon, Long> {

}
