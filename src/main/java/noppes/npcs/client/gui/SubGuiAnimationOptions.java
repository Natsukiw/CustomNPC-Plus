package noppes.npcs.client.gui;

import net.minecraft.client.gui.GuiButton;
import noppes.npcs.client.gui.util.GuiNpcButton;
import noppes.npcs.client.gui.util.GuiNpcLabel;
import noppes.npcs.client.gui.util.SubGuiInterface;
import noppes.npcs.controllers.data.Animation;

public class SubGuiAnimationOptions extends SubGuiInterface {
    private final Animation animation;

    public SubGuiAnimationOptions(Animation animation) {
        this.animation = animation;
    }

    @Override
    public void initGui() {
        super.initGui();
        //
        //ticks - button
        this.addLabel(new GuiNpcLabel(10, "animation.tickType", guiLeft, guiTop + 86, 0xFFFFFF));
        this.addButton(new GuiNpcButton(10, guiLeft + 55, guiTop + 80, 75, 20, new String[]{"animation.renderTicks", "animation.mcTicks"}, animation.renderTicks ? 0 : 1));
        //
        //whileStanding - button
        this.addLabel(new GuiNpcLabel(11, "animation.whileStanding", guiLeft, guiTop + 106, 0xFFFFFF));
        this.addButton(new GuiNpcButton(11, guiLeft + 75, guiTop + 100, 30, 20, new String[]{"gui.yes", "gui.no"}, animation.whileStanding ? 0 : 1));
        //
        //whileAttacking - button
        this.addLabel(new GuiNpcLabel(12, "animation.whileAttacking", guiLeft, guiTop + 126, 0xFFFFFF));
        this.addButton(new GuiNpcButton(12, guiLeft + 75, guiTop + 120, 30, 20, new String[]{"gui.yes", "gui.no"}, animation.whileAttacking ? 0 : 1));
        //
        //whileMoving - button
        this.addLabel(new GuiNpcLabel(13, "animation.whileMoving", guiLeft, guiTop + 146, 0xFFFFFF));
        this.addButton(new GuiNpcButton(13, guiLeft + 75, guiTop + 140, 30, 20, new String[]{"gui.yes", "gui.no"}, animation.whileMoving ? 0 : 1));
    }

    @Override
    protected void actionPerformed(GuiButton guibutton) {
        super.actionPerformed(guibutton);
        int value = ((GuiNpcButton)guibutton).getValue();

        if (guibutton.id == 10) {
            animation.renderTicks = value == 0;
        } else if (guibutton.id == 11) {
            animation.whileStanding = value == 0;
        } else if (guibutton.id == 12) {
            animation.whileAttacking = value == 0;
        } else if (guibutton.id == 13) {
            animation.whileMoving = value == 0;
        }
    }
}