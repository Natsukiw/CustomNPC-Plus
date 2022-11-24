//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package noppes.npcs.scripted.event;

import cpw.mods.fml.common.eventhandler.Cancelable;
import cpw.mods.fml.common.eventhandler.Event;
import noppes.npcs.api.AbstractNpcAPI;
import noppes.npcs.api.IPos;
import noppes.npcs.api.handler.data.INaturalSpawn;

public class CustomNPCsEvent extends Event implements noppes.npcs.api.event.CustomNPCsEvent {
    public final AbstractNpcAPI API = AbstractNpcAPI.Instance();

    public CustomNPCsEvent() {
    }

    public void setCancelled(boolean bo){
        this.setCanceled(bo);
    }

    public boolean isCancelled(){return this.isCanceled();}

    @Cancelable
    public static class CNPCNaturalSpawnEvent extends CustomNPCsEvent implements noppes.npcs.api.event.CustomNPCsEvent.CNPCNaturalSpawnEvent {
        public final INaturalSpawn naturalSpawn;
        public final IPos attemptPosition;
        public final boolean animalSpawnPassed;
        public final boolean monsterSpawnPassed;
        public final boolean liquidSpawnPassed;
        public final boolean airSpawnPassed;

        public CNPCNaturalSpawnEvent(INaturalSpawn naturalSpawn, IPos attemptPosition, boolean animalSpawnPassed, boolean monsterSpawnPassed, boolean liquidSpawnPassed, boolean airSpawnPassed) {
            this.naturalSpawn = naturalSpawn;
            this.attemptPosition = attemptPosition;

            this.animalSpawnPassed = animalSpawnPassed;
            this.monsterSpawnPassed = monsterSpawnPassed;
            this.liquidSpawnPassed = liquidSpawnPassed;
            this.airSpawnPassed = airSpawnPassed;
        }

        public INaturalSpawn getNaturalSpawn() {
            return this.naturalSpawn;
        }

        public IPos getAttemptPosition() {
            return this.attemptPosition;
        }

        public boolean animalSpawnPassed() {
            return this.animalSpawnPassed;
        }

        public boolean monsterSpawnPassed() {
            return this.monsterSpawnPassed;
        }

        public boolean liquidSpawnPassed() {
            return this.liquidSpawnPassed;
        }

        public boolean airSpawnPassed() {
            return this.airSpawnPassed;
        }
    }
}
