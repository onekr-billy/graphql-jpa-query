package com.introproventures.graphql.jpa.query.autoconfigure;

import graphql.execution.ExecutionStrategy;
import java.util.function.Supplier;

public interface MutationExecutionStrategyProvider extends Supplier<ExecutionStrategy> {}
