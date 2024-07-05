package ru.yandex.practicum.contacts.presentation.filter;

import java.util.Collections;
import java.util.Set;

import ru.yandex.practicum.contacts.model.ContactType;

class FilterContactUiState {
    private boolean isApplyEnable = false;
    private Set<ContactType> newSelectedContactTypes = Collections.emptySet();


    public boolean getIsApplyEnable() {return isApplyEnable; }

    public void setIsApplyEnable(final boolean applyEnable) {isApplyEnable = applyEnable; }

    public Set<ContactType> getNewSelectedContactTypes() { return newSelectedContactTypes; }

    public void setNewSelectedContactTypes(final Set<ContactType> SelectedContactTypes ) { newSelectedContactTypes = SelectedContactTypes; }
}