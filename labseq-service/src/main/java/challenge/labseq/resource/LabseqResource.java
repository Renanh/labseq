package challenge.labseq.resource;

import challenge.labseq.service.LabseqService;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@Validated
@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
@RequiredArgsConstructor
public class LabseqResource {
    private final LabseqService labSeqService;

    @GetMapping("/{n}")
    public ResponseEntity<Integer> getValue(@PathVariable @PositiveOrZero(message = "Field N must be a positive value") Integer n) {
        return ResponseEntity.ok().body(this.labSeqService.getValue(n));
    }
}