package challenge.labseq.service;

import challenge.labseq.cache.Cache;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;


@Slf4j
@Service
@RequiredArgsConstructor
public class LabseqService {

    @Value("#{'${config.labseq.default-value-zero}'.split(',')}")
    private final List<Integer> defaultValueZero;

    @Value("#{'${config.labseq.default-value-one}'.split(',')}")
    private final List<Integer> defaultValueOne;

    private final Cache cache;

    public int getValue(int n) {
        if (this.cache.containsKey(n)) {
            return this.cache.get(n);
        }

        if (this.defaultValueZero.contains(n)) {
            return 0;
        } else if (this.defaultValueOne.contains(n)) {
            return 1;
        } else {
            int result = this.getValue(n - 4) + this.getValue(n - 3);
            cache.put(n, result);
            return result;
        }
    }
}