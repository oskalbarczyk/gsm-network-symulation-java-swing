package InterfaceLink;

import Logic.Message;
import Logic.Station;


public interface VBDlink {
    int randomVRD();

    void sendMessage(Message message);

    Station findMostEmptyStation();

    void setMessage(Message message);

    void setFrequency(int frequency);

    void setIsWorking(boolean working);

    void setIsWaiting(boolean waiting);

    Message getMessage();

    int getFrequency();

    int getID();

}
