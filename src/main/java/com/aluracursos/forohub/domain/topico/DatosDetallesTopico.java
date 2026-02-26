package com.aluracursos.forohub.domain.topico;
import com.aluracursos.forohub.domain.topico.Topico;
import java.time.LocalDateTime;

public record DatosDetallesTopico(
        Long id,
        String titulo,
        String mensaje,
        LocalDateTime fechaCreacion,
        String status,
        String autor,
        String curso
) {
    public DatosDetallesTopico(Topico topico) {
        this(topico.getId(), topico.getTitulo(), topico.getMensaje(),
                topico.getFechaCreacion(), topico.getStatus().toString(),
                topico.getAutor(), topico.getCurso());
    }
}