package com.vinaylogics.playwithjava.designpatterns.behavioral.command;

public class StereoOnWithCDCommand implements Command {
    Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
        stereo.setCD();
        stereo.setVolume(11);
    }
}
