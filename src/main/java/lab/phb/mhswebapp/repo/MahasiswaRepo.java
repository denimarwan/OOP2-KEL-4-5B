package lab.phb.mhswebapp.repo;

import lab.phb.mhswebapp.entity.Barang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MahasiswaRepo 
        extends JpaRepository<Barang,String>{
}
