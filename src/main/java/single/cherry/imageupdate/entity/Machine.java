package single.cherry.imageupdate.entity;

import java.util.UUID;

/**
 * 机器实体类
 * @Author: Cherry
 * @Date: 2018/11/27 9:19
 */
public class Machine {
    private int id;
    private UUID uuid;
    private String content;
    private MachineType machineType;

    public Machine() {
    }

    public Machine(UUID uuid, String content, MachineType machineType) {
        this.uuid = uuid;
        this.content = content;
        this.machineType = machineType;
    }

    public Machine(int id, UUID uuid, String content, MachineType machineType) {
        this.id = id;
        this.uuid = uuid;
        this.content = content;
        this.machineType = machineType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public MachineType getMachineType() {
        return machineType;
    }

    public void setMachineType(MachineType machineType) {
        this.machineType = machineType;
    }
}
