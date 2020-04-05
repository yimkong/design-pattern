package observer;

/**
 * author yg
 * description 主题
 * date 2020/4/5
 */
public interface Subject {
    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObserver();
}
