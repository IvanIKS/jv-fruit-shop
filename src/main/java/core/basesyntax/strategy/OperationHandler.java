package core.basesyntax.strategy;

import core.basesyntax.db.Storage;
import core.basesyntax.model.FruitTransaction;

public interface OperationHandler {
    void handle(Storage storage, FruitTransaction transaction);
}
