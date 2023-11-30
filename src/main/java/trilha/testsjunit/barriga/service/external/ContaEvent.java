package trilha.testsjunit.barriga.service.external;

import trilha.testsjunit.barriga.domain.Conta;

public interface ContaEvent {
    public enum EventType {CREATED, UPDATED, DELETED}

    void dispatch(Conta conta, EventType type) throws Exception;
}
