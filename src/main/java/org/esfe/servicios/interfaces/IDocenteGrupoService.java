package org.esfe.servicios.interfaces;

import org.esfe.modelos.DocenteGrupo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IDocenteGrupoService {
    List<DocenteGrupo> obtenerTodos();

    Page<DocenteGrupo> buscarTodosPaginado(Pageable pageable);

    DocenteGrupo buscarPorId (Integer id);

    DocenteGrupo crearOEditar (DocenteGrupo docenteGrupos);

    void eliminarPorId (Integer id);
}
