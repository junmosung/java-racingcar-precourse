package racingcar.item;

import java.util.*;

import static camp.nextstep.edu.missionutils.Randoms.pickNumberInRange;

/**
 * Created by victorsung.
 * Date: 2022/04/25
 * Time: 8:40 PM
 */
public class Car {

    private String name;

    private Map<Integer, CarStatus> status = new HashMap<>();

    public Car(String name, int input) {
        this.name = name;
        for (int i = 0; i < input; i++) {
            this.status.put(i, carStatusSetting());
        }

    }

    private CarStatus carStatusSetting() {
        if (pickNumberInRange(0, 9) >= 4) {
            return CarStatus.GO;
        }
        return CarStatus.STOP;
    }

    public String getName() {
        return name;
    }

    public Map<Integer, CarStatus> getStatus() {
        return status;
    }
}
