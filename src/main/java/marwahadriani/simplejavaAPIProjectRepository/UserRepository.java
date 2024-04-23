package marwahadriani.simplejavaAPIProjectRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import marwahadriani.simplejavaAPIProjectEntity.user;


@Repository
public interface UserRepository extends JpaRepository<user,String> {

}
