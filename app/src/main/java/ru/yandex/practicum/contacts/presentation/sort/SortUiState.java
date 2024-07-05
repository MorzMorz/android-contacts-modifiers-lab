package ru.yandex.practicum.contacts.presentation.sort;

class SortUiState {

    private boolean isApplyEnable = false;
    private String newSelectedSortType = null;

    public boolean getApplyEnable() {
        return isApplyEnable;
    }

    public void setApplyEnable(final boolean applyEnable) {
        isApplyEnable = applyEnable;
    }

    public String getNewSelectedSortType() {
        return newSelectedSortType;
    }

    public void setNewSelectedSortType(final String newSelectedSortType) {
        this.newSelectedSortType = newSelectedSortType;
    }
}



