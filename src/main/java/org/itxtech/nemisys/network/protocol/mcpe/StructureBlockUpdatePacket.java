package org.itxtech.nemisys.network.protocol.mcpe;

public class StructureBlockUpdatePacket extends DataPacket {

    @Override
    public byte pid() {
        return ProtocolInfo.STRUCTURE_BLOCK_UPDATE_PACKET;
    }

    @Override
    public void decode() {

    }

    @Override
    public void encode() {
        //TODO
    }
}
