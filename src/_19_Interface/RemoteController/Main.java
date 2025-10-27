package _19_Interface.RemoteController;

public class Main {
    public static void main(String[] args) {
        TvRemoteController tvRemoteController = new TvRemoteController(new PowerButton(), new VolumeUpButton(), new VolumeDownButton(), new ChannelUpButton(), new ChannelDownButton());
        tvRemoteController.onPressedPowerButton();
        tvRemoteController.onDownChannelDownButton();
        tvRemoteController.onPressedPowerButton();
        tvRemoteController.onDownVolumeDownButton();
        tvRemoteController.onPressedPowerButton();

        PowerButton powerButton = new PowerButton();
        powerButton.onPressed();
        powerButton.onPressed();
    }
}
