package org.apache.airavata.apis.db.entity.backend;

import org.apache.airavata.apis.db.entity.backend.iface.SCPInterfaceEntity;
import org.apache.airavata.apis.db.entity.backend.iface.SSHInterfaceEntity;

import javax.persistence.*;

@Entity
public class ServerBackendEntity extends ComputeBackendEntity {


    @Column
    String hostName;

    @Column
    int port;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "command_interface_id")
    SSHInterfaceEntity commandInterface;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "data_interface_id")
    SCPInterfaceEntity dataInterface;

    @Column
    String workingDirectory;

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public SSHInterfaceEntity getCommandInterface() {
        return commandInterface;
    }

    public void setCommandInterface(SSHInterfaceEntity commandInterface) {
        this.commandInterface = commandInterface;
    }

    public SCPInterfaceEntity getDataInterface() {
        return dataInterface;
    }

    public void setDataInterface(SCPInterfaceEntity dataInterface) {
        this.dataInterface = dataInterface;
    }

    public String getWorkingDirectory() {
        return workingDirectory;
    }

    public void setWorkingDirectory(String workingDirectory) {
        this.workingDirectory = workingDirectory;
    }

}