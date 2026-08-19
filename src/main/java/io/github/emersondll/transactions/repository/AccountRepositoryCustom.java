package io.github.vagner23.transactions.repository;

import io.github.vagner23.transactions.document.AccountDocument;

/**
 * Custom extension interface for account-specific query operations.
 *
 * <p>Defines query methods that go beyond the standard Spring Data
 * CRUD operations. Implemented automatically by Spring Data MongoDB
 * when combined with {@link AccountRepository}.</p>
 *
 * @author Vagner Cardoso
 * @since 1.0.0
 */
public interface AccountRepositoryCustom {

    /**
     * Finds the account associated with the given document number.
     *
     * @param documentNumber the customer's document number to search (non-null)
     * @return the matching {@link AccountDocument}, or {@code null} if not found
     */
    AccountDocument findByDocumentNumber(String documentNumber);
}

