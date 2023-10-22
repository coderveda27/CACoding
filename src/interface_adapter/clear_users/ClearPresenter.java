package interface_adapter.clear_users;

import interface_adapter.ViewManagerModel;
import interface_adapter.logged_in.LoggedInViewModel;
import use_case.clear_users.ClearOutputBoundary;
import use_case.clear_users.ClearOutputData;

// TODO Complete me

public class ClearPresenter implements ClearOutputBoundary {

    private final ClearViewModel clearViewModel;
    private final LoggedInViewModel loggedInViewModel;
    private ViewManagerModel viewManagerModel;

    public ClearPresenter(ViewManagerModel viewManagerModel,  LoggedInViewModel loggedInViewModel,
                          ClearViewModel clearViewModel) {
        this.viewManagerModel = viewManagerModel;
        this.loggedInViewModel = loggedInViewModel;
        this.clearViewModel = clearViewModel;
    }

    @Override
    public void prepareSuccessView(ClearOutputData response){
        clearViewModel.firePropertyChanged();

    }

    @Override
    public void prepareFailView(String error){
        ClearState clearState = clearViewModel.getState();
        clearState.setUsernameError(error);
        clearViewModel.firePropertyChanged();
    }

}
